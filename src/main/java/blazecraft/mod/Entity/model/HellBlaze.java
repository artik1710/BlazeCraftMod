package blazecraft.mod.Entity.model;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelBlaze - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class HellBlaze extends ModelBase {
    public ModelRenderer Hand;
    public ModelRenderer Hand1;
    public ModelRenderer Hand2;
    public ModelRenderer Hand3;
    public ModelRenderer Hand4;
    public ModelRenderer HeadBlaze;
    public ModelRenderer Hand5;
    public ModelRenderer Hand6;
    public ModelRenderer Hand7;
    public ModelRenderer Hand8;
    public ModelRenderer Hand9;
    public ModelRenderer Hand10;
    public ModelRenderer Hand11;
    public ModelRenderer RogL;
    public ModelRenderer RogR;
    public ModelRenderer RogR_1;
    public ModelRenderer RogL1;

    public HellBlaze() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Hand1 = new ModelRenderer(this, 0, 16);
        this.Hand1.setRotationPoint(-2.27F, 11.89F, 4.46F);
        this.Hand1.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.Hand8 = new ModelRenderer(this, 0, 16);
        this.Hand8.setRotationPoint(-9.0F, -1.46F, 0.0F);
        this.Hand8.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.Hand2 = new ModelRenderer(this, 0, 16);
        this.Hand2.setRotationPoint(9.0F, -1.0F, 0.0F);
        this.Hand2.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.RogL = new ModelRenderer(this, 0, 0);
        this.RogL.setRotationPoint(4.0F, -2.1F, 0.8F);
        this.RogL.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.3F);
        this.setRotateAngle(RogL, 3.141592653589793F, 0.0F, 0.0F);
        this.RogR_1 = new ModelRenderer(this, 0, 0);
        this.RogR_1.setRotationPoint(-4.2F, -4.7F, 0.2F);
        this.RogR_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RogR_1, 0.0F, 0.0F, -2.4797638012335437F);
        this.RogL1 = new ModelRenderer(this, 0, 0);
        this.RogL1.setRotationPoint(5.0F, -5.3F, -0.2F);
        this.RogL1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RogL1, 0.0F, -0.022689280275926284F, -3.5660567276748143F);
        this.Hand6 = new ModelRenderer(this, 0, 16);
        this.Hand6.setRotationPoint(4.95F, 1.06F, -4.95F);
        this.Hand6.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.Hand10 = new ModelRenderer(this, 0, 16);
        this.Hand10.setRotationPoint(4.95F, 1.58F, 4.95F);
        this.Hand10.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.Hand5 = new ModelRenderer(this, 0, 16);
        this.Hand5.setRotationPoint(-4.95F, 1.01F, -4.95F);
        this.Hand5.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.Hand4 = new ModelRenderer(this, 0, 16);
        this.Hand4.setRotationPoint(2.27F, 10.61F, -4.46F);
        this.Hand4.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.Hand7 = new ModelRenderer(this, 0, 16);
        this.Hand7.setRotationPoint(4.46F, 11.96F, 2.27F);
        this.Hand7.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.Hand9 = new ModelRenderer(this, 0, 16);
        this.Hand9.setRotationPoint(0.0F, -1.93F, -9.0F);
        this.Hand9.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.Hand = new ModelRenderer(this, 0, 16);
        this.Hand.setRotationPoint(-4.46F, 11.35F, -2.27F);
        this.Hand.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.Hand3 = new ModelRenderer(this, 0, 16);
        this.Hand3.setRotationPoint(0.0F, -1.12F, 9.0F);
        this.Hand3.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.Hand11 = new ModelRenderer(this, 0, 16);
        this.Hand11.setRotationPoint(-4.95F, 1.2F, 4.95F);
        this.Hand11.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.HeadBlaze = new ModelRenderer(this, 0, 0);
        this.HeadBlaze.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadBlaze.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F);
        this.RogR = new ModelRenderer(this, 0, 0);
        this.RogR.setRotationPoint(-4.9F, -2.1F, 0.8F);
        this.RogR.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.3F);
        this.setRotateAngle(RogR, 3.141592653589793F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Hand1.render(f5);
        this.Hand8.render(f5);
        this.Hand2.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.RogL.offsetX, this.RogL.offsetY, this.RogL.offsetZ);
        GlStateManager.translate(this.RogL.rotationPointX * f5, this.RogL.rotationPointY * f5, this.RogL.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.2D, 1.0D);
        GlStateManager.translate(-this.RogL.offsetX, -this.RogL.offsetY, -this.RogL.offsetZ);
        GlStateManager.translate(-this.RogL.rotationPointX * f5, -this.RogL.rotationPointY * f5, -this.RogL.rotationPointZ * f5);
        this.RogL.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.RogR_1.offsetX, this.RogR_1.offsetY, this.RogR_1.offsetZ);
        GlStateManager.translate(this.RogR_1.rotationPointX * f5, this.RogR_1.rotationPointY * f5, this.RogR_1.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.2D, 1.0D);
        GlStateManager.translate(-this.RogR_1.offsetX, -this.RogR_1.offsetY, -this.RogR_1.offsetZ);
        GlStateManager.translate(-this.RogR_1.rotationPointX * f5, -this.RogR_1.rotationPointY * f5, -this.RogR_1.rotationPointZ * f5);
        this.RogR_1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.RogL1.offsetX, this.RogL1.offsetY, this.RogL1.offsetZ);
        GlStateManager.translate(this.RogL1.rotationPointX * f5, this.RogL1.rotationPointY * f5, this.RogL1.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.2D, 1.0D);
        GlStateManager.translate(-this.RogL1.offsetX, -this.RogL1.offsetY, -this.RogL1.offsetZ);
        GlStateManager.translate(-this.RogL1.rotationPointX * f5, -this.RogL1.rotationPointY * f5, -this.RogL1.rotationPointZ * f5);
        this.RogL1.render(f5);
        GlStateManager.popMatrix();
        this.Hand6.render(f5);
        this.Hand10.render(f5);
        this.Hand5.render(f5);
        this.Hand4.render(f5);
        this.Hand7.render(f5);
        this.Hand9.render(f5);
        this.Hand.render(f5);
        this.Hand3.render(f5);
        this.Hand11.render(f5);
        this.HeadBlaze.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.RogR.offsetX, this.RogR.offsetY, this.RogR.offsetZ);
        GlStateManager.translate(this.RogR.rotationPointX * f5, this.RogR.rotationPointY * f5, this.RogR.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.2D, 1.0D);
        GlStateManager.translate(-this.RogR.offsetX, -this.RogR.offsetY, -this.RogR.offsetZ);
        GlStateManager.translate(-this.RogR.rotationPointX * f5, -this.RogR.rotationPointY * f5, -this.RogR.rotationPointZ * f5);
        this.RogR.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
