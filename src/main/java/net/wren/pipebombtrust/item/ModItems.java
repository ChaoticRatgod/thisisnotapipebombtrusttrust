package net.wren.pipebombtrust.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.wren.pipebombtrust.ThisIsNotAPipeBombTrustTrust;
import net.wren.pipebombtrust.item.custom.PipeBombItem;

public class ModItems {
    public static final Item PIPEBOMB = RegisterItem("pipebomb", new PipeBombItem(
            new FabricItemSettings()));
    public static final Item DETONATOR = RegisterItem("detonator", new Item(
            new FabricItemSettings()));
    public static void addItemsToVanillaTab(RegistryKey<ItemGroup> group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> content.add(item));
    }
    public static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(
                ThisIsNotAPipeBombTrustTrust.MOD_ID, name), item);
    }
}
