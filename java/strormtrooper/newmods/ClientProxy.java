 package strormtrooper.newmods;

import net.minecraft.client.model.ModelChicken;
import strormtrooper.newmods.Entity.EntityRobotChickenMob;
import strormtrooper.newmods.Render.RenderRobotChickenMob;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityRobotChickenMob.class,new RenderRobotChickenMob(new ModelChicken(), 0));
}
}
