package jp.simplespace.sasanetmod.recipe;

import jp.simplespace.sasanetmod.item.ItemManager;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
    public static void registerSmeltings(){
        GameRegistry.addSmelting(ItemManager.kaki,new ItemStack(ItemManager.cookedKaki),0.39F);
    }
}
