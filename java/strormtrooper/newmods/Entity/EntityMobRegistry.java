package strormtrooper.newmods.Entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import strormtrooper.newmods.Newmod_firstever;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemSpade;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityMobRegistry{
	
	public EntityMobRegistry(World world) {
		super();
		
	}
	public static void mainRegistry(){
		registerEntity();
		//Debug
		System.out.println("registering enities");
	}
	public static void registerEntity(){
		
		createEntity(EntityRobotChickenMob.class,"Robot_Chicken",0xFFFFFF,0x6B6B6B);
		createEntity(EntityWalkerMob.class, "Walker", 0xFFFFFF, 0xFFFF00);
		createEntity(ENtitySpeederMob.class,"Speeder",0x666666,0xFF0F0F);
		
	}
	public static void createEntity(Class entityClass, String entityName, int solidcolor, int spotcolor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, Newmod_firstever.modInstance, 128, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId,solidcolor,spotcolor);
	}
	private static void createEgg(int randomId, int solidcolor, int spotcolor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidcolor, spotcolor));
		
	}
	static int startEntityID;
	static int i;

	public static void init()
		{
			registerModEntityEgg(EntityMobRegistry.class, "RobotChicken", 0xFFFFFF, 0x606060);
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

	
