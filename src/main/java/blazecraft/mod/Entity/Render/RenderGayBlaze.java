package blazecraft.mod.Entity.Render;

import blazecraft.mod.Entity.GayBlaze;
import blazecraft.mod.Entity.model.ModelGayBlaze;
import blazecraft.mod.util.handlers.MainRegistry;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGayBlaze extends RenderLiving<GayBlaze>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(MainRegistry.MODID + ":textures/entity/GayBlaze.png"); 
	
	public RenderGayBlaze(RenderManager manager) {
		super(manager, new ModelGayBlaze(), 0.5f);
	
	}
@Override
protected ResourceLocation getEntityTexture(GayBlaze entity) {
	return TEXTURES;
}
@Override
protected void applyRotations(GayBlaze entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {

	super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
}
}


