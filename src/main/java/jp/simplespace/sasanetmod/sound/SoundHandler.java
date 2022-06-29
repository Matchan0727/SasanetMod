package jp.simplespace.sasanetmod.sound;

import jp.simplespace.sasanetmod.SasanetMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber
public class SoundHandler {
    public static SoundEvent KakiBlock;

    public static void registerSounds(){
        KakiBlock=registerSound("kaki_block");
    }
    public static SoundEvent registerSound(String name){
        ResourceLocation location = new ResourceLocation(SasanetMod.MOD_ID,name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(location);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
    @SubscribeEvent
    public void registerSounds(RegistryEvent.Register<SoundEvent> event){
        registerSounds();
    }
}
