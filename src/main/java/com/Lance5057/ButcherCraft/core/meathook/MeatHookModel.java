/*    */ package com.Lance5057.ButcherCraft.core.meathook;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MeatHookModel
/*    */   extends ModelBase
/*    */ {
/*    */   public ModelRenderer HookBase;
/*    */   public ModelRenderer HookSideR;
/*    */   public ModelRenderer HookSideL;
/*    */   public ModelRenderer HookCenter;
/*    */   public ModelRenderer HookL;
/*    */   public ModelRenderer HookR;
/*    */   
/*    */   public MeatHookModel() {
/* 20 */     this.textureWidth = 16;
/* 21 */     this.textureHeight = 16;
/* 22 */     this.HookBase = new ModelRenderer(this, 0, 0);
/* 23 */     this.HookBase.setRotationPoint(0.0F, 8.0F, 4.0F);
/* 24 */     this.HookBase.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
/* 25 */     this.HookL = new ModelRenderer(this, 4, -4);
/* 26 */     this.HookL.setRotationPoint(4.0F, 4.0F, -1.5F);
/* 27 */     this.HookL.addBox(-0.5F, 0.0F, -0.5F, 0, 6, 4, 0.0F);
/* 28 */     this.HookSideL = new ModelRenderer(this, 0, 0);
/* 29 */     this.HookSideL.setRotationPoint(0.0F, 1.6F, 0.0F);
/* 30 */     this.HookSideL.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
/* 31 */     setRotateAngle(this.HookSideL, 0.0F, 0.0F, -1.134464F);
/* 32 */     this.HookCenter = new ModelRenderer(this, 0, 0);
/* 33 */     this.HookCenter.setRotationPoint(6.0F, 4.5F, 0.0F);
/* 34 */     this.HookCenter.addBox(-0.5F, 0.0F, -0.5F, 1, 12, 1, 0.0F);
/* 35 */     setRotateAngle(this.HookCenter, 0.0F, 0.0F, 1.5707964F);
/* 36 */     this.HookSideR = new ModelRenderer(this, 0, 0);
/* 37 */     this.HookSideR.setRotationPoint(0.0F, 1.6F, 0.0F);
/* 38 */     this.HookSideR.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
/* 39 */     setRotateAngle(this.HookSideR, 0.0F, 0.0F, 1.134464F);
/* 40 */     this.HookR = new ModelRenderer(this, 4, -4);
/* 41 */     this.HookR.setRotationPoint(-4.0F, 4.0F, -1.5F);
/* 42 */     this.HookR.addBox(-0.5F, 0.0F, -0.5F, 0, 6, 4, 0.0F);
/* 43 */     this.HookBase.addChild(this.HookL);
/* 44 */     this.HookBase.addChild(this.HookSideL);
/* 45 */     this.HookBase.addChild(this.HookCenter);
/* 46 */     this.HookBase.addChild(this.HookSideR);
/* 47 */     this.HookBase.addChild(this.HookR);
/*    */   }
/*    */   
/*    */   public void doRender() {
/* 51 */     this.HookBase.render(0.0625F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
/* 58 */     modelRenderer.rotateAngleX = x;
/* 59 */     modelRenderer.rotateAngleY = y;
/* 60 */     modelRenderer.rotateAngleZ = z;
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\meathook\MeatHookModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */