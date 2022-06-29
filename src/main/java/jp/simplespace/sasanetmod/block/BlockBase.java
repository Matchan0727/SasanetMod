package jp.simplespace.sasanetmod.block;

import jp.simplespace.sasanetmod.IHasModel;
import jp.simplespace.sasanetmod.SasanetMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class BlockBase extends Block {
    public BlockBase(String name,Material materialIn) {
        super(materialIn);
        setTranslationKey(name)
                .setRegistryName(SasanetMod.MOD_ID,name)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
