package blazecraft.mod.Entity.projectiles;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ToxicBall extends BaseBlazeBall{

	public ToxicBall(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}
	public ToxicBall(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
		super(worldIn,shooter , accelX, accelY, accelZ);
		this.setSize(0.5F,0.5F);
	}

	@Override
	protected void onImpact(RayTraceResult result) {
		if (!this.world.isRemote)
        {
            if (result.entityHit != null)
            {

                    boolean flag = result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.shootingEntity), 3.0F);

                    if (flag)
                    {
                        this.applyEnchantments(this.shootingEntity, result.entityHit);
                        result.entityHit.addVelocity(0.0D, 0.3D, 0.0D);
                        //result.entityHit.isEntityEqual(Minecraft.getMinecraft().player)
                        ((EntityLivingBase)result.entityHit).addPotionEffect(new PotionEffect(Potion.getPotionById(19), 200, 0));
                        ((EntityLivingBase)result.entityHit).addPotionEffect(new PotionEffect(Potion.getPotionById(9), 300, 0));
                    }
  
            }
            else
            {
                boolean flag1 = true;

                if (this.shootingEntity != null && this.shootingEntity instanceof EntityLiving)
                {
                    flag1 = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this.shootingEntity);
                }

                if (flag1)
                {
                    BlockPos blockpos = result.getBlockPos().offset(result.sideHit);

                    if (this.world.isAirBlock(blockpos))
                    {
                        this.world.setBlockState(blockpos, Blocks.WEB.getDefaultState());
                    }
                }
            }

            this.setDead();
        }
	}
	
	
	 
    public static void registerFixesSmallFireball(DataFixer fixer)
{
    BaseBlazeBall.registerFixesFireball(fixer, "toxicball");
    
}
    public boolean canBeCollidedWith()
    {
        return false;
    }

    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        return false;
    
}
}
