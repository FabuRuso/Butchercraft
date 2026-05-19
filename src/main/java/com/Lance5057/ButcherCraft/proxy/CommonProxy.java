/*    */ package com.Lance5057.ButcherCraft.proxy;
/*    */ 
/*    */ import java.io.File;
/*    */ import net.minecraftforge.common.config.Configuration;
/*    */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CommonProxy
/*    */ {
/*    */   public static Configuration config;
/*    */   
/*    */   public void preInit(FMLPreInitializationEvent e) {
/* 16 */     File directory = e.getModConfigurationDirectory();
/* 17 */     config = new Configuration(new File(directory.getPath(), "butchercraft.cfg"));
/*    */   }
/*    */ 
/*    */   
/*    */   public void init(FMLInitializationEvent e) {}
/*    */   
/*    */   public void postInit(FMLPostInitializationEvent e) {
/* 24 */     if (config.hasChanged())
/* 25 */       config.save(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\proxy\CommonProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */