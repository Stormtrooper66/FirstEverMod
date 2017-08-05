package strormtrooper.newmods.Models;

import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;



public class WalkerModel extends ModelBase
{
	public ModelRenderer Head;
	public ModelRenderer Eyes;
	public ModelRenderer Leg1;
	public ModelRenderer Leg2;
	

	public int TextureWidth = 64;
	public int TextureHeight = 32;
	
	
	protected double distanceMovedTotal = 0.0D;
	
	
	public WalkerModel(){
		
		Head = new ModelRenderer(this,0,0);
		Head.addBox(0F, 0F, 0F, 10, 8, 9);
		Head.setRotationPoint(-5F, (24F - 24F), -4F);
		Head.setTextureSize(TextureWidth, TextureHeight);
		//Eyes
		Eyes = new ModelRenderer(this,32,28);
		Eyes.addBox(-1F, 0F,0F, 2, 2, 1);
		Eyes.addBox(3F,0F,0F, 2, 2, 1);
		Eyes.setRotationPoint(-2F, (24F - 22F), -5F);
		Eyes.setTextureSize(TextureWidth, TextureHeight);
		//Leg1(Right)
		Leg1 = new ModelRenderer(this,40,0);
		Leg1.addBox(0F, 0F, 0F, 3, 16, 3);
		Leg1.setRotationPoint(1F, (24F - 16F), -1F);
		Leg1.setTextureSize(TextureWidth, TextureHeight);
		//Leg2(Left)
		Leg2 = new ModelRenderer(this,52,0);
		Leg2.addBox(0F, 0F, 0F, 3, 16, 3);
		Leg2.setRotationPoint(-4F, (24F - 16F), -1F);
		Leg2.setTextureSize(TextureWidth, TextureHeight);
	}
	public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_){
		this.setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, p_78088_1_);

		Head.render(p_78088_7_);
		Eyes.render(p_78088_7_);
		Leg1.render(p_78088_7_);
		Leg2.render(p_78088_7_);
	}
	 public void setRotationAngles(float p_78087_1_, float swing, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
	    {
		 
		 this.Leg1.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * swing;
	     this.Leg2.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * swing;
	     this.Leg1.rotateAngleY = 0.0F;
	     this.Leg2.rotateAngleY = 0.0F;
		 
		 
		 
		 
	    }
	 
}
