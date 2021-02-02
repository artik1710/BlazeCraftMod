package blazecraft.mod.Entity.Render;

import blazecraft.mod.Entity.CumBlaze;
import blazecraft.mod.Entity.ToxicBlaze;
import blazecraft.mod.Entity.model.ModelGayBlaze;
import blazecraft.mod.util.handlers.MainRegistry;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderToxicBlaze extends RenderLiving<ToxicBlaze>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(MainRegistry.MODID + ":textures/entity/toxic_blaze.png"); //נוםהונטל njrcכויחא)
	
	public RenderToxicBlaze(RenderManager manager) {
		super(manager, new ModelGayBlaze(), 0.5f);
	
	}
@Override
protected ResourceLocation getEntityTexture(ToxicBlaze entity) {
	return TEXTURES;
}
@Override
protected void applyRotations(ToxicBlaze entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {

	super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
}
}


