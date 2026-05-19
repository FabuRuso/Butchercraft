/*    */ package com.Lance5057.ButcherCraft.core.meathook;
/*    */ 
/*    */ import com.Lance5057.ButcherCraft.core.meathook.carcassRenderers.ModelCowHooked;
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ 
/*    */ public class MeatHookTESR
/*    */   extends TileEntitySpecialRenderer<MeatHookTileEntity>
/*    */ {
/* 13 */   public final ResourceLocation texture = new ResourceLocation("butchercraft", "models/Hook.png");
/*    */   
/* 15 */   public final MeatHookModel hook = new MeatHookModel();
/*    */ 
/*    */   
/* 18 */   public final ModelCowHooked cow = new ModelCowHooked();
/* 19 */   public final ResourceLocation cowTexture = new ResourceLocation("butchercraft", "models/cowHooked.png");
/* 20 */   public final ResourceLocation cowSkinnedTexture = new ResourceLocation("butchercraft", "models/cowHookedSkinned.png");
/*    */   
/* 22 */   public final ResourceLocation cowSkinnedDelimbedTexture = new ResourceLocation("butchercraft", "models/cowHookedSkinnedDelimbed.png");
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void render(MeatHookTileEntity te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
/* 28 */     GlStateManager.pushMatrix();
/*    */     
/* 30 */     GlStateManager.translate(x, y, z);
/* 31 */     GlStateManager.disableRescaleNormal();
/*    */     
/* 33 */     GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
/* 34 */     GlStateManager.translate(0.5D, -1.5D, -0.75D);
/*    */     
/* 36 */     bindTexture(this.texture);
/*    */     
/* 38 */     this.hook.doRender();
/* 39 */     if (te.carcassType.compareTo("cow") == 0) {
/* 40 */       GlStateManager.translate(0.0D, 2.0D, 0.4D);
/*    */       
/* 42 */       if (te.curStage == 0) {
/*    */         
/* 44 */         this.cow.normalMode();
/* 45 */         bindTexture(this.cowTexture);
/*    */       }
/* 47 */       else if (te.curStage >= 1 && te.curStage < 3) {
/* 48 */         bindTexture(this.cowSkinnedTexture);
/* 49 */       } else if (te.curStage == 3) {
/*    */         
/* 51 */         GlStateManager.translate(0.0D, -0.3D, -0.0D);
/* 52 */         this.cow.meatMode();
/* 53 */         bindTexture(this.cowSkinnedDelimbedTexture);
/*    */       } 
/* 55 */       this.cow.doRender();
/*    */     } 
/* 57 */     GlStateManager.popMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\meathook\MeatHookTESR.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */