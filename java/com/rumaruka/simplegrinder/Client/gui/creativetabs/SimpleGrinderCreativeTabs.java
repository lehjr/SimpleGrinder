package com.rumaruka.simplegrinder.Client.gui.creativetabs;

import com.rumaruka.simplegrinder.Init.BlocksCore;
import com.rumaruka.simplegrinder.Reference.Reference;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SimpleGrinderCreativeTabs extends CreativeTabs{

	
	public static SimpleGrinderCreativeTabs TABS_SIMPLE_GRINDER = new SimpleGrinderCreativeTabs();
	List list;
	
	public SimpleGrinderCreativeTabs() {
		super(Reference.MODID);
		setNoTitle();
	}

	@Override
	public ItemStack getTabIconItem() {
		// TODO Auto-generated method stub
		return new ItemStack(Item.getItemFromBlock(BlocksCore.coal_grinder));
	}


}
