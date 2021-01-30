package blazecraft.mod.init;

import blazecraft.mod.Entity.GayBlaze;
import blazecraft.mod.Entity.projectiles.SmallCumBall;
import blazecraft.mod.util.handlers.MainRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	public static void registerEntities() {
	registerEntity("gayblaze",GayBlaze.class ,1488,50,15657710,00000000);
	registerItemEntity("cumball",SmallCumBall.class,1489,50);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int Id, int range, int color1, int color2) {
		
	EntityRegistry.registerModEntity(new ResourceLocation(MainRegistry.MODID + ":" + name), entity, name, Id, MainRegistry.instance, range, 1, true, color1, color2);
	
	}
	private static void registerItemEntity(String name, Class<? extends Entity> entity, int Id, int range)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(MainRegistry.MODID + ":" + name), entity, name,Id, MainRegistry.instance,range,1, true) ;
	}
}
