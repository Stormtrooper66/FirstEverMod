 package strormtrooper.newmods;

import net.minecraft.client.model.ModelChicken;
import strormtrooper.newmods.Entity.EntityRobotChickenMob;
import strormtrooper.newmods.Entity.EntityWalkerMob;
import strormtrooper.newmods.Models.RobotChickenModel;
import strormtrooper.newmods.Models.WalkerModel;
import strormtrooper.newmods.Render.RenderRobotChickenMob;
import strormtrooper.newmods.Render.RenderWalkerMob;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends ServerProxy{
	

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// DEBUG
        System.out.println("PreInit on Client side");
        
		// do common stuff
		super.fmlLifeCycleEvent(event);

        // do client-specific stuff
        registerRenderThings();
	}
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		// DEBUG
        System.out.println("Init on Client side");

        // do common stuff
		super.fmlLifeCycleEvent(event);

		// do client-specific stuff
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		// DEBUG
        System.out.println("PostInit on Client side");

        // do common stuff
		super.fmlLifeCycleEvent(event);

		// do client-specific stuff
	}
	
	public void registerRenderThings(){
		System.out.println("Rendering Robot Chicken");
		RenderingRegistry.registerEntityRenderingHandler(EntityRobotChickenMob.class,new RenderRobotChickenMob(new RobotChickenModel(), 0.0F));
		System.out.println("Rendering Walker");
		RenderingRegistry.registerEntityRenderingHandler(EntityWalkerMob.class, new RenderWalkerMob(new WalkerModel(),0.0F));
	}
}
