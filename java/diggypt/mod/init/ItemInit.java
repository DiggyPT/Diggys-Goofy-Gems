package diggypt.mod.init;

import java.util.ArrayList;
import java.util.List;

import diggypt.mod.objects.items.ItemBase;
import diggypt.mod.objects.items.ItemEatNow;
import diggypt.mod.objects.tools.ToolAxe;
import diggypt.mod.objects.tools.ToolHoe;
import diggypt.mod.objects.tools.ToolMultitool;
import diggypt.mod.objects.tools.ToolPickaxe;
import diggypt.mod.objects.tools.ToolShovel;
import diggypt.mod.objects.tools.ToolSword;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Tool materials (to use for tools, has shit like durability atk damage whatevs)
	public static final ToolMaterial TOOL_RUBY = EnumHelper.addToolMaterial("tool_ruby", 2, 562, 6.6F, 2.3F, 13);
	public static final ToolMaterial TOOL_SAPPHIRE = EnumHelper.addToolMaterial("tool_sapphire", 3, 794, 7.3F, 2.6F, 16);
	public static final ToolMaterial TOOL_TANZANITE = EnumHelper.addToolMaterial("tool_tanzanite", 4, 2053, 10.0F, 4.0F, 8);
	
	//Gems!
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item TANZANITE = new ItemBase("tanzanite");
	
	//Ruby tools
	public static final Item SWORD_RUBY = new ToolSword("sword_ruby", TOOL_RUBY);
	public static final Item AXE_RUBY = new ToolAxe("axe_ruby", TOOL_RUBY);
	public static final Item PICKAXE_RUBY = new ToolPickaxe("pickaxe_ruby", TOOL_RUBY);
	public static final Item SHOVEL_RUBY = new ToolShovel("shovel_ruby", TOOL_RUBY);
	public static final Item HOE_RUBY = new ToolHoe("hoe_ruby", TOOL_RUBY);
	public static final Item MULTITOOL_RUBY = new ToolMultitool("multitool_ruby", TOOL_RUBY);
	
	//Sapphire tools
	public static final Item SWORD_SAPPHIRE = new ToolSword("sword_sapphire", TOOL_SAPPHIRE);
	public static final Item AXE_SAPPHIRE = new ToolAxe("axe_sapphire", TOOL_SAPPHIRE);
	public static final Item PICKAXE_SAPPHIRE = new ToolPickaxe("pickaxe_sapphire", TOOL_SAPPHIRE);
	public static final Item SHOVEL_SAPPHIRE = new ToolShovel("shovel_sapphire", TOOL_SAPPHIRE);
	public static final Item HOE_SAPPHIRE = new ToolHoe("hoe_sapphire", TOOL_SAPPHIRE);
	public static final Item MULTITOOL_SAPPHIRE = new ToolMultitool("multitool_sapphire", TOOL_SAPPHIRE);
	
	//Tanzanite tools
	public static final Item SWORD_TANZANITE = new ToolSword("sword_tanzanite", TOOL_TANZANITE);
	public static final Item AXE_TANZANITE = new ToolAxe("axe_tanzanite", TOOL_TANZANITE);
	public static final Item PICKAXE_TANZANITE = new ToolPickaxe("pickaxe_tanzanite", TOOL_TANZANITE);
	public static final Item SHOVEL_TANZANITE = new ToolShovel("shovel_tanzanite", TOOL_TANZANITE);
	public static final Item HOE_TANZANITE = new ToolHoe("hoe_tanzanite", TOOL_TANZANITE);
	public static final Item MULTITOOL_TANZANITE = new ToolMultitool("multitool_tanzanite", TOOL_TANZANITE);
	
	//random ahh shit (veiny ahh dih)
	public static final Item RUBY_SANDWICH = new ItemEatNow("ruby_sandwich", 4, 5F, false).setPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 100, 0), 50);;
	
	static {
        ITEMS.add(RUBY);
        ITEMS.add(SAPPHIRE);
        ITEMS.add(TANZANITE);
    }

    public static void register(IForgeRegistry<Item> registry) {
        for (Item item : ITEMS) {
            registry.register(item);
        }
    }
}
