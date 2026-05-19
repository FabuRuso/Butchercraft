/*    */ package com.Lance5057.ButcherCraft;
/*    */ 
/*    */ import com.Lance5057.ButcherCraft.core.tools.ToolEvents;
/*    */ import com.Lance5057.ButcherCraft.proxy.CommonProxy;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventHandler;
/*    */ import net.minecraftforge.fml.common.Mod.Instance;
/*    */ import net.minecraftforge.fml.common.SidedProxy;
/*    */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/*    */
/*    */ 
/*    */ 
/*    */ @Mod(modid = "butchercraft", name = "ButcherCraft", version = "0.0.2a", dependencies = "required-after:forge@[13.19.0.2129,)", useMetadata = true, acceptedMinecraftVersions = "[1.12.2]")
/*    */ public class Butchercraft
/*    */ {
/*    */   public static final String MODID = "butchercraft";
/*    */   public static final String MODNAME = "ButcherCraft";
/*    */   public static final String MODVERSION = "0.0.2a";
/*    */   @SidedProxy(clientSide = "com.Lance5057.ButcherCraft.proxy.ClientProxy", serverSide = "com.Lance5057.ButcherCraft.proxy.CommonProxy")
/*    */   public static CommonProxy proxy;
/*    */   public static BCBlocks blocks;
/*    */   public static BCItems items;
/*    */   public static ToolEvents tEvents;
/*    */   @Instance
/*    */   public static Butchercraft instance;

public static Logger LOGGER;
/*    */   
/*    */   @EventHandler
/*    */   public void preInit(FMLPreInitializationEvent e) {
    LOGGER = e.getModLog();

/* 31 */     blocks = new BCBlocks();
/* 32 */     items = new BCItems();
/*    */     
/* 34 */     blocks.preInit(e);
/* 35 */     items.preInit(e);
/*    */     
/* 37 */     proxy.preInit(e);
/*    */     
/* 39 */     tEvents = new ToolEvents();
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void init(FMLInitializationEvent e) {
/* 44 */     blocks.init(e);
/* 45 */     items.init(e);
/*    */     
/* 47 */     proxy.init(e);
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void postInit(FMLPostInitializationEvent e) {
/* 52 */     blocks.postInit(e);
/* 53 */     items.postInit(e);
/*    */     
/* 55 */     proxy.postInit(e);
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\Butchercraft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */