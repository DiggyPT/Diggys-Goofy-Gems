package diggypt.mod.init;

import java.util.ArrayList;
import java.util.List;

import diggypt.mod.objects.blocks.BlockBase;
import diggypt.mod.objects.blocks.BlockExploding;
import diggypt.mod.objects.blocks.BlockOres;
import diggypt.mod.objects.blocks.BlockRotateable;
import diggypt.mod.objects.blocks.BlockRubyOre;
import diggypt.mod.objects.blocks.BlockSapphireOre;
import diggypt.mod.objects.blocks.BlockSpikes;
import diggypt.mod.objects.blocks.BlockTanzaniteOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_RUBY = new BlockBase("block_ruby", Material.IRON, 5f);
	public static final Block BLOCK_SAPPHIRE = new BlockBase("block_sapphire", Material.IRON, 5f);
	public static final Block BLOCK_TANZANITE = new BlockBase("block_tanzanite", Material.IRON, 5f);
	public static final Block ORE_RUBY = new BlockRubyOre("ore_ruby", Material.ROCK, 3f);
	public static final Block ORE_SAPPHIRE = new BlockSapphireOre("ore_sapphire", Material.ROCK, 3f);
	public static final Block ORE_TANZANITE = new BlockTanzaniteOre("ore_tanzanite", Material.ROCK, 3f);
	public static final Block ORE_SINGLE_EMERALD = new BlockRotateable("ore_single_emerald", Material.ROCK, 3f);
	
	public static final Block BLUE_BOMB = new BlockExploding("blue_bomb", Material.TNT, 1f);
	public static final Block GEM_SPIKES = new BlockSpikes("gem_spikes", Material.ICE, 4f);
}