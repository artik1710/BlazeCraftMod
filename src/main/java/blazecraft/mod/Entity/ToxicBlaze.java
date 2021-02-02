package blazecraft.mod.Entity;

import blazecraft.mod.Entity.projectiles.BaseBlazeBall;
import blazecraft.mod.Entity.projectiles.ToxicBall;
import net.minecraft.entity.Entity;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.World;

public class ToxicBlaze extends CumBlaze{

	public ToxicBlaze(World worldIn) {
		super(worldIn); //когда-то тут будет токсик блейз
	//	this.imm
	}

	@Override
	public  Entity SetProjectile(World world, CumBlaze blaze2, double d, double d2, double e) {
		ToxicBall entitysmallfireball = new ToxicBall(world,blaze2,d,d2,e);
		return entitysmallfireball;
		}
	public boolean isPotionApplicable(PotionEffect potioneffectIn)
    {
        if(potioneffectIn.getPotion() == MobEffects.POISON)
        {
        	net.minecraftforge.event.entity.living.PotionEvent.PotionApplicableEvent event = new net.minecraftforge.event.entity.living.PotionEvent.PotionApplicableEvent(this, potioneffectIn);
        	net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event);
        	return event.getResult() == net.minecraftforge.fml.common.eventhandler.Event.Result.ALLOW;
        }	
        return super.isPotionApplicable(potioneffectIn);
    }
}
