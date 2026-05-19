/*    */ package com.Lance5057.ButcherCraft.core.grill;
/*    */ 
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GrillTESR
/*    */   extends TileEntitySpecialRenderer<GrillTileEntity>
/*    */ {
/* 13 */   public final ResourceLocation texture = new ResourceLocation("butchercraft", "models/grill.png");
/*    */   
/* 15 */   public final GrillModel grill = new GrillModel();
/*    */ 
/*    */   
/*    */   public void render(GrillTileEntity te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
/* 19 */     GlStateManager.pushMatrix();
/*    */     
/* 21 */     GlStateManager.translate(x, y, z);
/* 22 */     GlStateManager.disableRescaleNormal();
/*    */     
/* 24 */     GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
/* 25 */     GlStateManager.translate(0.5D, -1.5D, -0.5D);
/*    */     
/* 27 */     bindTexture(this.texture);
/* 28 */     this.grill.doRender(te.charcoal, te.food, te.timer);
/*    */     
/* 30 */     GlStateManager.popMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\grill\GrillTESR.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */