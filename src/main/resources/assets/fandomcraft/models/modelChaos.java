// Date: 08/08/2014 17:26:19
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package assets.fandomcraft.models;

import apocalypse.fandomcraft.entity.EntityChaosBoss;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityIronGolem;

public class modelChaos extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Headwear;
    ModelRenderer Body;
    ModelRenderer RightArm;
    ModelRenderer LeftArm;
    ModelRenderer RightLeg;
    ModelRenderer LeftLeg;
    ModelRenderer HeadwearLeft;
    ModelRenderer HeadwearRight;
  
  public modelChaos()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-4F, -8F, -4F, 8, 8, 8);
      Head.setRotationPoint(0F, 0F, -2F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Headwear = new ModelRenderer(this, 0, 31);
      Headwear.addBox(-3F, -3F, 0F, 6, 8, 14);
      Headwear.setRotationPoint(0F, -5F, -4F);
      Headwear.setTextureSize(64, 64);
      Headwear.mirror = true;
      setRotation(Headwear, 0.6981317F, 0F, 0F);
      HeadwearLeft = new ModelRenderer(this, 0, 16);
      HeadwearLeft.addBox(-2F, -2F, 0F, 5, 5, 10);
      HeadwearLeft.setRotationPoint(0F, -7.5F, 1F);
      HeadwearLeft.setTextureSize(64, 64);
      HeadwearLeft.mirror = true;
      setRotation(HeadwearLeft, -0.6981317F, 0.4363323F, 0F);
      HeadwearRight = new ModelRenderer(this, 0, 16);
      HeadwearRight.addBox(-2.5F, -2F, 0F, 5, 5, 10);
      HeadwearRight.setRotationPoint(-0.3F, -7.2F, 1F);
      HeadwearRight.setTextureSize(64, 64);
      HeadwearRight.mirror = true;
      setRotation(HeadwearRight, -0.6981317F, -0.4363323F, 0F);
      Body = new ModelRenderer(this, 30, 15);
      Body.addBox(-4F, 0F, -2F, 6, 12, 4);
      Body.setRotationPoint(1F, -0.5F, 0F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 48, 27);
      RightArm.addBox(-1F, -2F, -1F, 4, 23, 4);
      RightArm.setRotationPoint(-5F, 2F, 0F);
      RightArm.setTextureSize(64, 64);
      RightArm.mirror = true;
      setRotation(RightArm, -0.2617994F, 0F, 0.2617994F);
      LeftArm = new ModelRenderer(this, 48, 27);
      LeftArm.addBox(-1F, -2F, -1F, 4, 23, 4);
      LeftArm.setRotationPoint(3F, 2.5F, 0F);
      LeftArm.setTextureSize(64, 64);
      LeftArm.mirror = true;
      setRotation(LeftArm, -0.2617994F, 0F, -0.2617994F);
      RightLeg = new ModelRenderer(this, 52, 0);
      RightLeg.addBox(-1F, 0F, -1F, 3, 14, 3);
      RightLeg.setRotationPoint(-2.5F, 10F, 0F);
      RightLeg.setTextureSize(64, 64);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 52, 0);
      LeftLeg.addBox(-1F, 0F, -1F, 3, 14, 3);
      LeftLeg.setRotationPoint(1.5F, 10F, 0F);
      LeftLeg.setTextureSize(64, 64);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      LeftLeg.mirror = false;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    HeadwearLeft.render(f5);
    HeadwearLeft.render(f5);
    Headwear.render(f5);
    Body.render(f5);
    RightArm.render(f5);
    LeftArm.render(f5);
    RightLeg.render(f5);
    LeftLeg.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.Head.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.Headwear.rotateAngleX = this.Head.rotateAngleX;
    this.HeadwearRight.rotateAngleX = this.Head.rotateAngleX;
    this.HeadwearLeft.rotateAngleX = this.Head.rotateAngleX;
    this.LeftLeg.rotateAngleX = -1.5F * this.func_78172_a(f, 13.0F) * f1;
    this.RightLeg.rotateAngleX = 1.5F * this.func_78172_a(f, 13.0F) * f1;
    this.LeftLeg.rotateAngleY = 0.0F;
    this.RightLeg.rotateAngleY = 0.0F;
  }
  public void setLivingAnimations(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_)
  {
      EntityChaosBoss entitychaos = (EntityChaosBoss)p_78086_1_;
      int i = entitychaos.getAttackTimer();

      if (i > 0)
      {
          this.RightArm.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - p_78086_4_, 10.0F);
          this.LeftArm.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - p_78086_4_, 10.0F);
      }
      else
      {
          this.RightArm.rotateAngleX = (-0.2F + 1.5F * this.func_78172_a(p_78086_2_, 13.0F)) * p_78086_3_;
          this.LeftArm.rotateAngleX = (-0.2F - 1.5F * this.func_78172_a(p_78086_2_, 13.0F)) * p_78086_3_;
      
      }
  }
  private float func_78172_a(float p_78172_1_, float p_78172_2_)
  {
      return (Math.abs(p_78172_1_ % p_78172_2_ - p_78172_2_ * 0.5F) - p_78172_2_ * 0.25F) / (p_78172_2_ * 0.25F);
  }

}
