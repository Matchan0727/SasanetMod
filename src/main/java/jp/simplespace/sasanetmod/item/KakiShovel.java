package jp.simplespace.sasanetmod.item;

import net.minecraft.item.ItemSpade;

import static jp.simplespace.sasanetmod.SasanetMod.MOD_ID;
import static jp.simplespace.sasanetmod.item.ItemManager.sasaTab;

public class KakiShovel extends ItemSpade {
    public KakiShovel(ToolMaterial material) {
        super(material);
        setTranslationKey("kaki_shovel")
                .setRegistryName(MOD_ID,"kaki_shovel")
                .setCreativeTab(sasaTab);
    }
}
