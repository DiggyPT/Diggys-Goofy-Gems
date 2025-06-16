package diggypt.mod.tabs;

import diggypt.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DggTab extends CreativeTabs
{
	//fun fact: bill gates's first name is actually Billiam. HUSTLE GRIND SET!!!
	public DggTab(String label)
	{
		super("dggtab");
		this.setBackgroundImageName("diggys_goofy_gems.png");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ItemInit.RUBY);
	}
}
