/*    */ package com.Lance5057.ButcherCraft.core.grill;
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
/*    */ 
/*    */ public class GrillBlock
/*    */   extends Block
/*    */   implements ITileEntityProvider
/*    */ {
/*    */   public GrillBlock(Material materialIn) {
/* 33 */     super(materialIn);
/* 34 */     setTranslationKey("butchercraft.grillblock");
/* 35 */     setRegistryName("butchercraft:grillblock");
/* 36 */     GameRegistry.registerTileEntity(GrillTileEntity.class, "butchercraft_grillblock");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public TileEntity createNewTileEntity(World worldIn, int meta) {
/* 42 */     return new GrillTileEntity();
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void initModel() {
/* 47 */     ClientRegistry.bindTileEntitySpecialRenderer(GrillTileEntity.class, new GrillTESR());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
/* 54 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isBlockNormalCube(IBlockState blockState) {
/* 59 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOpaqueCube(IBlockState blockState) {
/* 64 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public EnumBlockRenderType getRenderType(IBlockState state) {
/* 69 */     return EnumBlockRenderType.INVISIBLE;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
/* 75 */     if (!world.isRemote) {
/* 76 */       TileEntity te = world.getTileEntity(pos);
/* 77 */       if (te instanceof GrillTileEntity) {
/* 78 */         GrillTileEntity grinder = (GrillTileEntity)te;
/* 79 */         ItemStack item = player.getHeldItem(hand);
/* 80 */         if (grinder.doGrill(item)) {
/* 81 */           int stackSize = item.getCount() - 1;
/* 82 */           if (stackSize > 0) {
/* 83 */             item.setCount(stackSize);
/*    */           } else {
/* 85 */             item = new ItemStack(Items.AIR);
/*    */           } 
/* 87 */           player.inventory.setInventorySlotContents(player.inventory.currentItem, item);
/* 88 */           player.openContainer.detectAndSendChanges();
/*    */         } 
/*    */         
/* 91 */         te.markDirty();
/*    */         
/* 93 */         if (te.getWorld() != null) {
/* 94 */           IBlockState bState = world.getBlockState(te.getPos());
/* 95 */           world.notifyBlockUpdate(te.getPos(), bState, bState, 3);
/*    */         } 
/*    */       } 
/*    */     } 
/* 99 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\grill\GrillBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */