package strormtrooper.newmods;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderChicken;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import strormtrooper.newmods.Entity.EntityRobotChicken;
import strormtrooper.newmods.item.ItemEmeraldArmor;
import strormtrooper.newmods.item.ItemEmeraldAxe;
import strormtrooper.newmods.item.ItemEmeraldHoe;
import strormtrooper.newmods.item.ItemEmeraldPickaxe;
import strormtrooper.newmods.item.ItemEmeraldSpade;
import strormtrooper.newmods.item.ItemEmeraldSword;
import strormtrooper.newmods.item.ItemEnderiumArmor;
import strormtrooper.newmods.item.ItemEnderiumSword;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "frst", name = "Firstever" , version = "1.1")
public class Newmod_firstever {
	
	public static Item itemTable;
	public static Block blockTable;
	public static Item TableLeg;
	
	public static Item guitest;
	public static Block TileEntityTest;
	
	public static Item Sausageraw;
	public static Item HotDog;
	
	public static Block Drywall;
	public static Item Paintcan;
	public static Item EmptyPaintcan;
	public static Item Bonemeal;
	//Bonemeal = Paint Mix
	
	public static Item Enderiumingot;
	public static Item Steelrod;
	public static Item EnderiumSword;
	public static Item EnderiumHelmet;
	public static Item EnderiumChestplate;
	public static Item EnderiumLeggings;
	public static Item EnderiumBoots;
	
	public static Item EmeraldPickaxe;
	public static Item EmeraldAxe;
	public static Item EmeraldSpade;
	public static Item EmeraldSword;
	public static Item EmeraldHoe;
	
	public static Item EmeraldHelmet;
	public static Item EmeraldChestplate;
	public static Item EmeraldLeggings;
	public static Item EmeraldBoots;
	
	
	public static final Item.ToolMaterial EmeraldToolMaterial = EnumHelper.addToolMaterial("EmeraldToolMaterial", (int) 2.9, 502, 7.0F, 2.5F, 50);
	public static final ItemArmor.ArmorMaterial EmeraldArmorMaterial = EnumHelper.addArmorMaterial("EmeraldArmorMaterial", 502, new int[]{2,7,5,3}, 50);
	public static final Item.ToolMaterial EnderiumToolMaterial = EnumHelper.addToolMaterial("EnderiumToolMaterial", (int) 3.0, 2343,12.0F, 4.0F, 35);
	public static final ItemArmor.ArmorMaterial EnderiumArmorMaterial = EnumHelper.addArmorMaterial("EnderiumArmorMaterial", 2343, new int[]{4,14,10,6}, 35);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block init and registering
		//Config handling
		itemTable = new ItemTable().setUnlocalizedName("ItemTable").setTextureName("frst:itemtable").setCreativeTab(tabFirstEver);
		blockTable = new BlockTable(Material.wood).setBlockName("BlockTable").setBlockTextureName("frst:blockTable").setCreativeTab(tabFirstEver);
		TableLeg = new TableLeg().setUnlocalizedName("TableLeg").setTextureName("frst:TableLeg").setCreativeTab(tabFirstEver);
		guitest = new guitest().setUnlocalizedName("guitest").setTextureName("frst:guiTest").setCreativeTab(tabFirstEver);
		TileEntityTest = new TileEntityTest(Material.carpet).setCreativeTab(tabFirstEver);
		
		Sausageraw = new ItemFood(2, 0.25F, true).setUnlocalizedName("Sausageraw").setTextureName("frst:Sausageraw").setCreativeTab(tabFirstEver);
		HotDog = new ItemFood(5,0.5F,true).setUnlocalizedName("HotDog").setTextureName("frst:HotDog").setCreativeTab(tabFirstEver);
		
		
		Drywall = new Drywall(Material.carpet, "drywall");
		Paintcan = new Paintcan().setUnlocalizedName("Paintcan");
		EmptyPaintcan = new EmptyPaintcan().setUnlocalizedName("EmptyPaintcan").setTextureName("frst:EmptyPaintcan").setCreativeTab(tabFirstEver);
		Bonemeal = new Bonemeal().setUnlocalizedName("Bonemeal");
		
		Enderiumingot = new Enderiumingot().setUnlocalizedName("Enderiumingot").setTextureName("frst:Enderiumingot").setCreativeTab(tabFirstEver);
		Steelrod = new Steelrod().setUnlocalizedName("Steelrod").setTextureName("frst:Steelrod").setCreativeTab(tabFirstEver);
		EnderiumSword = new ItemEnderiumSword(EnderiumToolMaterial).setUnlocalizedName("ItemEnderiumSword").setTextureName("frst:EnderiumSword").setCreativeTab(tabFirstEver);
		EnderiumHelmet = new ItemEnderiumArmor(EnderiumArmorMaterial, 0, 0).setUnlocalizedName("EnderiumHelmet").setTextureName("frst:EnderiumHelmet").setCreativeTab(tabFirstEver);
		EnderiumChestplate = new ItemEnderiumArmor(EnderiumArmorMaterial, 0, 1).setUnlocalizedName("EnderiumChestplate").setTextureName("frst:EnderiumChestplate").setCreativeTab(tabFirstEver);
		EnderiumLeggings = new ItemEnderiumArmor(EnderiumArmorMaterial, 0, 2).setUnlocalizedName("EnderiumLeggings").setTextureName("frst:EnderiumLeggings").setCreativeTab(tabFirstEver);
		EnderiumBoots = new ItemEnderiumArmor(EnderiumArmorMaterial, 0, 3).setUnlocalizedName("EnderiumBoots").setTextureName("frst:EnderiumBoots").setCreativeTab(tabFirstEver);
		
		
		
		
		
		EmeraldPickaxe = new ItemEmeraldPickaxe(EmeraldToolMaterial).setUnlocalizedName("ItemEmeraldPickaxe").setTextureName("frst:EmeraldPickaxe").setCreativeTab(tabFirstEver);
		EmeraldAxe = new ItemEmeraldAxe(EmeraldToolMaterial).setUnlocalizedName("ItemEmeraldAxe").setTextureName("frst:EmeraldAxe").setCreativeTab(tabFirstEver);
		EmeraldSpade = new ItemEmeraldSpade(EmeraldToolMaterial).setUnlocalizedName("ItemEmeraldSpade").setTextureName("frst:EmeraldSpade").setCreativeTab(tabFirstEver);
		EmeraldSword = new ItemEmeraldSword(EmeraldToolMaterial).setUnlocalizedName("ItemEmeraldSword").setTextureName("frst:EmeraldSword").setCreativeTab(tabFirstEver);
		EmeraldHoe = new ItemEmeraldHoe(EmeraldToolMaterial).setUnlocalizedName("ItemEmeraldHoe").setTextureName("frst:EmeraldHoe").setCreativeTab(tabFirstEver);
		
		EmeraldHelmet = new ItemEmeraldArmor(EmeraldArmorMaterial, 0, 0).setUnlocalizedName("EmeraldHelmet").setTextureName("frst:EmeraldHelmet").setCreativeTab(tabFirstEver);
		EmeraldChestplate = new ItemEmeraldArmor(EmeraldArmorMaterial, 0, 1).setUnlocalizedName("EmeraldChestplate").setTextureName("frst:EmeraldChestplate").setCreativeTab(tabFirstEver);
		EmeraldLeggings = new ItemEmeraldArmor(EmeraldArmorMaterial, 0, 2).setUnlocalizedName("EmeraldLeggings").setTextureName("frst:EmeraldLeggings").setCreativeTab(tabFirstEver);
		EmeraldBoots = new ItemEmeraldArmor(EmeraldArmorMaterial, 0, 3).setUnlocalizedName("EmeraldBoots").setTextureName("frst:EmeraldBoots").setCreativeTab(tabFirstEver);
		
		
		GameRegistry.registerItem(itemTable,itemTable.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockTable,blockTable.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TableLeg, TableLeg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(guitest, guitest.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(TileEntityTest, TileEntityTest.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(Sausageraw, Sausageraw.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(HotDog, HotDog.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(Bonemeal, Bonemeal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Drywall,ItemBlockDrywall.class, Drywall.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Paintcan, Paintcan.getUnlocalizedName().substring(5)); 
		GameRegistry.registerItem(EmptyPaintcan, EmptyPaintcan.getUnlocalizedName().substring(5)); 
		
		GameRegistry.registerItem(Enderiumingot, Enderiumingot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Steelrod, Steelrod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EnderiumSword, EnderiumSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EnderiumHelmet, EnderiumHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EnderiumChestplate, EnderiumChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EnderiumLeggings, EnderiumLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EnderiumBoots, EnderiumBoots.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(EmeraldPickaxe, EmeraldPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldAxe, EmeraldAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldSpade, EmeraldSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldHoe, EmeraldHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldSword, EmeraldSword.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(EmeraldHelmet, EmeraldHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldChestplate, EmeraldChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldLeggings, EmeraldLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldBoots, EmeraldBoots.getUnlocalizedName().substring(5));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityRobotChicken.class, new RenderChicken(new ModelChicken(), 0));
		
		
		
		
		
		
		
		
		
		
		
		GameRegistry.addSmelting(Sausageraw, new ItemStack(HotDog), 5.0F);
		ModEntities.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
	//Proxy, Tileentity, entity, GUI, and Packet Registering
		GameRegistry.addRecipe(new ItemStack(guitest), new Object[]{"W", 'W', Blocks.planks});
		GameRegistry.addRecipe(new ItemStack(itemTable), new Object[]{"WWW","W W","W W", 'W', Blocks.planks});
		GameRegistry.addRecipe(new ItemStack(blockTable),new Object[]{"WWW","LIL","L L",'W', Blocks.planks,'I' ,Items.iron_ingot, 'L', TableLeg});
		GameRegistry.addRecipe(new ItemStack(TableLeg,2),new Object[]{"W","W","W", 'W',Blocks.planks} );
		
		GameRegistry.addRecipe(new ItemStack(Sausageraw,3),new Object[]{"P",'P',Items.porkchop} );
		
		GameRegistry.addRecipe(new ItemStack(Bonemeal,8), new Object[]{" B","BB",'B',new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addRecipe(new ItemStack(Bonemeal,8,1), new Object[]{"DB","BB",'B',new ItemStack(Items.dye, 1, 15),'D',new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(Bonemeal,8,2), new Object[]{"DB","BB",'B',new ItemStack(Items.dye, 1, 15),'D',new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Bonemeal,8,3), new Object[]{"DB","BB",'B',new ItemStack(Items.dye, 1, 15),'D',new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(Bonemeal,8,4), new Object[]{"DB","BB",'B',new ItemStack(Items.dye, 1, 15),'D',new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addRecipe(new ItemStack(Bonemeal,8,5), new Object[]{"DB","BB",'B',new ItemStack(Items.dye, 1, 15),'D',new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(Paintcan,1),new Object[]{" B "," B "," P ",'B',new ItemStack(Bonemeal, 1, 0),'P',EmptyPaintcan});
		GameRegistry.addRecipe(new ItemStack(Paintcan,1,1),new Object[]{" B "," B "," P ",'B',new ItemStack(Bonemeal, 1, 1),'P',EmptyPaintcan});
		GameRegistry.addRecipe(new ItemStack(Paintcan,1,2),new Object[]{" B "," B "," P ",'B',new ItemStack(Bonemeal, 1, 2),'P',EmptyPaintcan});
		GameRegistry.addRecipe(new ItemStack(Paintcan,1,3),new Object[]{" B "," B "," P ",'B',new ItemStack(Bonemeal, 1, 3),'P',EmptyPaintcan});
		GameRegistry.addRecipe(new ItemStack(Paintcan,1,4),new Object[]{" B "," B "," P ",'B',new ItemStack(Bonemeal, 1, 4),'P',EmptyPaintcan});
		GameRegistry.addRecipe(new ItemStack(Paintcan,1,5),new Object[]{" B "," B "," P ",'B',new ItemStack(Bonemeal, 1, 5),'P',EmptyPaintcan});
		GameRegistry.addRecipe(new ItemStack(Drywall,16), new Object[]{"WPW","PWP","WPW",'W',Blocks.planks,'P',new ItemStack(Paintcan, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(Drywall,16,1), new Object[]{"WPW","PWP","WPW",'W',Blocks.planks,'P',new ItemStack(Paintcan, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Drywall,16,2), new Object[]{"WPW","PWP","WPW",'W',Blocks.planks,'P',new ItemStack(Paintcan, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(Drywall,16,3), new Object[]{"WPW","PWP","WPW",'W',Blocks.planks,'P',new ItemStack(Paintcan, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(Drywall,16,4), new Object[]{"WPW","PWP","WPW",'W',Blocks.planks,'P',new ItemStack(Paintcan, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(Drywall,16,5), new Object[]{"WPW","PWP","WPW",'W',Blocks.planks,'P',new ItemStack(Paintcan, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(EmptyPaintcan,4) , new Object[]{" S ","I I"," I ",'S',Steelrod,'I',Items.iron_ingot});
		
		GameRegistry.addRecipe(new ItemStack(Enderiumingot,2),new Object[]{" O ","OEO"," O ",'O',Blocks.obsidian,'E',Items.ender_pearl});
		GameRegistry.addRecipe(new ItemStack(Steelrod), new Object[]{"I","I",'I',Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(EnderiumSword),new Object[]{"E","E","S",'E',Enderiumingot, 'S',Steelrod});
		GameRegistry.addRecipe(new ItemStack(EnderiumHelmet), new Object[]{"EEE","E E",'E',Enderiumingot});
		GameRegistry.addRecipe(new ItemStack(EnderiumChestplate), new Object[]{"E E","EEE","EEE",'E',Enderiumingot});
		GameRegistry.addRecipe(new ItemStack(EnderiumLeggings), new Object[]{"EEE","E E","E E",'E',Enderiumingot});
		GameRegistry.addRecipe(new ItemStack(EnderiumBoots), new Object[]{"E E","E E",'E',Enderiumingot});
		
		GameRegistry.addRecipe(new ItemStack(EmeraldPickaxe),new Object[]{"EEE"," S "," S ",'E',Items.emerald, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(EmeraldAxe),new Object[]{" EE"," SE"," S ",'E',Items.emerald, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(EmeraldSpade),new Object[]{"E","S","S",'E',Items.emerald, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(EmeraldHoe),new Object[]{" EE"," S "," S ",'E',Items.emerald, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(EmeraldSword),new Object[]{"E","E","S",'E',Items.emerald, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(EmeraldHelmet), new Object[]{"EEE","E E","   ",'E',Items.emerald});
		GameRegistry.addRecipe(new ItemStack(EmeraldHelmet), new Object[]{"   ","EEE","E E",'E',Items.emerald});
		GameRegistry.addRecipe(new ItemStack(EmeraldChestplate), new Object[]{"E E","EEE","EEE",'E',Items.emerald});
		GameRegistry.addRecipe(new ItemStack(EmeraldLeggings), new Object[]{"EEE","E E","E E",'E',Items.emerald});
		GameRegistry.addRecipe(new ItemStack(EmeraldBoots), new Object[]{"E E","E E","   ",'E',Items.emerald});
		GameRegistry.addRecipe(new ItemStack(EmeraldBoots), new Object[]{"   ","E E","E E",'E',Items.emerald});
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabFirstEver = new CreativeTabs("tabFirstEver"){;
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemTable).getItem();
		}
	};
}
