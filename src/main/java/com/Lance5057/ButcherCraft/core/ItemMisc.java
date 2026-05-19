/*    */ package com.Lance5057.ButcherCraft.core;
/*    */ 
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraftforge.oredict.OreDictionary;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemMisc
/*    */   extends Item
/*    */ {
/*    */   public ItemMisc(String name, String oreDict) {
/* 12 */     setRegistryName("butchercraft:" + name);
/* 13 */     setTranslationKey("butchercraft." + name);
/*    */     
/* 15 */     if (oreDict != null)
/* 16 */       OreDictionary.registerOre(oreDict, this); 
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\ItemMisc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */