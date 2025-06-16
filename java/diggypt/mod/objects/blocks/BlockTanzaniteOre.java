package diggypt.mod.objects.blocks;

import java.util.Random;

import diggypt.mod.Main;
import diggypt.mod.init.BlockInit;
import diggypt.mod.init.ItemInit;
import diggypt.mod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockTanzaniteOre extends Block implements IHasModel
{
	public BlockTanzaniteOre(String name, Material material, float hardness)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.dggtab);
		setHardness(hardness);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ItemInit.TANZANITE;
    }
}
