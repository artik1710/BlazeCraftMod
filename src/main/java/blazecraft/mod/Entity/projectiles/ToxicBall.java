package blazecraft.mod.Entity.projectiles;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ToxicBall extends BaseBlazeBall{

	public ToxicBall(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}
	public ToxicBall(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onImpact(RayTraceResult result) {
		// TODO Auto-generated method stub
		
	}

}
