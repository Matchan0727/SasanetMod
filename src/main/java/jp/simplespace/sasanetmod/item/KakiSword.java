package jp.simplespace.sasanetmod.item;

import net.minecraft.item.ItemSword;

import static jp.simplespace.sasanetmod.SasanetMod.MOD_ID;
import static jp.simplespace.sasanetmod.item.ItemManager.sasaTab;

public class KakiSword extends ItemSword {

    public KakiSword(ToolMaterial material) {
        super(material);
        setTranslationKey("kaki_sword")
                .setRegistryName(MOD_ID,"kaki_sword")
                .setCreativeTab(sasaTab);
    }
}
