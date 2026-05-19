/*    */ package com.Lance5057.ButcherCraft.core.food;
/*    */ 
/*    */ import net.minecraft.item.ItemFood;
/*    */ import net.minecraft.potion.Potion;
/*    */ import net.minecraft.potion.PotionEffect;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemButcherFood
/*    */   extends ItemFood
/*    */ {
/*    */   public ItemButcherFood(int amount, float saturation, boolean isWolfFood, boolean isCooked, String name) {
/* 18 */     super(amount, saturation, isWolfFood);
/* 19 */     setRegistryName("butchercraft:" + name);
/* 20 */     setTranslationKey("butchercraft." + name);
/* 21 */     if (!isCooked)
/* 22 */       setPotionEffect(new PotionEffect(Potion.getPotionById(17), 600), 0.5F); 
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\food\ItemButcherFood.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */