/*     */ package com.Lance5057.ButcherCraft.core.grill;
/*     */ 
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
/*     */ import net.minecraft.client.renderer.texture.TextureMap;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.ItemStack;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GrillModel
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer GrillAshCatch;
/*     */   public ModelRenderer GrillSide2;
/*     */   public ModelRenderer GrillSide3;
/*     */   public ModelRenderer GrillLeg3;
/*     */   public ModelRenderer GrillLeg2;
/*     */   public ModelRenderer GrillLeg;
/*     */   public ModelRenderer GrillBars;
/*     */   public ModelRenderer GrillBottom;
/*     */   public ModelRenderer GrillSide1;
/*     */   public ModelRenderer GrillSide4;
/*     */   
/*     */   public GrillModel() {
/*  30 */     this.textureWidth = 64;
/*  31 */     this.textureHeight = 64;
/*  32 */     this.GrillSide2 = new ModelRenderer(this, 0, 0);
/*  33 */     this.GrillSide2.setRotationPoint(-8.0F, 9.0F, -8.0F);
/*  34 */     this.GrillSide2.addBox(0.0F, 0.0F, 0.0F, 16, 4, 1, 0.0F);
/*  35 */     this.GrillSide1 = new ModelRenderer(this, 0, 0);
/*  36 */     this.GrillSide1.setRotationPoint(-8.0F, 9.0F, 7.0F);
/*  37 */     this.GrillSide1.addBox(0.0F, 0.0F, 0.0F, 14, 4, 1, 0.0F);
/*  38 */     setRotateAngle(this.GrillSide1, 0.0F, 1.5707964F, 0.0F);
/*  39 */     this.GrillSide4 = new ModelRenderer(this, 0, 0);
/*  40 */     this.GrillSide4.setRotationPoint(7.0F, 9.0F, 7.0F);
/*  41 */     this.GrillSide4.addBox(0.0F, 0.0F, 0.0F, 14, 4, 1, 0.0F);
/*  42 */     setRotateAngle(this.GrillSide4, 0.0F, 1.5707964F, 0.0F);
/*  43 */     this.GrillLeg3 = new ModelRenderer(this, 0, 24);
/*  44 */     this.GrillLeg3.setRotationPoint(0.0F, 13.5F, 0.0F);
/*  45 */     this.GrillLeg3.addBox(-1.0F, 1.0F, 2.5F, 2, 12, 2, 0.0F);
/*  46 */     setRotateAngle(this.GrillLeg3, 0.2617994F, -2.0943952F, 0.0F);
/*  47 */     this.GrillAshCatch = new ModelRenderer(this, 0, 16);
/*  48 */     this.GrillAshCatch.setRotationPoint(0.0F, 18.0F, 0.0F);
/*  49 */     this.GrillAshCatch.addBox(-3.5F, 0.0F, -3.0F, 7, 1, 7, 0.0F);
/*  50 */     this.GrillBars = new ModelRenderer(this, 15, 16);
/*  51 */     this.GrillBars.setRotationPoint(0.0F, 9.5F, 0.0F);
/*  52 */     this.GrillBars.addBox(-7.0F, 0.0F, -7.0F, 14, 0, 14, 0.0F);
/*  53 */     this.GrillLeg2 = new ModelRenderer(this, 0, 24);
/*  54 */     this.GrillLeg2.setRotationPoint(0.0F, 13.5F, 0.0F);
/*  55 */     this.GrillLeg2.addBox(-1.0F, 1.0F, 2.5F, 2, 12, 2, 0.0F);
/*  56 */     setRotateAngle(this.GrillLeg2, 0.2617994F, 2.0943952F, 0.0F);
/*  57 */     this.GrillSide3 = new ModelRenderer(this, 0, 0);
/*  58 */     this.GrillSide3.setRotationPoint(-8.0F, 9.0F, 7.0F);
/*  59 */     this.GrillSide3.addBox(0.0F, 0.0F, 0.0F, 16, 4, 1, 0.0F);
/*  60 */     this.GrillLeg = new ModelRenderer(this, 0, 24);
/*  61 */     this.GrillLeg.setRotationPoint(0.0F, 13.5F, 0.0F);
/*  62 */     this.GrillLeg.addBox(-1.0F, 1.0F, 2.5F, 2, 12, 2, 0.0F);
/*  63 */     setRotateAngle(this.GrillLeg, 0.2617994F, 0.0F, 0.0F);
/*  64 */     this.GrillBottom = new ModelRenderer(this, 0, 0);
/*  65 */     this.GrillBottom.setRotationPoint(0.0F, 12.0F, 0.0F);
/*  66 */     this.GrillBottom.addBox(-7.0F, 0.0F, -7.0F, 14, 2, 14, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  71 */     this.GrillSide2.render(f5);
/*  72 */     this.GrillSide1.render(f5);
/*  73 */     this.GrillSide4.render(f5);
/*  74 */     this.GrillLeg3.render(f5);
/*  75 */     this.GrillAshCatch.render(f5);
/*  76 */     this.GrillBars.render(f5);
/*  77 */     this.GrillLeg2.render(f5);
/*  78 */     this.GrillSide3.render(f5);
/*  79 */     this.GrillLeg.render(f5);
/*  80 */     this.GrillBottom.render(f5);
/*     */   }
/*     */   
/*     */   public void doRender(int charcoal, ItemStack[] food, int lit) {
/*  84 */     float f5 = 0.0625F;
/*  85 */     this.GrillSide2.render(f5);
/*  86 */     this.GrillSide1.render(f5);
/*  87 */     this.GrillSide4.render(f5);
/*  88 */     this.GrillLeg3.render(f5);
/*  89 */     this.GrillAshCatch.render(f5);
/*  90 */     this.GrillBars.render(f5);
/*  91 */     this.GrillLeg2.render(f5);
/*  92 */     this.GrillSide3.render(f5);
/*  93 */     this.GrillLeg.render(f5);
/*  94 */     this.GrillBottom.render(f5);
/*     */     
/*  96 */     float rot = 0.0F; int i;
/*  97 */     for (i = 0; i < charcoal; i++) {
/*  98 */       GlStateManager.pushMatrix();
/*  99 */       (Minecraft.getMinecraft()).renderEngine.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
/*     */       
/* 101 */       GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
/* 102 */       GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
/* 103 */       GlStateManager.rotate(rot, 0.0F, 0.0F, 1.0F);
/* 104 */       float s = 0.4F;
/* 105 */       GlStateManager.scale(s, s, s);
/* 106 */       GlStateManager.translate(0.5F, -0.0F, 1.75F);
/*     */       
/* 108 */       Minecraft.getMinecraft().getRenderItem().renderItem(new ItemStack(Items.COAL, 1, 1), ItemCameraTransforms.TransformType.NONE);
/*     */ 
/*     */       
/* 111 */       GlStateManager.popMatrix();
/*     */       
/* 113 */       rot += 90.0F;
/*     */     } 
/*     */     
/* 116 */     rot = 0.0F;
/* 117 */     for (i = 0; i < food.length; i++) {
/*     */       
/* 119 */       GlStateManager.pushMatrix();
/*     */       
/* 121 */       GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
/* 122 */       GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
/* 123 */       GlStateManager.rotate(rot + 45.0F, 0.0F, 0.0F, 1.0F);
/* 124 */       float s = 0.4F;
/* 125 */       GlStateManager.scale(s, s, s);
/* 126 */       GlStateManager.translate(0.75F, -0.0F, 1.4F);
/*     */       
/* 128 */       Minecraft.getMinecraft().getRenderItem().renderItem(food[i], ItemCameraTransforms.TransformType.NONE);
/*     */       
/* 130 */       GlStateManager.popMatrix();
/*     */       
/* 132 */       rot += 90.0F;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
/* 141 */     modelRenderer.rotateAngleX = x;
/* 142 */     modelRenderer.rotateAngleY = y;
/* 143 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\grill\GrillModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */