package strormtrooper.newmods.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
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
import net.minecraft.world.World;

public class EntityRobotChicken extends EntityAnimal{

	public EntityRobotChicken(World world) {
		super(world);
		this.getNavigator().setAvoidsWater(true);
		this.setSize(1F, 1f);
		
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1,new EntityAIPanic(this,1.25D));
		this.tasks.addTask(2,new EntityAIWander(this, 1.0D));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(4,new EntityAILookIdle(this));
	}
	@Override
	protected boolean isAIEnabled() {
		return true;
	}
	@Override
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(.3D);
	}
	protected void dropFewItems(boolean t_f, int i) {
		super.dropFewItems(t_f, i);
		int var = this.rand.nextInt(2);
		if(var == 0){
			dropItem(Items.iron_ingot, 1);		
		}
		int var1 = this.rand.nextInt(1);
		if(var1 == 1){
			dropItem(Items.chicken, 1);
		}
		int var2 = this.rand.nextInt(4);
		if(var2 == (0|1)){
			dropItem(Items.feather, 1);
		}
		if(var2 == 2){
			dropItem(Items.feather,2);
		}
	}
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		
		return null;
	}
	 protected String getLivingSound()
	    {
	        return "mob.chicken.say";
	    }
	 protected String getHurtSound()
	    {
	        return "mob.chicken.hurt";
	    }
	 protected String getDeathSound()
	    {
	        return "mob.chicken.hurt";
	    }
}
