package blazecraft.mod.item;

import blazecraft.mod.Entity.projectiles.SmallCumBall;
import blazecraft.mod.util.handlers.MainRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;

import net.minecraft.world.World;

public class ItemCumball extends Item{
	
	public ItemCumball()
	{
	this.maxStackSize=16;
	this.setCreativeTab(MainRegistry.blazetab);
	this.setRegistryName("itemcumball");
	this.setUnlocalizedName("itemcumball");
	}
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		ItemStack itemstack = playerIn.getHeldItem(handIn);
        if (!playerIn.capabilities.isCreativeMode)
        {
            itemstack.shrink(1);
        }
        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_EGG_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        
        if (!worldIn.isRemote)
        {
        	
        	SmallCumBall entitysmallfireball = new SmallCumBall(worldIn, playerIn, playerIn.getLookVec().x*2.0D, playerIn.getLookVec().y*2.0D, playerIn.getLookVec().z*2.0D);
            entitysmallfireball.posY = playerIn.posY + (double)(playerIn.height / 2.0F) + 0.5D;
            worldIn.spawnEntity(entitysmallfireball);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		
	
	
	}
}


