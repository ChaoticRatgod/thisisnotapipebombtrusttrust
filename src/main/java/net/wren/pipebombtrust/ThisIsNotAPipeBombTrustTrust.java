package net.wren.pipebombtrust;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.ItemGroups;
import net.wren.pipebombtrust.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThisIsNotAPipeBombTrustTrust implements ModInitializer {


	public static String MOD_ID = "pipebombtrust";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.addItemsToVanillaTab(ItemGroups.TOOLS, ModItems.PIPEBOMB);
		ModItems.addItemsToVanillaTab(ItemGroups.TOOLS, ModItems.DETONATOR);
	}
}