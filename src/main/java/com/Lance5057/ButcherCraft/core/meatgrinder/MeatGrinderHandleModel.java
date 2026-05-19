/*    */ package com.Lance5057.ButcherCraft.core.meatgrinder;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ import net.minecraft.entity.Entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MeatGrinderHandleModel
/*    */   extends ModelBase
/*    */ {
/*    */   public ModelRenderer Bolt;
/*    */   public ModelRenderer Handle1;
/*    */   public ModelRenderer Handle2;
/*    */   public ModelRenderer Handle3;
/*    */   public ModelRenderer Knob;
/*    */   
/*    */   public MeatGrinderHandleModel() {
/* 20 */     this.textureWidth = 16;
/* 21 */     this.textureHeight = 16;
/* 22 */     this.Bolt = new ModelRenderer(this, 0, 0);
/* 23 */     this.Bolt.setRotationPoint(-2.0F, -2.0F, -2.0F);
/* 24 */     this.Bolt.addBox(0.0F, 0.0F, 0.0F, 2, 4, 4, 0.0F);
/* 25 */     this.Handle1 = new ModelRenderer(this, 0, 8);
/* 26 */     this.Handle1.setRotationPoint(-2.0F, 2.0F, 2.0F);
/* 27 */     this.Handle1.addBox(0.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
/* 28 */     setRotateAngle(this.Handle1, 1.5707964F, 0.0F, 0.0F);
/* 29 */     this.Handle2 = new ModelRenderer(this, 12, 0);
/* 30 */     this.Handle2.setRotationPoint(0.5F, 1.0F, 0.5F);
/* 31 */     this.Handle2.addBox(0.0F, -1.0F, -1.0F, 1, 10, 1, 0.0F);
/* 32 */     setRotateAngle(this.Handle2, 0.0F, 0.0F, 0.43633232F);
/* 33 */     this.Handle3 = new ModelRenderer(this, 0, 12);
/* 34 */     this.Handle3.setRotationPoint(-0.8F, 9.8F, 0.0F);
/* 35 */     this.Handle3.addBox(0.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F);
/* 36 */     setRotateAngle(this.Handle3, 0.0F, 0.0F, -0.43633232F);
/* 37 */     this.Knob = new ModelRenderer(this, 6, 10);
/* 38 */     this.Knob.setRotationPoint(-1.8F, -0.5F, -0.5F);
/* 39 */     this.Knob.addBox(0.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
/* 40 */     this.Bolt.addChild(this.Handle1);
/* 41 */     this.Handle1.addChild(this.Handle2);
/* 42 */     this.Handle2.addChild(this.Handle3);
/* 43 */     this.Handle3.addChild(this.Knob);
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 48 */     this.Bolt.render(f5);
/*    */   }
/*    */ 
/*    */   
/*    */   public void doRender(float rot) {
/* 53 */     GlStateManager.translate(0.5F, 1.0F, 0.0F);
/* 54 */     GlStateManager.rotate(rot, 1.0F, 0.0F, 0.0F);
/* 55 */     this.Bolt.render(0.0625F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
/* 62 */     modelRenderer.rotateAngleX = x;
/* 63 */     modelRenderer.rotateAngleY = y;
/* 64 */     modelRenderer.rotateAngleZ = z;
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\meatgrinder\MeatGrinderHandleModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */