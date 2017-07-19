package strormtrooper.newmods.Entity;

import strormtrooper.newmods.Newmod_firstever;
import strormtrooper.newmods.Entity.EntityRobotChicken;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities {
	static int startEntityID;
	static int i;
	
	public static void init()
		{
			registerModEntityEgg(EntityRobotChicken.class, "RobotChicken", 0xFFFFFF, 0x606060);

		}

		public static void registerModProjectile(Class entityClass, String name)
		{
			EntityRegistry.registerModEntity(entityClass, name, ++startEntityID, Newmod_firstever.class, 64, 10, true);
			System.out.println("Registering mod projectile " + name + " with ID = " + startEntityID);
		}
	
		public static void registerModEntity(Class entityClass, String name)
		{
				EntityRegistry.registerModEntity(entityClass, name, ++startEntityID, Newmod_firstever.class, 80, 3, false);
			System.out.println("Registering mod entity " + name + " with ID = " + startEntityID);
		}

		public static void registerModEntityEgg(Class entityClass, String name, int primary, int secondary)
		{ 
			registerModEntity(entityClass, name);

			if (i == 0)
			{
				registerSpawnEgg(name, primary, secondary);
				++i;
			}
		}

		public static void registerSpawnEgg(String name, int primary, int secondary)
		{
			
		}

		public static int getUniqueEntityId()
				{
			do
			{
				startEntityID++;
			}
			while (EntityList.getStringFromID(startEntityID) != null);

			return startEntityID;
				}
		

}
