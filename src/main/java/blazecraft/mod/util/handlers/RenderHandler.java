package blazecraft.mod.util.handlers;

import blazecraft.mod.Entity.CumBlaze;
import blazecraft.mod.Entity.Render.RenderCumBlaze;
import blazecraft.mod.Entity.projectiles.BaseBlazeBall;
import blazecraft.mod.Entity.Render.BlazeBallRender;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders() 
	{
		RenderingRegistry.registerEntityRenderingHandler(CumBlaze.class, new IRenderFactory<CumBlaze>() {
			
			@Override
			public Render<? super CumBlaze> createRenderFor(RenderManager manager) {
				return new RenderCumBlaze(manager);
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