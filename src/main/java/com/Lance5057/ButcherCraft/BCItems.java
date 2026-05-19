/*     */ package com.Lance5057.ButcherCraft;
/*     */ 
/*     */ import com.Lance5057.ButcherCraft.core.ItemCarcass;
/*     */ import com.Lance5057.ButcherCraft.core.ItemMisc;
/*     */ import com.Lance5057.ButcherCraft.core.food.ItemButcherFood;
/*     */ import com.Lance5057.ButcherCraft.core.tools.ItemButcherTool;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.event.RegistryEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*     */ import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
/*     */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/*     */ import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.registry.GameRegistry;
/*     */ import net.minecraftforge.registries.IForgeRegistry;
/*     */ import net.minecraftforge.registries.IForgeRegistryEntry;
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber(modid = "butchercraft")
/*     */ public class BCItems
/*     */ {
/*  27 */   public static final CreativeTabs butcherTab = new CreativeTabs("butchercraft.items")
/*     */     {
/*     */       public ItemStack createIcon() {
/*  30 */         return new ItemStack(Items.COOKED_BEEF);
/*     */       }
/*     */     };
/*     */   
/*  34 */   static List<Item> items = new ArrayList<Item>();
/*     */   
/*     */   public static ItemButcherTool butcherKnife;
/*     */   
/*     */   public static ItemButcherTool skinningKnife;
/*     */   
/*     */   public static ItemButcherTool boneSaw;
/*     */   
/*     */   public static ItemButcherTool spatula;
/*     */   
/*     */   public static ItemButcherTool grindTip;
/*     */   
/*     */   public static ItemButcherTool sausageTip;
/*     */   
/*     */   public static ItemButcherFood brain;
/*     */   
/*     */   public static ItemButcherFood brainCooked;
/*     */   
/*     */   public static ItemButcherFood heart;
/*     */   
/*     */   public static ItemButcherFood heartCooked;
/*     */   
/*     */   public static ItemButcherFood kidney;
/*     */   
/*     */   public static ItemButcherFood kidneyCooked;
/*     */   public static ItemButcherFood liver;
/*     */   public static ItemButcherFood liverCooked;
/*     */   public static ItemButcherFood lung;
/*     */   public static ItemButcherFood lungCooked;
/*     */   public static ItemButcherFood stomache;
/*     */   public static ItemButcherFood stomacheCooked;
/*     */   public static ItemButcherFood tripe;
/*     */   public static ItemButcherFood tripeCooked;
/*     */   public static ItemButcherFood stewMeat;
/*     */   public static ItemButcherFood stewMeatCooked;
/*     */   public static ItemButcherFood sausage;
/*     */   public static ItemButcherFood sausageCooked;
/*     */   public static ItemButcherFood roast;
/*     */   public static ItemButcherFood roastCooked;
/*     */   public static ItemButcherFood ribs;
/*     */   public static ItemButcherFood ribsCooked;
/*     */   public static ItemButcherFood cubedMeat;
/*     */   public static ItemButcherFood cubedMeatCooked;
/*     */   public static ItemButcherFood groundMeat;
/*     */   public static ItemButcherFood groundMeatCooked;
/*     */   public static ItemButcherFood scrapMeat;
/*     */   public static ItemButcherFood scrapMeatCooked;
/*     */   public static ItemButcherFood burgerPatty;
/*     */   public static ItemButcherFood burgerPattyCooked;
/*     */   public static ItemButcherFood burger;
/*     */   public static ItemButcherFood kabob;
/*     */   public static ItemButcherFood kabobCooked;
/*     */   public static ItemButcherFood stew;
/*     */   public static ItemButcherFood potRoast;
/*     */   public static ItemButcherFood potRoastCooked;
/*     */   public static ItemButcherFood sausageInBun;
/*     */   public static ItemMisc leatherScrap;
/*     */   public static ItemMisc leatherCord;
/*     */   public static ItemMisc fat;
/*     */   public static ItemMisc sinew;
/*     */   public static Item cowCarcass;
/*     */   
/*     */   public void preInit(FMLPreInitializationEvent e) {
/*  97 */     items.add(butcherKnife = new ItemButcherTool("butcherknife"));
/*  98 */     items.add(skinningKnife = new ItemButcherTool("skinningknife"));
/*  99 */     items.add(boneSaw = new ItemButcherTool("bonesaw"));
/* 100 */     items.add(spatula = new ItemButcherTool("spatula"));
/* 101 */     items.add(grindTip = new ItemButcherTool("grindtip"));
/* 102 */     items.add(sausageTip = new ItemButcherTool("sausagetip"));
/*     */     
/* 104 */     items.add(brain = new ItemButcherFood(3, 0.1F, true, false, "brain"));
/* 105 */     items.add(brainCooked = new ItemButcherFood(4, 0.2F, true, true, "braincooked"));
/* 106 */     items.add(heart = new ItemButcherFood(3, 0.1F, true, false, "heart"));
/* 107 */     items.add(heartCooked = new ItemButcherFood(6, 0.2F, true, true, "heartCooked"));
/* 108 */     items.add(kidney = new ItemButcherFood(1, 0.1F, true, false, "kidney"));
/* 109 */     items.add(kidneyCooked = new ItemButcherFood(2, 0.2F, true, true, "kidneyCooked"));
/* 110 */     items.add(liver = new ItemButcherFood(3, 0.2F, true, false, "liver"));
/* 111 */     items.add(liverCooked = new ItemButcherFood(6, 0.4F, true, true, "liverCooked"));
/* 112 */     items.add(lung = new ItemButcherFood(4, 0.2F, true, false, "lung"));
/* 113 */     items.add(lungCooked = new ItemButcherFood(8, 0.4F, true, true, "lungCooked"));
/* 114 */     items.add(stomache = new ItemButcherFood(2, 0.1F, true, false, "stomache"));
/* 115 */     items.add(stomacheCooked = new ItemButcherFood(4, 0.2F, true, true, "stomacheCooked"));
/* 116 */     items.add(tripe = new ItemButcherFood(3, 0.1F, true, false, "tripe"));
/* 117 */     items.add(tripeCooked = new ItemButcherFood(6, 0.2F, true, true, "tripeCooked"));
/*     */     
/* 119 */     items.add(stewMeat = new ItemButcherFood(6, 0.2F, true, true, "stewMeat"));
/* 120 */     items.add(stewMeatCooked = new ItemButcherFood(6, 0.2F, true, true, "stewMeatCooked"));
/* 121 */     items.add(sausage = new ItemButcherFood(6, 0.2F, true, true, "sausage"));
/* 122 */     items.add(sausageCooked = new ItemButcherFood(6, 0.2F, true, true, "sausageCooked"));
/* 123 */     items.add(roast = new ItemButcherFood(6, 0.2F, true, true, "roast"));
/* 124 */     items.add(roastCooked = new ItemButcherFood(6, 0.2F, true, true, "roastCooked"));
/* 125 */     items.add(ribs = new ItemButcherFood(6, 0.2F, true, true, "ribs"));
/* 126 */     items.add(ribsCooked = new ItemButcherFood(6, 0.2F, true, true, "ribsCooked"));
/* 127 */     items.add(cubedMeat = new ItemButcherFood(6, 0.2F, true, true, "cubedMeat"));
/* 128 */     items.add(cubedMeatCooked = new ItemButcherFood(6, 0.2F, true, true, "cubedMeatCooked"));
/* 129 */     items.add(groundMeat = new ItemButcherFood(6, 0.2F, true, true, "groundMeat"));
/* 130 */     items.add(groundMeatCooked = new ItemButcherFood(6, 0.2F, true, true, "groundMeatCooked"));
/* 131 */     items.add(scrapMeat = new ItemButcherFood(6, 0.2F, true, true, "scrapMeat"));
/* 132 */     items.add(scrapMeatCooked = new ItemButcherFood(6, 0.2F, true, true, "scrapMeatCooked"));
/*     */     
/* 134 */     items.add(burgerPatty = new ItemButcherFood(6, 0.2F, true, false, "burgerPatty"));
/* 135 */     items.add(burgerPattyCooked = new ItemButcherFood(6, 0.2F, true, true, "burgerPattyCooked"));
/* 136 */     items.add(burger = new ItemButcherFood(6, 0.2F, true, true, "burger"));
/* 137 */     items.add(kabob = new ItemButcherFood(6, 0.2F, false, false, "kabob"));
/* 138 */     items.add(kabobCooked = new ItemButcherFood(6, 0.2F, false, true, "kabobCooked"));
/* 139 */     items.add(stew = new ItemButcherFood(6, 0.2F, false, true, "stew"));
/* 140 */     items.add(potRoast = new ItemButcherFood(6, 0.2F, false, false, "potRoast"));
/* 141 */     items.add(potRoastCooked = new ItemButcherFood(6, 0.2F, false, true, "potRoastCooked"));
/* 142 */     items.add(sausageInBun = new ItemButcherFood(6, 0.2F, false, true, "sausageInBun"));
/*     */     
/* 144 */     items.add(leatherScrap = new ItemMisc("leatherScrap", "itemString"));
/* 145 */     items.add(leatherCord = new ItemMisc("leatherCord", "itemString"));
/* 146 */     items.add(fat = new ItemMisc("fat", "slimeball"));
/* 147 */     items.add(sinew = new ItemMisc("sinew", "itemString"));
/*     */     
/* 149 */     items.add(cowCarcass = (Item)new ItemCarcass("cowcarcass"));
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void registerItems(RegistryEvent.Register<Item> event) {
/* 154 */     IForgeRegistry<Item> registry = event.getRegistry();
/*     */     
/* 156 */     for (Item i : items) {
/* 157 */       registry.register(i);
/*     */     }
/*     */   }
/*     */   
/*     */   public void init(FMLInitializationEvent e) {
/* 162 */     butcherKnife.setCreativeTab(butcherTab);
/* 163 */     skinningKnife.setCreativeTab(butcherTab);
/* 164 */     boneSaw.setCreativeTab(butcherTab);
/* 165 */     spatula.setCreativeTab(butcherTab);
/* 166 */     grindTip.setCreativeTab(butcherTab);
/* 167 */     sausageTip.setCreativeTab(butcherTab);
/*     */     
/* 169 */     brain.setCreativeTab(butcherTab);
/* 170 */     brainCooked.setCreativeTab(butcherTab);
/* 171 */     heart.setCreativeTab(butcherTab);
/* 172 */     heartCooked.setCreativeTab(butcherTab);
/* 173 */     kidney.setCreativeTab(butcherTab);
/* 174 */     kidneyCooked.setCreativeTab(butcherTab);
/* 175 */     liver.setCreativeTab(butcherTab);
/* 176 */     liverCooked.setCreativeTab(butcherTab);
/* 177 */     lung.setCreativeTab(butcherTab);
/* 178 */     lungCooked.setCreativeTab(butcherTab);
/* 179 */     stomache.setCreativeTab(butcherTab);
/* 180 */     stomacheCooked.setCreativeTab(butcherTab);
/* 181 */     tripe.setCreativeTab(butcherTab);
/* 182 */     tripeCooked.setCreativeTab(butcherTab);
/*     */     
/* 184 */     stewMeat.setCreativeTab(butcherTab);
/* 185 */     stewMeatCooked.setCreativeTab(butcherTab);
/* 186 */     sausage.setCreativeTab(butcherTab);
/* 187 */     sausageCooked.setCreativeTab(butcherTab);
/* 188 */     roast.setCreativeTab(butcherTab);
/* 189 */     roastCooked.setCreativeTab(butcherTab);
/* 190 */     ribs.setCreativeTab(butcherTab);
/* 191 */     ribsCooked.setCreativeTab(butcherTab);
/* 192 */     cubedMeat.setCreativeTab(butcherTab);
/* 193 */     cubedMeatCooked.setCreativeTab(butcherTab);
/* 194 */     groundMeat.setCreativeTab(butcherTab);
/* 195 */     groundMeatCooked.setCreativeTab(butcherTab);
/* 196 */     scrapMeat.setCreativeTab(butcherTab);
/* 197 */     scrapMeatCooked.setCreativeTab(butcherTab);
/*     */     
/* 199 */     burgerPatty.setCreativeTab(butcherTab);
/* 200 */     burgerPattyCooked.setCreativeTab(butcherTab);
/* 201 */     burger.setCreativeTab(butcherTab);
/* 202 */     kabob.setCreativeTab(butcherTab);
/* 203 */     kabobCooked.setCreativeTab(butcherTab);
/* 204 */     stew.setCreativeTab(butcherTab);
/* 205 */     potRoast.setCreativeTab(butcherTab);
/* 206 */     potRoastCooked.setCreativeTab(butcherTab);
/* 207 */     sausageInBun.setCreativeTab(butcherTab);
/*     */     
/* 209 */     leatherScrap.setCreativeTab(butcherTab);
/* 210 */     leatherCord.setCreativeTab(butcherTab);
/* 211 */     fat.setCreativeTab(butcherTab);
/* 212 */     sinew.setCreativeTab(butcherTab);
/*     */     
/* 214 */     cowCarcass.setCreativeTab(butcherTab);
/*     */   }
/*     */   
/*     */   public void postInit(FMLPostInitializationEvent e) {
/* 218 */     GameRegistry.addSmelting((Item)brain, new ItemStack((Item)brainCooked), 0.0F);
/* 219 */     GameRegistry.addSmelting((Item)heart, new ItemStack((Item)heartCooked), 0.0F);
/* 220 */     GameRegistry.addSmelting((Item)kidney, new ItemStack((Item)kidneyCooked), 0.0F);
/* 221 */     GameRegistry.addSmelting((Item)liver, new ItemStack((Item)liverCooked), 0.0F);
/* 222 */     GameRegistry.addSmelting((Item)lung, new ItemStack((Item)lungCooked), 0.0F);
/* 223 */     GameRegistry.addSmelting((Item)stomache, new ItemStack((Item)stomacheCooked), 0.0F);
/* 224 */     GameRegistry.addSmelting((Item)tripe, new ItemStack((Item)tripeCooked), 0.0F);
/*     */     
/* 226 */     GameRegistry.addSmelting((Item)stewMeat, new ItemStack((Item)stewMeatCooked), 0.0F);
/* 227 */     GameRegistry.addSmelting((Item)sausage, new ItemStack((Item)sausageCooked), 0.0F);
/* 228 */     GameRegistry.addSmelting((Item)roast, new ItemStack((Item)roastCooked), 0.0F);
/* 229 */     GameRegistry.addSmelting((Item)ribs, new ItemStack((Item)ribsCooked), 0.0F);
/* 230 */     GameRegistry.addSmelting((Item)cubedMeat, new ItemStack((Item)cubedMeatCooked), 0.0F);
/* 231 */     GameRegistry.addSmelting((Item)groundMeat, new ItemStack((Item)groundMeatCooked), 0.0F);
/* 232 */     GameRegistry.addSmelting((Item)scrapMeat, new ItemStack((Item)scrapMeatCooked), 0.0F);
/*     */     
/* 234 */     GameRegistry.addSmelting((Item)burgerPatty, new ItemStack((Item)burgerPattyCooked), 0.0F);
/* 235 */     GameRegistry.addSmelting((Item)kabob, new ItemStack((Item)kabobCooked), 0.0F);
/* 236 */     GameRegistry.addSmelting((Item)potRoast, new ItemStack((Item)potRoastCooked), 0.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\BCItems.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */