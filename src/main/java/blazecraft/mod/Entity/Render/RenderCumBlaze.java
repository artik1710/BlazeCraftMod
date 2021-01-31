package blazecraft.mod.Entity.Render;

import blazecraft.mod.Entity.CumBlaze;
import blazecraft.mod.Entity.model.ModelGayBlaze;
import blazecraft.mod.util.handlers.MainRegistry;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCumBlaze extends RenderLiving<CumBlaze>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(MainRegistry.MODID + ":textures/entity/cumBlaze.png"); 
	
	public RenderCumBlaze(RenderManager manager) {
		super(manager, new ModelGayBlaze(), 0.5f);
	
	}
@Override
protected ResourceLocation getEntityTexture(CumBlaze entity) {
	return TEXTURES;
}
@Override
protected void applyRotations(CumBlaze entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {

	super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
}
}


