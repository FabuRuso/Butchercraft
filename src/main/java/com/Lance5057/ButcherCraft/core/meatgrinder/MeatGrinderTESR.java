/*    */ package com.Lance5057.ButcherCraft.core.meatgrinder;
/*    */ 
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MeatGrinderTESR
/*    */   extends TileEntitySpecialRenderer<MeatGrinderTileEntity>
/*    */ {
/* 13 */   public final ResourceLocation texture = new ResourceLocation("butchercraft", "models/meatgrinder.png");
/* 14 */   public final ResourceLocation handleTexture = new ResourceLocation("butchercraft", "models/meatgrinderhandle.png");
/*    */   
/* 16 */   public final MeatGrinderModel grinder = new MeatGrinderModel();
/* 17 */   public final MeatGrinderHandleModel handle = new MeatGrinderHandleModel();
/*    */ 
/*    */ 
/*    */   
/*    */   public void render(MeatGrinderTileEntity te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
/* 22 */     GlStateManager.pushMatrix();
/*    */     
/* 24 */     GlStateManager.translate(x, y, z);
/* 25 */     GlStateManager.disableRescaleNormal();
/*    */     
/* 27 */     GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
/* 28 */     GlStateManager.translate(0.5D, -1.5D, -0.5D);
/*    */     
/* 30 */     bindTexture(this.texture);
/* 31 */     this.grinder.doRender(te.extruderItem, te.casing, te.loaded, te.completion, te.grindItem);
/*    */     
/* 33 */     GlStateManager.translate(-1.0F, 0.0F, 0.0F);
/*    */     
/* 35 */     bindTexture(this.handleTexture);
/* 36 */     this.handle.doRender(te.handleRot);
/*    */     
/* 38 */     GlStateManager.popMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\meatgrinder\MeatGrinderTESR.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */