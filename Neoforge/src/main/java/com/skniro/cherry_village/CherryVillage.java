package com.skniro.cherry_village;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CherryVillage.MODID)
public class CherryVillage {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "cherry_village";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public CherryVillage(IEventBus modEventBus) {
        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

}
