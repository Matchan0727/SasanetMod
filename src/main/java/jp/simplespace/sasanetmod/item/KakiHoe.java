package jp.simplespace.sasanetmod.item;

import net.minecraft.item.ItemHoe;

import static jp.simplespace.sasanetmod.SasanetMod.MOD_ID;
import static jp.simplespace.sasanetmod.item.ItemManager.sasaTab;

public class KakiHoe extends ItemHoe {
    public KakiHoe(ToolMaterial material) {
        super(material);
        setTranslationKey("kaki_hoe")
                .setRegistryName(MOD_ID,"kaki_hoe")
                .setCreativeTab(sasaTab);
    }
}
