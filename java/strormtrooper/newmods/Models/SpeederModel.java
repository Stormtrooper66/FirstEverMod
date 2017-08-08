package strormtrooper.newmods.Models;

import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;



public class SpeederModel extends ModelBase
{
        public ModelRenderer Body;
        
        
        
        public int TextureWidth = 248;
        public int TextureHeight = 124;
        
        
        
        protected double distanceMovedTotal = 0.0D;
        
        public SpeederModel(){
               Body = new ModelRenderer(this,0,0);
               Body.addbox(0F,0F,0F,5,5,32);
               Body.setRotationPoint(-4F,(24F- 18F),-4F);
               Body.setTextureSize(TextureWidth,TextureHeight);
	       
         
         }
         public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_){
		this.setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, p_78088_1_);

		Body.render(p_78088_7_);
                }
        
}
