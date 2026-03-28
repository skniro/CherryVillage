package com.skniro.cherry_village;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CherryVillage.MODID)
public class CherryVillage {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "cherry_village";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public CherryVillage(FMLJavaModLoadingContext context) {
        var modEventBus = context.getModBusGroup();
    }

}
