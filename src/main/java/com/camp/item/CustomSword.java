/*
 * Copyright (c) 2016. This program is licensed under GPL 3.0 ShareAlike Attribution. No version of this program may be sold or given away without attributing the work to the original creator, Otmas. This program is designed for use with Minecraft Forge 1.8. The developer is not responsible for any harm caused by misuse of the program.
 */

package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

import com.camp.ExampleMod;

public class CustomSword extends ItemSword {
	
	public static final String name = "OtmasiniumSword";
	
	public CustomSword(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
		this.setCreativeTab(ExampleMod.otmasTab);
	}

}
