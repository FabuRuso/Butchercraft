/*     */ package com.Lance5057.ButcherCraft.core.grill;
/*     */ 
/*     */ import net.minecraft.block.state.IBlockState;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.FurnaceRecipes;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.network.NetworkManager;
/*     */ import net.minecraft.network.play.server.SPacketUpdateTileEntity;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.EnumParticleTypes;
/*     */ import net.minecraft.util.ITickable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GrillTileEntity
/*     */   extends TileEntity
/*     */   implements ITickable
/*     */ {
/*  26 */   private String tag = "grill";
/*     */   
/*  28 */   public int size = 4;
/*     */   
/*  30 */   public ItemStack[] food = new ItemStack[] { new ItemStack(Items.AIR), new ItemStack(Items.AIR), new ItemStack(Items.AIR), new ItemStack(Items.AIR) };
/*     */ 
/*     */   
/*  33 */   public int charcoal = 0;
/*  34 */   public int timer = -1;
/*     */ 
/*     */   
/*     */   public NBTTagCompound getUpdateTag() {
/*  38 */     return writeToNBT(new NBTTagCompound());
/*     */   }
/*     */ 
/*     */   
/*     */   public SPacketUpdateTileEntity getUpdatePacket() {
/*  43 */     NBTTagCompound nbtTag = new NBTTagCompound();
/*  44 */     writeToNBT(nbtTag);
/*  45 */     return new SPacketUpdateTileEntity(getPos(), 1, nbtTag);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity packet) {
/*  50 */     readFromNBT(packet.getNbtCompound());
/*     */   }
/*     */ 
/*     */   
/*     */   public void readFromNBT(NBTTagCompound compound) {
/*  55 */     super.readFromNBT(compound);
/*     */     
/*  57 */     NBTTagCompound custom = (NBTTagCompound)compound.getTag(this.tag);
/*  58 */     for (int i = 0; i < this.size; i++) {
/*  59 */       this.food[i] = new ItemStack(custom.getCompoundTag("food_" + i));
/*     */     }
/*     */     
/*  62 */     this.charcoal = custom.getInteger("charcoal");
/*  63 */     this.timer = custom.getInteger("timer");
/*     */   }
/*     */ 
/*     */   
/*     */   public NBTTagCompound writeToNBT(NBTTagCompound compound) {
/*  68 */     super.writeToNBT(compound);
/*     */     
/*  70 */     NBTTagCompound custom = new NBTTagCompound();
/*  71 */     for (int i = 0; i < this.size; i++) {
/*  72 */       custom.setTag("food_" + i, (NBTBase)this.food[i].serializeNBT());
/*     */     }
/*     */     
/*  75 */     custom.setInteger("charcoal", this.charcoal);
/*  76 */     custom.setInteger("timer", this.timer);
/*  77 */     compound.setTag(this.tag, (NBTBase)custom);
/*     */     
/*  79 */     return compound;
/*     */   }
/*     */   
/*     */   public boolean doGrill(ItemStack item) {
/*  83 */     if (this.charcoal < 4 && item.getItem() == Items.COAL && item.getItemDamage() == 1) {
/*  84 */       this.charcoal++;
/*  85 */       return true;
/*  86 */     }  if (this.charcoal == 4 && item.getItem() == Items.FLINT_AND_STEEL && this.timer <= 0) {
/*  87 */       this.timer = 1600;
/*     */     }
/*     */     
/*  90 */     ItemStack result = FurnaceRecipes.instance().getSmeltingResult(item);
/*  91 */     if (item.getItem() instanceof net.minecraft.item.ItemFood && result.getItem() != Items.AIR) {
/*  92 */       for (int i = 0; i < this.food.length; i++) {
/*  93 */         if (this.food[i].getItem() == Items.AIR) {
/*  94 */           this.food[i] = item;
/*  95 */           return true;
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 100 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void update() {
/* 105 */     if (!this.world.isRemote) {
/* 106 */       if (this.timer > 0) {
/* 107 */         this.timer--;
/*     */       }
/* 109 */       else if (this.timer == 0) {
/* 110 */         for (int i = 0; i < 4; i++) {
/*     */           
/* 112 */           this.food[i] = FurnaceRecipes.instance().getSmeltingResult(this.food[i]);
/* 113 */           this.world.spawnEntity((Entity)new EntityItem(this.world, this.pos
/* 114 */                 .getX(), this.pos.getY(), this.pos.getZ(), this.food[i]));
/* 115 */           this.food[i] = new ItemStack(Items.AIR);
/*     */         } 
/* 117 */         this.timer = -1;
/* 118 */         this.charcoal = 0;
/*     */         
/* 120 */         markDirty();
/*     */         
/* 122 */         if (getWorld() != null) {
/* 123 */           IBlockState state = this.world.getBlockState(getPos());
/* 124 */           this.world.notifyBlockUpdate(getPos(), state, state, 3);
/*     */         }
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 130 */     else if (this.timer > 0) {
/*     */       
/* 132 */       getWorld().spawnParticle(EnumParticleTypes.FLAME, 
/* 133 */           getPos().getX() + 0.2D + (getWorld()).rand.nextDouble() / 1.5D, getPos().getY() + 0.75D, 
/* 134 */           getPos().getZ() + 0.2D + (getWorld()).rand.nextDouble() / 1.5D, 0.0D, 
/* 135 */           (getWorld()).rand.nextDouble() / 100.0D, 0.0D, new int[0]);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\grill\GrillTileEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */