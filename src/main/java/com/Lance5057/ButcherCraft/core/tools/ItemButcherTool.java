/*    */ package com.Lance5057.ButcherCraft.core.tools;
/*    */ 
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemButcherTool
/*    */   extends Item
/*    */ {
/*    */   public ItemButcherTool(String name) {
/* 24 */     setRegistryName("butchercraft:" + name);
/* 25 */     setTranslationKey("butchercraft." + name);
/*    */   }
/*    */   
/*    */   private NBTTagCompound getTagCompoundSafe(ItemStack stack) {
/* 29 */     NBTTagCompound tagCompound = stack.getTagCompound();
/* 30 */     if (tagCompound == null) {
/* 31 */       tagCompound = new NBTTagCompound();
/* 32 */       stack.setTagCompound(tagCompound);
/*    */     } 
/* 34 */     return tagCompound;
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\tools\ItemButcherTool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */