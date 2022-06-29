package jp.simplespace.sasanetmod.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import static jp.simplespace.sasanetmod.item.ItemManager.sasaTab;

public class KakiBlock extends BlockBase{
    public KakiBlock(){
        super("kaki_block", Material.PLANTS);
        setSoundType(SoundType.SLIME)
                .setCreativeTab(sasaTab)
                .setHardness(0.5F);
    }
}
