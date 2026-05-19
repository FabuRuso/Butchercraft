/*    */ package com.Lance5057.ButcherCraft;
/*    */ 
/*    */ import com.Lance5057.ButcherCraft.core.grill.GrillBlock;
/*    */ import com.Lance5057.ButcherCraft.core.meatgrinder.MeatGrinderBlock;
/*    */ import com.Lance5057.ButcherCraft.core.meathook.MeatHookBlock;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.init.Items;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemBlock;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.event.RegistryEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/*    */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*    */ import net.minecraftforge.registries.IForgeRegistry;
/*    */ import net.minecraftforge.registries.IForgeRegistryEntry;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(modid = "butchercraft")
/*    */ public class BCBlocks
/*    */ {
/* 28 */   static List<Block> blocks = new ArrayList<Block>();
/* 29 */   static List<ItemBlock> items = new ArrayList<ItemBlock>();
/*    */   
/* 31 */   public static final CreativeTabs butcherTab = new CreativeTabs("butchercraft.blocks")
/*    */     {
/*    */       public ItemStack createIcon() {
/* 34 */         return new ItemStack(Items.BEEF);
/*    */       }
/*    */     };
/*    */   
/*    */   public static MeatHookBlock meatHook;
/*    */   public static MeatGrinderBlock meatGrinder;
/*    */   public static GrillBlock grill;
/*    */   
/*    */   public void preInit(FMLPreInitializationEvent e) {
/* 43 */     blocks.add(meatHook = new MeatHookBlock(Material.IRON));
/* 44 */     blocks.add(meatGrinder = new MeatGrinderBlock(Material.IRON));
/* 45 */     blocks.add(grill = new GrillBlock(Material.IRON));
/*    */     
/* 47 */     items.add(new ItemBlock((Block)meatHook));
/* 48 */     items.add(new ItemBlock((Block)meatGrinder));
/* 49 */     items.add(new ItemBlock((Block)grill));
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerBlocks(RegistryEvent.Register<Block> event) {
/* 54 */     IForgeRegistry<Block> registry = event.getRegistry();
/*    */     
/* 56 */     for (Block b : blocks) {
/* 57 */       registry.register(b);
/*    */     }
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerItems(RegistryEvent.Register<Item> event) {
/* 63 */     IForgeRegistry<Item> registry = event.getRegistry();
/*    */     
/* 65 */     for (ItemBlock i : items) {
/* 66 */       i.setRegistryName(i.getBlock().getRegistryName());
/*    */       
/* 68 */       registry.register( i);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void init(FMLInitializationEvent e) {
/* 73 */     meatHook.setCreativeTab(butcherTab);
/* 74 */     meatGrinder.setCreativeTab(butcherTab);
/* 75 */     grill.setCreativeTab(butcherTab);
/*    */   }
/*    */   
/*    */   public void postInit(FMLPostInitializationEvent e) {}
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\BCBlocks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */