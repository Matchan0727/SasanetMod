package jp.simplespace.sasanetmod.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

import static jp.simplespace.sasanetmod.SasanetMod.MOD_ID;

public class ItemManager {
    public static final List<Item> items = new ArrayList<>();

    public static ItemFood kaki;
    public static ItemFood cookedKaki;
    public static ItemSword kakiSword;
    public static ItemPickaxe kakiPickaxe;
    public static ItemSpade kakiShovel;
    public static ItemAxe kakiAxe;
    public static ItemHoe kakiHoe;

    public static Item.ToolMaterial kakiToolMaterial;
    public static ItemArmor.ArmorMaterial kakiArmorMaterial;


    public static CreativeTabs sasaTab;

    public static void init(){
        //クリエイティブタブの初期化
        sasaTab=new CreativeTabs("SasanetMod") {
            @SideOnly(Side.CLIENT)
            public ItemStack createIcon() {
                return new ItemStack(kaki);
            }
        };
        //マテリアルの初期化
        kakiToolMaterial = EnumHelper.addToolMaterial("kaki",2,3393,9.3F,3.3F,33);

        //アイテムの初期化
        kaki = new ItemFood(4,1.0F,true);
        kaki.setTranslationKey("kaki")
                .setRegistryName(MOD_ID,"kaki")
                .setCreativeTab(sasaTab)
                .setMaxStackSize(64);
        cookedKaki = new ItemFood(9,1.5F,true);
        cookedKaki.setTranslationKey("cooked_kaki")
                .setRegistryName(MOD_ID,"cooked_kaki")
                .setCreativeTab(sasaTab)
                .setMaxStackSize(64);
        kakiSword=new KakiSword(kakiToolMaterial);
        kakiShovel=new KakiShovel(kakiToolMaterial);
        kakiPickaxe=new KakiPickaxe(kakiToolMaterial);
        kakiAxe=new KakiAxe(kakiToolMaterial);
        kakiHoe=new KakiHoe(kakiToolMaterial);
        add(kaki);
        add(cookedKaki);
        add(kakiSword);
        add(kakiShovel);
        add(kakiPickaxe);
        add(kakiAxe);
        add(kakiHoe);
    }
    public static void registers(){
        ForgeRegistries.ITEMS.registerAll(items.toArray(new Item[items.size()]));
    }
    public static void registerModels(){
        for(Item item : items){
            registerModel(item,0);
        }
    }
    public static void registerModel(Item item,int meta){
        ModelLoader.setCustomModelResourceLocation(item,meta,new ModelResourceLocation(item.getRegistryName(),"inventory"));
    }
    public static void add(Item item){
        items.add(item);
    }
    public static void remove(Item item){
        items.remove(item);
    }
}
