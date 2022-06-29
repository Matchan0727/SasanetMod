package jp.simplespace.sasanetmod.proxy;

import jp.simplespace.sasanetmod.block.BlockManager;
import jp.simplespace.sasanetmod.item.ItemManager;

public class ClientProxy implements IProxy{
    @Override
    public void preInit() {
        ItemManager.registerModels();
        BlockManager.registerModels();
    }

    @Override
    public void init() {
    }

    @Override
    public void postInit() {

    }
}
