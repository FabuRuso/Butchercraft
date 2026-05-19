/*     */ package com.Lance5057.ButcherCraft.core.meatgrinder;
/*     */ 
/*     */ import com.Lance5057.ButcherCraft.BCItems;
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
/*     */ public class MeatGrinderModel
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer TubeEnd;
/*     */   public ModelRenderer Tube;
/*     */   public ModelRenderer SausageTip;
/*     */   public ModelRenderer Base;
/*     */   public ModelRenderer BaseAttach;
/*     */   public ModelRenderer Funnel;
/*     */   public ModelRenderer Funnel_1;
/*     */   public ModelRenderer Funnel_2;
/*     */   public ModelRenderer GrindTip;
/*     */   public ModelRenderer Sausage;
/*     */   public ModelRenderer Meat;
/*     */   public ModelRenderer SausageEnd;
/*     */   
/*     */   public MeatGrinderModel() {
/*  33 */     this.textureWidth = 64;
/*  34 */     this.textureHeight = 32;
/*  35 */     this.Funnel = new ModelRenderer(this, 20, 18);
/*  36 */     this.Funnel.setRotationPoint(-7.0F, 13.0F, -1.5F);
/*  37 */     this.Funnel.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
/*  38 */     this.SausageTip = new ModelRenderer(this, 50, 0);
/*  39 */     this.SausageTip.setRotationPoint(4.5F, 15.5F, -1.0F);
/*  40 */     this.SausageTip.addBox(0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F);
/*  41 */     this.BaseAttach = new ModelRenderer(this, 16, 11);
/*  42 */     this.BaseAttach.setRotationPoint(-8.0F, 19.0F, -1.0F);
/*  43 */     this.BaseAttach.addBox(0.0F, 0.0F, 0.0F, 8, 3, 2, 0.0F);
/*  44 */     this.Funnel_2 = new ModelRenderer(this, 16, 16);
/*  45 */     this.Funnel_2.setRotationPoint(-8.0F, 11.0F, -2.5F);
/*  46 */     this.Funnel_2.addBox(0.0F, 0.0F, 0.0F, 5, 1, 5, 0.0F);
/*  47 */     this.Base = new ModelRenderer(this, 0, 0);
/*  48 */     this.Base.setRotationPoint(-8.0F, 22.0F, -2.5F);
/*  49 */     this.Base.addBox(0.0F, 0.0F, 0.0F, 12, 2, 5, 0.0F);
/*  50 */     this.GrindTip = new ModelRenderer(this, 52, 4);
/*  51 */     this.GrindTip.setRotationPoint(3.7F, 14.0F, -2.5F);
/*  52 */     this.GrindTip.addBox(0.0F, 0.0F, 0.0F, 1, 5, 5, 0.0F);
/*  53 */     this.Tube = new ModelRenderer(this, 0, 22);
/*  54 */     this.Tube.setRotationPoint(-8.0F, 14.0F, -2.5F);
/*  55 */     this.Tube.addBox(0.0F, 0.0F, 0.0F, 12, 5, 5, 0.0F);
/*  56 */     this.SausageEnd = new ModelRenderer(this, 60, 30);
/*  57 */     this.SausageEnd.setRotationPoint(9.0F, 1.0F, 1.0F);
/*  58 */     this.SausageEnd.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/*  59 */     this.Meat = new ModelRenderer(this, 44, 16);
/*  60 */     this.Meat.setRotationPoint(3.7F, 14.5F, -2.0F);
/*  61 */     this.Meat.addBox(0.0F, 0.0F, 0.0F, 6, 4, 4, 0.0F);
/*  62 */     this.TubeEnd = new ModelRenderer(this, 0, 10);
/*  63 */     this.TubeEnd.setRotationPoint(2.5F, 13.5F, -3.0F);
/*  64 */     this.TubeEnd.addBox(0.0F, 0.0F, 0.0F, 2, 6, 6, 0.0F);
/*  65 */     this.Funnel_1 = new ModelRenderer(this, 18, 17);
/*  66 */     this.Funnel_1.setRotationPoint(-7.5F, 12.0F, -2.0F);
/*  67 */     this.Funnel_1.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
/*  68 */     this.Sausage = new ModelRenderer(this, 40, 26);
/*  69 */     this.Sausage.setRotationPoint(4.5F, 15.0F, -1.5F);
/*  70 */     this.Sausage.addBox(0.0F, 0.0F, 0.0F, 9, 3, 3, 0.0F);
/*  71 */     this.Sausage.addChild(this.SausageEnd);
/*     */   }
/*     */ 
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  76 */     this.Funnel.render(f5);
/*  77 */     this.SausageTip.render(f5);
/*  78 */     this.BaseAttach.render(f5);
/*  79 */     this.Funnel_2.render(f5);
/*  80 */     this.Base.render(f5);
/*  81 */     this.GrindTip.render(f5);
/*  82 */     this.Tube.render(f5);
/*  83 */     this.Meat.render(f5);
/*  84 */     this.TubeEnd.render(f5);
/*  85 */     this.Funnel_1.render(f5);
/*  86 */     this.Sausage.render(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
/*  93 */     modelRenderer.rotateAngleX = x;
/*  94 */     modelRenderer.rotateAngleY = y;
/*  95 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */   public void doRender(ItemStack extruder, boolean casing, boolean loaded, int completion, ItemStack grindItem) {
/*  99 */     float f5 = 0.0625F;
/* 100 */     this.Funnel.render(f5);
/* 101 */     this.BaseAttach.render(f5);
/* 102 */     this.Funnel_2.render(f5);
/* 103 */     this.Base.render(f5);
/* 104 */     this.Tube.render(f5);
/* 105 */     this.TubeEnd.render(f5);
/* 106 */     this.Funnel_1.render(f5);
/*     */     
/* 108 */     if (extruder.getItem() == BCItems.grindTip) {
/* 109 */       this.GrindTip.render(f5);
/* 110 */       if (completion > 0)
/* 111 */         renderMeat(completion, this.Meat, f5); 
/*     */     } 
/* 113 */     if (extruder.getItem() == BCItems.sausageTip) {
/* 114 */       this.SausageTip.render(f5);
/* 115 */       if (casing)
/* 116 */         this.Sausage.render(f5); 
/*     */     } 
/* 118 */     if (grindItem.getItem() != Items.AIR) {
/*     */       
/* 120 */       GlStateManager.pushMatrix();
/* 121 */       (Minecraft.getMinecraft()).renderEngine.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
/*     */       
/* 123 */       GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
/* 124 */       float s = 0.4F;
/* 125 */       GlStateManager.scale(s, s, s);
/* 126 */       GlStateManager.translate(0.9F, -1.5F - completion / 100.0F, 0.0F);
/*     */       
/* 128 */       Minecraft.getMinecraft().getRenderItem().renderItem(grindItem, ItemCameraTransforms.TransformType.NONE);
/* 129 */       GlStateManager.popMatrix();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderMeat(float completion, ModelRenderer meat, float f5) {
/* 135 */     GlStateManager.pushMatrix();
/* 136 */     float comp = completion / 150.0F;
/* 137 */     GlStateManager.translate(comp - 0.6F, 0.0F, 0.0F);
/* 138 */     meat.render(f5);
/* 139 */     GlStateManager.popMatrix();
/*     */   }
/*     */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\meatgrinder\MeatGrinderModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */