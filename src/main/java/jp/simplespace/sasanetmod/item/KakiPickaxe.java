package jp.simplespace.sasanetmod.item;

import net.minecraft.item.ItemPickaxe;

import static jp.simplespace.sasanetmod.SasanetMod.MOD_ID;
import static jp.simplespace.sasanetmod.item.ItemManager.sasaTab;

public class KakiPickaxe extends ItemPickaxe {
    protected KakiPickaxe(ToolMaterial material) {
        super(material);
        setTranslationKey("kaki_pickaxe")
                .setRegistryName(MOD_ID,"kaki_pickaxe")
                .setCreativeTab(sasaTab);
    }

}
