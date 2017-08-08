package strormtrooper.newmods.Render;

import strormtrooper.newmods.Entity.EntityWalkerMob;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

public class RenderSpeederMob extends RenderLiving {

	private static final ResourceLocation SpeederTextures = new ResourceLocation("frst:" + "textures/Entity/Speeder.png");
	private static final String __OBFID = "CL_00000984";

    public RenderSpeederMob(ModelBase p_i1253_1_, float p_i1253_2_)
    {
        super(p_i1253_1_, p_i1253_2_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntitySpeederMob p_110775_1_)
    {
        return SpeederTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntitySpeederMob)p_110775_1_);
    }
}
