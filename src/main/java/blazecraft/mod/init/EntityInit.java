package blazecraft.mod.init;

import blazecraft.mod.Entity.CumBlaze;
import blazecraft.mod.Entity.ToxicBlaze;
import blazecraft.mod.Entity.projectiles.SmallCumBall;
import blazecraft.mod.Entity.projectiles.ToxicBall;
import blazecraft.mod.util.handlers.MainRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {		//������ ������ ������ �� ������, ������ ��� ��-������� �������
	public static void registerEntities() {
	registerEntity("cumblaze",CumBlaze.class ,1488,50,15657710,00000000);
	registerEntity("toxicblaze",ToxicBlaze.class ,1490,50,65280,5832542);
	registerItemEntity("cumball",SmallCumBall.class,1489,50);
	registerItemEntity("toxicball",ToxicBall.class,1451,50);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int Id, int range, int color1, int color2) {
		
	EntityRegistry.registerModEntity(new ResourceLocation(MainRegistry.MODID + ":" + name), entity, name, Id, MainRegistry.instance, range, 1, true, color1, color2);
	
	}
	private static void registerItemEntity(String name, Class<? extends Entity> entity, int Id, int range)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(MainRegistry.MODID + ":" + name), entity, name,Id, MainRegistry.instance,range,1, true) ;
	}
}
