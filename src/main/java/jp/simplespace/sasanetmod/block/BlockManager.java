package jp.simplespace.sasanetmod.block;

import jp.simplespace.sasanetmod.SasanetMod;
import jp.simplespace.sasanetmod.item.ItemManager;
import net.minecraft.block.Block;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import scala.swing.TextComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Mod.EventBusSubscriber
public class BlockManager {

    private static final List<Block> blocks = new ArrayList<>();
    private static final List<Item> items = new ArrayList<>();

    public static Block kakiBlock;
    public static Block cookedKakiBlock;

    public static void init(){
        kakiBlock = new KakiBlock();
        cookedKakiBlock = new CookedKakiBlock();
        add(kakiBlock);
        add(cookedKakiBlock);
    }
    public static void registers(){
        ForgeRegistries.BLOCKS.registerAll(blocks.toArray(new Block[blocks.size()]));
        ForgeRegistries.ITEMS.registerAll(items.toArray(new Item[items.size()]));
    }
    public static void registerModels(){
        for(Block block : blocks){
            registerModel(block,0);
        }
    }
    public static void registerModel(Block block,int meta){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),meta,new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
    public static void add(Block block){
        blocks.add(block);
        items.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
    public static void remove(Block block){
        blocks.remove(block);
        items.remove(Item.getItemFromBlock(block));
    }
    @SubscribeEvent
    public void onHarvest(BlockEvent.HarvestDropsEvent event){
        IBlockState state = event.getState();
        if(!(state.getBlock().equals(Blocks.LEAVES)&&state.getBlock().damageDropped(state)==2)){
            return;
        }
        int per = 200;
        switch(event.getFortuneLevel()){
            default:
                per-=event.getFortuneLevel()*30;
                if(per<1){
                    per=1;
                }
                break;
            case 1:
                per=180;
                break;
            case 2:
                per=160;
                break;
            case 3:
                per=120;
                break;
        }
        int ran = event.getWorld().rand.nextInt(per);
        System.out.println(ran);
        if(ran==0){
            World world = event.getWorld();
            BlockPos pos = event.getPos();
            EntityItem entity = new EntityItem(world,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ItemManager.kaki,1));
            world.spawnEntity(entity);
        }
    }
}
