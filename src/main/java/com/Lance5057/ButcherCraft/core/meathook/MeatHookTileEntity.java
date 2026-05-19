/*     */ package com.Lance5057.ButcherCraft.core.meathook;
/*     */ 
/*     */ import com.Lance5057.ButcherCraft.BCItems;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.state.IBlockState;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.network.NetworkManager;
/*     */ import net.minecraft.network.play.server.SPacketUpdateTileEntity;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.text.ITextComponent;
/*     */ import net.minecraft.util.text.TextComponentTranslation;
/*     */ 
/*     */ public class MeatHookTileEntity extends TileEntity {
/*  22 */   private String tag = "carcass";
/*  23 */   public String carcassType = "none";
/*  24 */   public int curStage = 0;
/*     */ 
/*     */   
/*  27 */   public int completion = 0;
/*     */   
/*  29 */   public int completionRate = 25;
/*     */   
/*     */   public void addCarcass(Item carcass) {
/*  32 */     if (carcass == BCItems.cowCarcass) {
/*  33 */       this.carcassType = "cow";
/*     */     }
/*  35 */     this.curStage = 0;
/*  36 */     markDirty();
/*     */     
/*  38 */     if (this.world != null) {
/*  39 */       IBlockState state = this.world.getBlockState(getPos());
/*  40 */       this.world.notifyBlockUpdate(getPos(), state, state, 3);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void useTool(Item tool, EntityPlayer player) {
/*  45 */     if (this.carcassType != "none") {
/*  46 */       int leather; int scrap; switch (this.curStage) {
/*     */         case 0:
/*  48 */           leather = this.world.rand.nextInt(4) + 8;
/*  49 */           scrap = (16 - leather) * 2;
/*  50 */           stageProgression(player, tool, (Item)BCItems.skinningKnife, "te.meathook.skinningMessage", new ItemStack[] { new ItemStack(Items.LEATHER, leather), new ItemStack((Item)BCItems.leatherScrap, scrap), new ItemStack((Item)BCItems.fat, this.world.rand
/*     */ 
/*     */                   
/*  53 */                   .nextInt(8) + 4), new ItemStack((Item)BCItems.sinew, this.world.rand
/*  54 */                   .nextInt(8) + 4) });
/*     */           break;
/*     */         
/*     */         case 1:
/*  58 */           stageProgression(player, tool, Items.AIR, "te.meathook.deoffalMessage", new ItemStack[] { new ItemStack((Item)BCItems.heart, 1), new ItemStack((Item)BCItems.kidney, 2), new ItemStack((Item)BCItems.liver, 1), new ItemStack((Item)BCItems.stomache, 4), new ItemStack((Item)BCItems.lung, 2), new ItemStack((Item)BCItems.tripe, 8) });
/*     */           break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case 2:
/*  68 */           stageProgression(player, tool, (Item)BCItems.boneSaw, "te.meathook.delimbMessage", new ItemStack[] { new ItemStack((Item)BCItems.brain, 1), new ItemStack((Block)Blocks.SKULL, 1), new ItemStack((Item)BCItems.leatherScrap, this.world.rand
/*     */ 
/*     */                   
/*  71 */                   .nextInt(4)), new ItemStack((Item)BCItems.scrapMeat, this.world.rand
/*  72 */                   .nextInt(8)), new ItemStack(Items.BONE, 4) });
/*     */           break;
/*     */ 
/*     */         
/*     */         case 3:
/*  77 */           stageProgression(player, tool, (Item)BCItems.butcherKnife, "te.meathook.butcherMessage", new ItemStack[] { new ItemStack((Item)BCItems.scrapMeat, this.world.rand
/*  78 */                   .nextInt(16)), new ItemStack((Item)BCItems.ribs, 4), new ItemStack((Item)BCItems.roast, this.world.rand
/*     */                   
/*  80 */                   .nextInt(8) + 4), new ItemStack((Item)BCItems.stewMeat, this.world.rand
/*  81 */                   .nextInt(8) + 4), new ItemStack((Item)BCItems.cubedMeat, this.world.rand
/*  82 */                   .nextInt(8) + 4), new ItemStack(Items.BEEF, this.world.rand
/*  83 */                   .nextInt(8) + 4), new ItemStack(Items.BONE, this.world.rand
/*  84 */                   .nextInt(8) + 8) });
/*     */           break;
/*     */       } 
/*     */     } 
/*  88 */     markDirty();
/*     */     
/*  90 */     if (this.world != null) {
/*  91 */       IBlockState state = this.world.getBlockState(getPos());
/*  92 */       this.world.notifyBlockUpdate(getPos(), state, state, 3);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void stageProgression(EntityPlayer player, Item curTool, Item reqTool, String message, ItemStack... returns) {
/*  98 */     if (curTool == reqTool) {
/*  99 */       this.completion = this.completion + this.completionRate + this.world.rand.nextInt(this.completionRate);
/*     */       
/* 101 */       if (this.completion >= 100) {
/* 102 */         this.completion = 0;
/* 103 */         this.curStage++;
/*     */         
/* 105 */         for (int i = 0; i < returns.length; i++) {
/* 106 */           this.world.spawnEntity((Entity)new EntityItem(this.world, this.pos
/* 107 */                 .getX(), this.pos.getY(), this.pos.getZ(), returns[i]));
/*     */         }
/* 109 */         if (this.curStage > 3) {
/*     */           
/* 111 */           this.curStage = 0;
/* 112 */           this.carcassType = "none";
/*     */         } 
/*     */       } 
/*     */     } else {
/* 116 */       player.sendMessage((ITextComponent)new TextComponentTranslation(message, new Object[0]));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public NBTTagCompound getUpdateTag() {
/* 122 */     return writeToNBT(new NBTTagCompound());
/*     */   }
/*     */ 
/*     */   
/*     */   public SPacketUpdateTileEntity getUpdatePacket() {
/* 127 */     NBTTagCompound nbtTag = new NBTTagCompound();
/* 128 */     writeToNBT(nbtTag);
/* 129 */     return new SPacketUpdateTileEntity(getPos(), 1, nbtTag);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity packet) {
/* 134 */     readFromNBT(packet.getNbtCompound());
/*     */   }
/*     */ 
/*     */   
/*     */   public void readFromNBT(NBTTagCompound compound) {
/* 139 */     super.readFromNBT(compound);
/*     */     
/* 141 */     NBTTagCompound custom = (NBTTagCompound)compound.getTag(this.tag);
/* 142 */     this.carcassType = custom.getString("carcassType");
/* 143 */     this.curStage = custom.getInteger("stage");
/* 144 */     this.completion = custom.getInteger("completion");
/*     */   }
/*     */ 
/*     */   
/*     */   public NBTTagCompound writeToNBT(NBTTagCompound compound) {
/* 149 */     super.writeToNBT(compound);
/*     */     
/* 151 */     NBTTagCompound custom = new NBTTagCompound();
/* 152 */     custom.setString("carcassType", this.carcassType);
/* 153 */     custom.setInteger("stage", this.curStage);
/* 154 */     custom.setInteger("completion", this.completion);
/* 155 */     compound.setTag(this.tag, (NBTBase)custom);
/*     */     
/* 157 */     return compound;
/*     */   }
/*     */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\meathook\MeatHookTileEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */