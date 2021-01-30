package blazecraft.mod.Entity;

import blazecraft.mod.Entity.projectiles.SmallCumBall;
import blazecraft.mod.util.handlers.LootTableHandler;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class GayBlaze extends EntityBlaze {

	public GayBlaze(World worldIn) {
		super(worldIn);
	}
	
@Override
protected void initEntityAI() {
this.tasks.addTask(4, new EntityAIWanderAvoidWater(this, 1.0D));
this.tasks.addTask(5, new EntityAIEatGrass(this));
this.tasks.addTask(6, new EntityAILookIdle(this));
//this.tasks.addTask(1, new EntityAIAttackMelee(this, 2.0D, false));
this.tasks.addTask(1, new GayBlaze.CumballAttack(this));
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityCreature.class, true));

	}
	
	
@Override
protected ResourceLocation getLootTable() {
	return LootTableHandler.GAYBLAZE;
}


	
static class CumballAttack extends EntityAIBase
{
    private final GayBlaze blaze;
    private int attackStep;
    private int attackTime;
    
    public CumballAttack(GayBlaze blazeIn)
    {
        this.blaze = blazeIn;
        this.setMutexBits(3);
    }

    public boolean shouldExecute()
    {
        EntityLivingBase entitylivingbase = this.blaze.getAttackTarget();
        return entitylivingbase != null && entitylivingbase.isEntityAlive();
    }

    public void startExecuting()
    {
        this.attackStep = 0;
    }

    public void resetTask()
    {
        this.blaze.setOnFire(false);
    }

    public void updateTask()
    {
        --this.attackTime;
        EntityLivingBase entitylivingbase = this.blaze.getAttackTarget();
        double d0 = this.blaze.getDistanceSq(entitylivingbase);

        if (d0 < 4.0D)
        {
            if (this.attackTime <= 0)
            {
                this.attackTime = 20;
                this.blaze.attackEntityAsMob(entitylivingbase);
            }

            this.blaze.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
        }
        else if (d0 < this.getFollowDistance() * this.getFollowDistance())
        {
            double d1 = entitylivingbase.posX - this.blaze.posX;
            double d2 = entitylivingbase.getEntityBoundingBox().minY + (double)(entitylivingbase.height / 2.0F) - (this.blaze.posY + (double)(this.blaze.height / 2.0F));
            double d3 = entitylivingbase.posZ - this.blaze.posZ;

            if (this.attackTime <= 0)
            {
                ++this.attackStep;

                if (this.attackStep == 1)
                {
                    this.attackTime = 60;
                    this.blaze.setOnFire(true);
                }
                else if (this.attackStep <= 4)
                {
                    this.attackTime = 6;
                }
                else
                {
                    this.attackTime = 100;
                    this.attackStep = 0;
                    this.blaze.setOnFire(false);
                }

                if (this.attackStep > 1)
                {
                    float f = MathHelper.sqrt(MathHelper.sqrt(d0)) * 0.5F;
                    this.blaze.world.playEvent((EntityPlayer)null, 1018, new BlockPos((int)this.blaze.posX, (int)this.blaze.posY, (int)this.blaze.posZ), 0);

                    for (int i = 0; i < 1; ++i)
                    {
                    	SmallCumBall entitysmallfireball = new SmallCumBall(this.blaze.world, this.blaze, d1 + this.blaze.getRNG().nextGaussian() * (double)f, d2, d3 + this.blaze.getRNG().nextGaussian() * (double)f);
                        entitysmallfireball.posY = this.blaze.posY + (double)(this.blaze.height / 2.0F) + 0.5D;
                        this.blaze.world.spawnEntity(entitysmallfireball);
                    }
                }
            }

            this.blaze.getLookHelper().setLookPositionWithEntity(entitylivingbase, 10.0F, 10.0F);
        }
        else
        {
            this.blaze.getNavigator().clearPath();
            this.blaze.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
        }

        super.updateTask();
    }

    private double getFollowDistance()
    {
        IAttributeInstance iattributeinstance = this.blaze.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE);
        return iattributeinstance == null ? 16.0D : iattributeinstance.getAttributeValue();
    }
}

	

	
	

}

