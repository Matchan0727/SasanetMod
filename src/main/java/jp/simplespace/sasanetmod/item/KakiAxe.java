package jp.simplespace.sasanetmod.item;

import net.minecraft.item.ItemAxe;

import static jp.simplespace.sasanetmod.SasanetMod.MOD_ID;
import static jp.simplespace.sasanetmod.item.ItemManager.sasaTab;

public class KakiAxe extends ItemAxe {
    protected KakiAxe(ToolMaterial material) {
        super(material,8.3F,-3F);
        setTranslationKey("kaki_axe")
                .setRegistryName(MOD_ID,"kaki_axe")
                .setCreativeTab(sasaTab);
    }
}
