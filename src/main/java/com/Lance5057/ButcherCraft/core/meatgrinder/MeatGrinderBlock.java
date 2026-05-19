/*    */ package com.Lance5057.ButcherCraft.core.meatgrinder;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.ITileEntityProvider;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.block.state.IBlockState;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.init.Items;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.EnumBlockRenderType;
/*    */ import net.minecraft.util.EnumFacing;
/*    */ import net.minecraft.util.EnumHand;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import net.minecraft.world.IBlockAccess;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.fml.client.registry.ClientRegistry;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MeatGrinderBlock
/*    */   extends Block
/*    */   implements ITileEntityProvider
/*    */ {
/*    */   public MeatGrinderBlock(Material materialIn) {
/* 32 */     super(materialIn);
/* 33 */     setTranslationKey("butchercraft.meatGrinderblock");
/* 34 */     setRegistryName("butchercraft:meatGrinderblock");
/* 35 */     GameRegistry.registerTileEntity(MeatGrinderTileEntity.class, "butchercraft_meatGrinderblock");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public TileEntity createNewTileEntity(World worldIn, int meta) {
/* 41 */     return new MeatGrinderTileEntity();
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void initModel() {
/* 46 */     ClientRegistry.bindTileEntitySpecialRenderer(MeatGrinderTileEntity.class, new MeatGrinderTESR());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
/* 53 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isBlockNormalCube(IBlockState blockState) {
/* 58 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOpaqueCube(IBlockState blockState) {
/* 63 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public EnumBlockRenderType getRenderType(IBlockState state) {
/* 68 */     return EnumBlockRenderType.INVISIBLE;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
/* 74 */     if (!world.isRemote) {
/* 75 */       TileEntity te = world.getTileEntity(pos);
/* 76 */       if (te instanceof MeatGrinderTileEntity) {
/* 77 */         MeatGrinderTileEntity grinder = (MeatGrinderTileEntity)te;
/* 78 */         ItemStack item = player.getHeldItem(hand);
/* 79 */         if (grinder.doGrind(item)) {
/* 80 */           int stackSize = item.getCount() - 1;
/* 81 */           if (stackSize > 0) {
/* 82 */             item.setCount(stackSize);
/*    */           } else {
/* 84 */             item = new ItemStack(Items.AIR);
/*    */           } 
/* 86 */           player.inventory.setInventorySlotContents(player.inventory.currentItem, item);
/* 87 */           player.openContainer.detectAndSendChanges();
/*    */         } 
/*    */         
/* 90 */         te.markDirty();
/*    */         
/* 92 */         if (te.getWorld() != null) {
/* 93 */           IBlockState bState = world.getBlockState(te.getPos());
/* 94 */           world.notifyBlockUpdate(te.getPos(), state, state, 3);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 99 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\meatgrinder\MeatGrinderBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */