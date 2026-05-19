/*    */ package com.Lance5057.ButcherCraft.proxy;
/*    */ 
/*    */ import com.Lance5057.ButcherCraft.BCBlocks;
/*    */ import com.Lance5057.ButcherCraft.BCItems;
/*    */ import com.Lance5057.ButcherCraft.Butchercraft;
import net.minecraft.block.Block;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/*    */
@Mod.EventBusSubscriber(Side.CLIENT)
/*    */ public class ClientProxy
/*    */   extends CommonProxy
/*    */ {
/*    */   public void preInit(FMLPreInitializationEvent e) {
/* 16 */     super.preInit(e);
/*    */     
/* 18 */     BCBlocks.meatHook.initModel();
/* 19 */     BCBlocks.meatGrinder.initModel();
/* 20 */     BCBlocks.grill.initModel();
/*    */     
/* 22 */
/*    */   }
/*    */ 
/*    */   
/*    */   public void init(FMLInitializationEvent e) {
/* 83 */     super.init(e);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void registerItemRenderer(Item item, int meta) {
    Butchercraft.LOGGER.info("Registering of item model: ",  item.getUnlocalizedNameInefficiently(new ItemStack(item)));
/* 88 */     ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
/*    */   }
/*    */ 
/*    */   
/*    */   public static void registerBlockRenderer(Block block, int meta) {
/* 93 */     ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Item.getItemFromBlock(block).getRegistryName(), "inventory"));
/*    */   }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent _Event) {
        registerItemRenderer((Item)BCItems.butcherKnife, 0);
        /* 23 */     registerItemRenderer((Item)BCItems.skinningKnife, 0);
        /* 24 */     registerItemRenderer((Item)BCItems.spatula, 0);
        /* 25 */     registerItemRenderer((Item)BCItems.boneSaw, 0);
        /* 26 */     registerItemRenderer((Item)BCItems.grindTip, 0);
        /* 27 */     registerItemRenderer((Item)BCItems.sausageTip, 0);
        /*    */
        /* 29 */     registerItemRenderer((Item)BCItems.brain, 0);
        /* 30 */     registerItemRenderer((Item)BCItems.brainCooked, 0);
        /* 31 */     registerItemRenderer((Item)BCItems.heart, 0);
        /* 32 */     registerItemRenderer((Item)BCItems.heartCooked, 0);
        /* 33 */     registerItemRenderer((Item)BCItems.kidney, 0);
        /* 34 */     registerItemRenderer((Item)BCItems.kidneyCooked, 0);
        /* 35 */     registerItemRenderer((Item)BCItems.liver, 0);
        /* 36 */     registerItemRenderer((Item)BCItems.liverCooked, 0);
        /* 37 */     registerItemRenderer((Item)BCItems.lung, 0);
        /* 38 */     registerItemRenderer((Item)BCItems.lungCooked, 0);
        /* 39 */     registerItemRenderer((Item)BCItems.stomache, 0);
        /* 40 */     registerItemRenderer((Item)BCItems.stomacheCooked, 0);
        /* 41 */     registerItemRenderer((Item)BCItems.tripe, 0);
        /* 42 */     registerItemRenderer((Item)BCItems.tripeCooked, 0);
        /*    */
        /* 44 */     registerItemRenderer((Item)BCItems.stewMeat, 0);
        /* 45 */     registerItemRenderer((Item)BCItems.stewMeatCooked, 0);
        /* 46 */     registerItemRenderer((Item)BCItems.sausage, 0);
        /* 47 */     registerItemRenderer((Item)BCItems.sausageCooked, 0);
        /* 48 */     registerItemRenderer((Item)BCItems.roast, 0);
        /* 49 */     registerItemRenderer((Item)BCItems.roastCooked, 0);
        /* 50 */     registerItemRenderer((Item)BCItems.ribs, 0);
        /* 51 */     registerItemRenderer((Item)BCItems.ribsCooked, 0);
        /* 52 */     registerItemRenderer((Item)BCItems.cubedMeat, 0);
        /* 53 */     registerItemRenderer((Item)BCItems.cubedMeatCooked, 0);
        /* 54 */     registerItemRenderer((Item)BCItems.groundMeat, 0);
        /* 55 */     registerItemRenderer((Item)BCItems.groundMeatCooked, 0);
        /* 56 */     registerItemRenderer((Item)BCItems.scrapMeat, 0);
        /* 57 */     registerItemRenderer((Item)BCItems.scrapMeatCooked, 0);
        /*    */
        /* 59 */     registerItemRenderer((Item)BCItems.burgerPatty, 0);
        /* 60 */     registerItemRenderer((Item)BCItems.burgerPattyCooked, 0);
        /* 61 */     registerItemRenderer((Item)BCItems.burger, 0);
        /* 62 */     registerItemRenderer((Item)BCItems.kabob, 0);
        /* 63 */     registerItemRenderer((Item)BCItems.kabobCooked, 0);
        /* 64 */     registerItemRenderer((Item)BCItems.stew, 0);
        /* 65 */     registerItemRenderer((Item)BCItems.potRoast, 0);
        /* 66 */     registerItemRenderer((Item)BCItems.potRoastCooked, 0);
        /* 67 */     registerItemRenderer((Item)BCItems.sausageInBun, 0);
        /*    */
        /* 69 */     registerItemRenderer((Item)BCItems.fat, 0);
        /* 70 */     registerItemRenderer((Item)BCItems.leatherCord, 0);
        /* 71 */     registerItemRenderer((Item)BCItems.leatherScrap, 0);
        /* 72 */     registerItemRenderer((Item)BCItems.sinew, 0);
        /*    */
        /* 74 */     registerItemRenderer(BCItems.cowCarcass, 0);
        /*    */
        /* 76 */     registerBlockRenderer((Block)BCBlocks.meatHook, 0);
        /* 77 */     registerBlockRenderer((Block)BCBlocks.meatGrinder, 0);
        /* 78 */     registerBlockRenderer((Block)BCBlocks.grill, 0);
    }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\proxy\ClientProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */