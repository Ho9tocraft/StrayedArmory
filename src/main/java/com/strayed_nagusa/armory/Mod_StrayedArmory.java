package com.strayed_nagusa.armory;

import com.strayed_nagusa.armory.registries.StrayedArmoryItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Mod_StrayedArmory.MOD_ID)
public class Mod_StrayedArmory {
    public static final String MOD_ID = "strayed_armory";
    public static final Logger LOGGER = LogManager.getLogger();

    public Mod_StrayedArmory() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        StrayedArmoryItems.register(eventBus);
    }
}
