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
public class SmallCumBall  extends BaseBlazeBall{

	public SmallCumBall(World worldIn) {
		super(worldIn);
		this.setSize(0.3F, 0.3F);
	
	}
	public SmallCumBall(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
		super(worldIn, shooter, accelX, accelY, accelZ);
		this.setSize(0.3F, 0.3F);
	}
	public SmallCumBall(World worldIn,double x, double y, double z, double accelX, double accelY, double accelZ) {
		super(worldIn, x, y, z, accelX, accelY, accelZ);
		super.setSize(0.3F, 0.3F);
	}
	 public static void registerFixesSmallFireball(DataFixer fixer)
	    {
	        BaseBlazeBall.registerFixesFireball(fixer, "cumball");
	        
	    }

	 protected void onImpact(RayTraceResult result)
	    {
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
	                        ((EntityLivingBase)result.entityHit).addPotionEffect(new PotionEffect(Potion.getPotionById(2), 700, 1));
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

	    public boolean canBeCollidedWith()
	    {
	        return false;
	    }

	    public boolean attackEntityFrom(DamageSource source, float amount)
	    {
	        return false;
	    
	}
		
}
