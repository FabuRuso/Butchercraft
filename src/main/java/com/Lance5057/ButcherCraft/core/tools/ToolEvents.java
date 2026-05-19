/*    */ package com.Lance5057.ButcherCraft.core.tools;
/*    */ 
/*    */ import com.Lance5057.ButcherCraft.BCItems;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.event.entity.living.LivingDropsEvent;
/*    */ import net.minecraftforge.event.entity.living.LivingHurtEvent;
/*    */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*    */ 
/*    */ public class ToolEvents
/*    */ {
/*    */   public ToolEvents() {
/* 15 */     MinecraftForge.EVENT_BUS.register(this);
/*    */   }
/*    */ 
/*    */   
/*    */   @SubscribeEvent
/*    */   public void DropCarcassEvent(LivingDropsEvent e) {
/* 21 */     if (e.getSource() != null && e.getSource().getTrueSource() instanceof EntityPlayer) {
/* 22 */       EntityPlayer player = (EntityPlayer)e.getSource().getTrueSource();
/* 23 */       if (player != null) {
/*    */ 
/*    */         
/* 26 */         ItemStack holding = player.inventory.getStackInSlot(player.inventory.currentItem);
/* 27 */         if (holding != null && holding.getItem() == BCItems.butcherKnife)
/*    */         {
/*    */           
/* 30 */           if (e.getEntity() instanceof net.minecraft.entity.passive.EntityCow) {
/* 31 */             e.getDrops().clear();
/* 32 */             e.getEntityLiving().entityDropItem(new ItemStack(BCItems.cowCarcass), 0.0F);
/*    */           } 
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SubscribeEvent
/*    */   public void SlaughterEvent(LivingHurtEvent e) {
/* 43 */     if (e.getSource() != null && e.getSource().getTrueSource() instanceof EntityPlayer) {
/* 44 */       EntityPlayer player = (EntityPlayer)e.getSource().getTrueSource();
/* 45 */       if (player != null) {
/*    */ 
/*    */         
/* 48 */         ItemStack holding = player.inventory.getStackInSlot(player.inventory.currentItem);
/* 49 */         if (holding != null && holding.getItem() == BCItems.butcherKnife)
/*    */         {
/*    */           
/* 52 */           if (e.getEntity() instanceof net.minecraft.entity.passive.EntityCow) {
/* 53 */             e.getEntityLiving().setHealth(0.0F);
/* 54 */             holding.damageItem(1, (EntityLivingBase)player);
/*    */           } 
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\tools\ToolEvents.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */