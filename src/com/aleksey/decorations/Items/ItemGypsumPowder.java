package com.aleksey.decorations.Items;

import net.minecraft.client.renderer.texture.IIconRegister;

import com.dunk.tfc.Core.TFCTabs;
import com.dunk.tfc.Items.ItemTerra;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGypsumPowder extends ItemTerra
{
    public ItemGypsumPowder()
    {
        super();
        
        setCreativeTab(TFCTabs.TFC_MATERIALS);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister registerer)
    {
        this.itemIcon = registerer.registerIcon("decorations:GypsumPowder");
    }
}
