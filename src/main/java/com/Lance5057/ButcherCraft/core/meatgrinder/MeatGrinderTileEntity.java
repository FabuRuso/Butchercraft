/*     */ package com.Lance5057.ButcherCraft.core.meatgrinder;
/*     */ 
/*     */ import com.Lance5057.ButcherCraft.BCItems;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.network.NetworkManager;
/*     */ import net.minecraft.network.play.server.SPacketUpdateTileEntity;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MeatGrinderTileEntity
/*     */   extends TileEntity
/*     */ {
/*  22 */   private String tag = "grinder";
/*  23 */   public String extruderTag = "extruderItem";
/*  24 */   public ItemStack extruderItem = new ItemStack(Items.AIR);
/*     */   public boolean loaded = false;
/*     */   public boolean casing = false;
/*  27 */   public String grindItemTag = "grindItem";
/*  28 */   public ItemStack grindItem = new ItemStack(Items.AIR);
/*  29 */   public float handleRot = 0.0F;
/*     */   
/*  31 */   public int completion = 0;
/*     */ 
/*     */   
/*     */   public NBTTagCompound getUpdateTag() {
/*  35 */     return writeToNBT(new NBTTagCompound());
/*     */   }
/*     */ 
/*     */   
/*     */   public SPacketUpdateTileEntity getUpdatePacket() {
/*  40 */     NBTTagCompound nbtTag = new NBTTagCompound();
/*  41 */     writeToNBT(nbtTag);
/*  42 */     return new SPacketUpdateTileEntity(getPos(), 1, nbtTag);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity packet) {
/*  47 */     readFromNBT(packet.getNbtCompound());
/*     */   }
/*     */ 
/*     */   
/*     */   public void readFromNBT(NBTTagCompound compound) {
/*  52 */     super.readFromNBT(compound);
/*     */     
/*  54 */     NBTTagCompound custom = (NBTTagCompound)compound.getTag(this.tag);
/*  55 */     this.extruderItem = new ItemStack(custom.getCompoundTag(this.extruderTag));
/*  56 */     this.loaded = custom.getBoolean("loaded");
/*  57 */     this.casing = custom.getBoolean("casing");
/*  58 */     this.handleRot = custom.getFloat("handleRot");
/*  59 */     this.completion = custom.getInteger("completion");
/*  60 */     this.grindItem = new ItemStack(custom.getCompoundTag(this.grindItemTag));
/*     */   }
/*     */ 
/*     */   
/*     */   public NBTTagCompound writeToNBT(NBTTagCompound compound) {
/*  65 */     super.writeToNBT(compound);
/*     */     
/*  67 */     NBTTagCompound custom = new NBTTagCompound();
/*  68 */     custom.setTag(this.extruderTag, (NBTBase)this.extruderItem.serializeNBT());
/*  69 */     custom.setBoolean("loaded", this.loaded);
/*  70 */     custom.setBoolean("casing", this.casing);
/*  71 */     custom.setFloat("handleRot", this.handleRot);
/*  72 */     custom.setInteger("completion", this.completion);
/*  73 */     custom.setTag(this.grindItemTag, (NBTBase)this.grindItem.serializeNBT());
/*  74 */     compound.setTag(this.tag, (NBTBase)custom);
/*     */     
/*  76 */     return compound;
/*     */   }
/*     */   
/*     */   public boolean doGrind(ItemStack item) {
/*  80 */     if (!this.loaded) {
/*  81 */       if (item.getItem() == BCItems.grindTip) {
/*  82 */         this.loaded = true;
/*  83 */         this.extruderItem = item;
/*  84 */         return true;
/*     */       } 
/*     */       
/*  87 */       if (item.getItem() == BCItems.sausageTip) {
/*  88 */         this.loaded = true;
/*  89 */         this.extruderItem = item;
/*  90 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/*  94 */     if (this.loaded) {
/*  95 */       if (this.handleRot == 0.0F) {
/*     */ 
/*     */         
/*  98 */         if (this.extruderItem.getItem() == BCItems.grindTip && 
/*  99 */           this.grindItem.getItem() != Items.AIR) {
/*     */           
/* 101 */           this.completion += this.world.rand.nextInt(20) + 20;
/* 102 */           this.handleRot = 1.0F;
/* 103 */           if (this.completion >= 100) {
/* 104 */             this.completion = 0;
/* 105 */             this.world.spawnEntity((Entity)new EntityItem(this.world, this.pos.getX(), this.pos.getY(), this.pos.getZ(), new ItemStack((Item)BCItems.groundMeat, 1)));
/*     */             
/* 107 */             this.casing = false;
/* 108 */             this.grindItem = new ItemStack(Items.AIR);
/* 109 */             this.handleRot = 0.0F;
/* 110 */             return true;
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 115 */         if (this.extruderItem.getItem() == BCItems.sausageTip) {
/* 116 */           if (item.getItem() == BCItems.tripe) {
/* 117 */             this.casing = true;
/* 118 */             return true;
/*     */           } 
/*     */           
/* 121 */           if (this.casing && this.grindItem.getItem() != Items.AIR) {
/* 122 */             this.completion += this.world.rand.nextInt(20) + 20;
/* 123 */             this.handleRot = 1.0F;
/* 124 */             if (this.completion >= 100) {
/* 125 */               this.completion = 0;
/* 126 */               this.world.spawnEntity((Entity)new EntityItem(this.world, this.pos.getX(), this.pos.getY(), this.pos.getZ(), new ItemStack((Item)BCItems.sausage, 1)));
/*     */               
/* 128 */               this.casing = false;
/* 129 */               this.grindItem = new ItemStack(Items.AIR);
/* 130 */               this.handleRot = 0.0F;
/* 131 */               return true;
/*     */             }
/*     */           
/*     */           }
/*     */         
/*     */         } 
/*     */       } else {
/*     */         
/* 139 */         this.handleRot += 15.0F;
/* 140 */         if (this.handleRot >= 360.0F) {
/* 141 */           this.handleRot = 0.0F;
/*     */         }
/* 143 */         return false;
/*     */       } 
/*     */     }
/*     */     
/* 147 */     if (this.grindItem.getItem() == Items.AIR && (item.getItem() instanceof com.Lance5057.ButcherCraft.core.food.ItemButcherFood || item.getItem() == Items.BEEF)) {
/*     */       
/* 149 */       this.grindItem = item;
/* 150 */       return true;
/*     */     } 
/*     */     
/* 153 */     if (this.loaded && this.grindItem.getItem() == Items.AIR && !this.casing) {
/*     */       
/* 155 */       this.world.spawnEntity((Entity)new EntityItem(this.world, this.pos.getX(), this.pos.getY(), this.pos.getZ(), this.extruderItem));
/*     */       
/* 157 */       this.extruderItem = new ItemStack(Items.AIR);
/* 158 */       this.loaded = false;
/*     */     } 
/*     */ 
/*     */     
/* 162 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\meatgrinder\MeatGrinderTileEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */