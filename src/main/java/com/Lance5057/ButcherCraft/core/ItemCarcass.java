/*    */ package com.Lance5057.ButcherCraft.core;
/*    */ 
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemCarcass
/*    */   extends Item
/*    */ {
/*    */   public ItemCarcass(String name) {
/* 13 */     setRegistryName("butchercraft:" + name);
/* 14 */     setTranslationKey("butchercraft." + name);
/*    */   }
/*    */   
/*    */   private NBTTagCompound getTagCompoundSafe(ItemStack stack) {
/* 18 */     NBTTagCompound tagCompound = stack.getTagCompound();
/* 19 */     if (tagCompound == null) {
/* 20 */       tagCompound = new NBTTagCompound();
/* 21 */       stack.setTagCompound(tagCompound);
/*    */     } 
/* 23 */     return tagCompound;
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\ItemCarcass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */