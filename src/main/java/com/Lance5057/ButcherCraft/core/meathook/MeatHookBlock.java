/*    */ package com.Lance5057.ButcherCraft.core.meathook;
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
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.common.registry.GameRegistry;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(modid = "butchercraft")
/*    */ public class MeatHookBlock
/*    */   extends Block
/*    */   implements ITileEntityProvider
/*    */ {
/*    */   public MeatHookBlock(Material materialIn) {
/* 30 */     super(materialIn);
/* 31 */     setTranslationKey("butchercraft.meathookblock");
/* 32 */     setRegistryName("butchercraft:meathookblock");
/* 33 */     GameRegistry.registerTileEntity(MeatHookTileEntity.class, "butchercraft_meathookblock");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public TileEntity createNewTileEntity(World worldIn, int meta) {
/* 39 */     return new MeatHookTileEntity();
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void initModel() {
/* 44 */     ClientRegistry.bindTileEntitySpecialRenderer(MeatHookTileEntity.class, new MeatHookTESR());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
/* 51 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isBlockNormalCube(IBlockState blockState) {
/* 56 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOpaqueCube(IBlockState blockState) {
/* 61 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public EnumBlockRenderType getRenderType(IBlockState state) {
/* 66 */     return EnumBlockRenderType.INVISIBLE;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
/* 72 */     if (!world.isRemote) {
/* 73 */       TileEntity te = world.getTileEntity(pos);
/* 74 */       if (te instanceof MeatHookTileEntity) {
/* 75 */         MeatHookTileEntity hook = (MeatHookTileEntity)te;
/* 76 */         ItemStack item = player.getHeldItem(hand);
/* 77 */         if (item.getItem() instanceof com.Lance5057.ButcherCraft.core.ItemCarcass) {
/* 78 */           hook.addCarcass(item.getItem());
/* 79 */           int stackSize = item.getCount() - 1;
/* 80 */           if (stackSize > 0) {
/* 81 */             item.setCount(stackSize);
/*    */           } else {
/* 83 */             item = new ItemStack(Items.AIR);
/*    */           } 
/* 85 */           player.inventory.setInventorySlotContents(player.inventory.currentItem, item);
/* 86 */           player.openContainer.detectAndSendChanges();
/*    */         } else {
/*    */           
/* 89 */           hook.useTool(item.getItem(), player);
/*    */         } 
/*    */       } 
/*    */     } 
/* 93 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\faburuso\Downloads\butchercraft-0.2a.jar!\com\Lance5057\ButcherCraft\core\meathook\MeatHookBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */