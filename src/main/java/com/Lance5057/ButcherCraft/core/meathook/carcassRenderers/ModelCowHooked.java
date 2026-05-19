/*     */ package com.Lance5057.ButcherCraft.core.meathook.carcassRenderers;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelCowHooked
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer Body_Cow;
/*     */   public ModelRenderer Head_Cow;
/*     */   public ModelRenderer Udder_Cow;
/*     */   public ModelRenderer LegLB_Cow;
/*     */   public ModelRenderer LegRB_Cow;
/*     */   public ModelRenderer LegRF_Cow;
/*     */   public ModelRenderer LegLF_Cow;
/*     */   public ModelRenderer HornL_Cow;
/*     */   public ModelRenderer HornR_Cow;
/*     */   
/*     */   public ModelCowHooked() {
/*  23 */     normalMode();
/*     */   }
/*     */ 
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  28 */     this.Body_Cow.render(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   public void doRender() {
/*  33 */     this.Body_Cow.render(0.0625F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void meatMode() {
/*  38 */     this.textureWidth = 64;
/*  39 */     this.textureHeight = 32;
/*  40 */     this.LegLB_Cow = new ModelRenderer(this, 0, 16);
/*  41 */     this.LegLB_Cow.setRotationPoint(4.0F, 5.0F, -7.0F);
/*  42 */     this.LegLB_Cow.addBox(-2.1F, -6.0F, 1.0F, 4, 12, 4, 0.0F);
/*  43 */     setRotateAngle(this.LegLB_Cow, 0.044346094F, 0.0F, 0.0F);
/*  44 */     this.LegRB_Cow = new ModelRenderer(this, 0, 16);
/*  45 */     this.LegRB_Cow.setRotationPoint(-4.0F, 5.0F, -7.0F);
/*  46 */     this.LegRB_Cow.addBox(-1.9F, -6.0F, 1.0F, 4, 12, 4, 0.0F);
/*  47 */     setRotateAngle(this.LegRB_Cow, 0.044346094F, 0.0F, 0.0F);
/*  48 */     this.HornR_Cow = new ModelRenderer(this, 22, 0);
/*  49 */     this.HornR_Cow.setRotationPoint(-5.0F, -5.0F, -3.0F);
/*  50 */     this.HornR_Cow.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
/*  51 */     this.LegLF_Cow = new ModelRenderer(this, 0, 16);
/*  52 */     this.LegLF_Cow.setRotationPoint(4.0F, -8.0F, -7.0F);
/*  53 */     this.LegLF_Cow.addBox(-2.1F, -9.0F, -2.0F, 4, 12, 4, 0.0F);
/*  54 */     setRotateAngle(this.LegLF_Cow, -2.1415927F, 0.0F, 0.0F);
/*  55 */     this.Head_Cow = new ModelRenderer(this, 0, 0);
/*  56 */     this.Head_Cow.setRotationPoint(0.0F, -11.0F, 0.0F);
/*  57 */     this.Head_Cow.addBox(-4.0F, 0.0F, -3.0F, 8, 8, 6, 0.0F);
/*  58 */     setRotateAngle(this.Head_Cow, -0.38539815F, 0.0F, 0.0F);
/*  59 */     this.HornL_Cow = new ModelRenderer(this, 22, 0);
/*  60 */     this.HornL_Cow.setRotationPoint(4.0F, -5.0F, -3.0F);
/*  61 */     this.HornL_Cow.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
/*  62 */     this.Body_Cow = new ModelRenderer(this, 18, 4);
/*  63 */     this.Body_Cow.setRotationPoint(0.0F, 0.0F, -5.0F);
/*  64 */     this.Body_Cow.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
/*  65 */     setRotateAngle(this.Body_Cow, 3.1415927F, 0.0F, 0.0F);
/*  66 */     this.LegRF_Cow = new ModelRenderer(this, 0, 16);
/*  67 */     this.LegRF_Cow.setRotationPoint(-4.0F, -8.0F, -7.0F);
/*  68 */     this.LegRF_Cow.addBox(-1.9F, -9.0F, -2.0F, 4, 12, 4, 0.0F);
/*  69 */     setRotateAngle(this.LegRF_Cow, -2.1415927F, 0.0F, 0.0F);
/*  70 */     this.Udder_Cow = new ModelRenderer(this, 52, 0);
/*  71 */     this.Udder_Cow.setRotationPoint(0.0F, 0.0F, 0.0F);
/*  72 */     this.Udder_Cow.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
/*  73 */     this.Body_Cow.addChild(this.LegLB_Cow);
/*  74 */     this.Body_Cow.addChild(this.LegRB_Cow);
/*  75 */     this.Head_Cow.addChild(this.HornR_Cow);
/*  76 */     this.Body_Cow.addChild(this.LegLF_Cow);
/*  77 */     this.Body_Cow.addChild(this.Head_Cow);
/*  78 */     this.Head_Cow.addChild(this.HornL_Cow);
/*  79 */     this.Body_Cow.addChild(this.LegRF_Cow);
/*  80 */     this.Body_Cow.addChild(this.Udder_Cow);
/*     */   }
/*     */ 
/*     */   
/*     */   public void normalMode() {
/*  85 */     this.textureWidth = 64;
/*  86 */     this.textureHeight = 32;
/*  87 */     this.LegLB_Cow = new ModelRenderer(this, 0, 16);
/*  88 */     this.LegLB_Cow.setRotationPoint(4.0F, 5.0F, -7.0F);
/*  89 */     this.LegLB_Cow.addBox(-2.1F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
/*  90 */     setRotateAngle(this.LegLB_Cow, 0.2443461F, 0.0F, 0.0F);
/*  91 */     this.LegRB_Cow = new ModelRenderer(this, 0, 16);
/*  92 */     this.LegRB_Cow.setRotationPoint(-4.0F, 5.0F, -7.0F);
/*  93 */     this.LegRB_Cow.addBox(-1.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
/*  94 */     setRotateAngle(this.LegRB_Cow, 0.2443461F, 0.0F, 0.0F);
/*  95 */     this.HornR_Cow = new ModelRenderer(this, 22, 0);
/*  96 */     this.HornR_Cow.setRotationPoint(-5.0F, -5.0F, -3.0F);
/*  97 */     this.HornR_Cow.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
/*  98 */     this.LegLF_Cow = new ModelRenderer(this, 0, 16);
/*  99 */     this.LegLF_Cow.setRotationPoint(4.0F, -8.0F, -7.0F);
/* 100 */     this.LegLF_Cow.addBox(-2.1F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
/* 101 */     setRotateAngle(this.LegLF_Cow, -3.1415927F, 0.0F, 0.0F);
/* 102 */     this.Head_Cow = new ModelRenderer(this, 0, 0);
/* 103 */     this.Head_Cow.setRotationPoint(0.0F, -11.0F, 0.0F);
/* 104 */     this.Head_Cow.addBox(-4.0F, -4.0F, -5.0F, 8, 8, 6, 0.0F);
/* 105 */     setRotateAngle(this.Head_Cow, -0.7853982F, 0.0F, 0.0F);
/* 106 */     this.HornL_Cow = new ModelRenderer(this, 22, 0);
/* 107 */     this.HornL_Cow.setRotationPoint(4.0F, -5.0F, -3.0F);
/* 108 */     this.HornL_Cow.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
/* 109 */     this.Body_Cow = new ModelRenderer(this, 18, 4);
/* 110 */     this.Body_Cow.setRotationPoint(0.0F, 0.0F, -5.0F);
/* 111 */     this.Body_Cow.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
/* 112 */     setRotateAngle(this.Body_Cow, 3.1415927F, 0.0F, 0.0F);
/* 113 */     this.LegRF_Cow = new ModelRenderer(this, 0, 16);
/* 114 */     this.LegRF_Cow.setRotationPoint(-4.0F, -8.0F, -7.0F);
/* 115 */     this.LegRF_Cow.addBox(-1.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
/* 116 */     setRotateAngle(this.LegRF_Cow, -3.1415927F, 0.0F, 0.0F);
/* 117 */     this.Udder_Cow = new ModelRenderer(this, 52, 0);
/* 118 */     this.Udder_Cow.setRotationPoint(0.0F, 0.0F, 0.0F);
/* 119 */     this.Udder_Cow.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
/* 120 */     this.Body_Cow.addChild(this.LegLB_Cow);
/* 121 */     this.Body_Cow.addChild(this.LegRB_Cow);
/* 122 */     this.Head_Cow.addChild(this.HornR_Cow);
/* 123 */     this.Body_Cow.addChild(this.LegLF_Cow);
/* 124 */     this.Body_Cow.addChild(this.Head_Cow);
/* 125 */     this.Head_Cow.addChild(this.HornL_Cow);
/* 126 */     this.Body_Cow.addChild(this.LegRF_Cow);
/* 127 */     this.Body_Cow.addChild(this.Udder_Cow);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
/* 134 */     modelRenderer.rotateAngleX = x;
/* 135 */     modelRenderer.rotateAngleY = y;
/* 136 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\meathook\carcassRenderers\ModelCowHooked.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */