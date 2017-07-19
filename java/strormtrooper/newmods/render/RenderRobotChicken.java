package strormtrooper.newmods.render;

import strormtrooper.newmods.Entity.EntityRobotChicken;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderRobotChicken extends RenderLiving{

	private static final ResourceLocation doeTexture = new ResourceLocation("frst:" + ":textures/reg_models/RobotChicken.png");

		 public RenderRobotChicken(ModelBase par1ModelBase, float par2) 
		{
			 super(par1ModelBase, par2);
		}
		 
		protected ResourceLocation getEntityTexture(EntityRobotChicken entity) 
		{
		return doeTexture;
		}
		
		protected ResourceLocation getEntityTexture(Entity entity)
		{
			return this.getEntityTexture((EntityRobotChicken) entity);
		}


}
