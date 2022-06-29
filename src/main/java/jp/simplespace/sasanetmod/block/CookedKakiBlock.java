package jp.simplespace.sasanetmod.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import static jp.simplespace.sasanetmod.item.ItemManager.sasaTab;

public class CookedKakiBlock extends BlockBase{
    public CookedKakiBlock(){
        super("cooked_kaki_block", Material.PLANTS);
        setSoundType(SoundType.STONE)
                .setCreativeTab(sasaTab)
                .setHardness(1.0F);
    }
}
