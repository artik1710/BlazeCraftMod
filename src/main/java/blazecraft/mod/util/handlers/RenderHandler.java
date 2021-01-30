package blazecraft.mod.util.handlers;

import blazecraft.mod.Entity.GayBlaze;
import blazecraft.mod.Entity.Render.RenderGayBlaze;
import blazecraft.mod.Entity.projectiles.BaseBlazeBall;
import blazecraft.mod.Entity.Render.BlazeBallRender;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders() 
	{
		RenderingRegistry.registerEntityRenderingHandler(GayBlaze.class, new IRenderFactory<GayBlaze>() {
			
			@Override
			public Render<? super GayBlaze> createRenderFor(RenderManager manager) {
				return new RenderGayBlaze(manager);
			}
		});
	}
	
	public static void registerIntemEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(BaseBlazeBall.class, new IRenderFactory<BaseBlazeBall>() {
			@Override
			public Render<? super BaseBlazeBall> createRenderFor(RenderManager manager){
			return new BlazeBallRender(manager, 1F);
			}
			
		});
	}
}