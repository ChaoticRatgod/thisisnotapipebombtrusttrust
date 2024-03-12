package net.wren.pipebombtrust.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.wren.pipebombtrust.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DETONATOR)
                .pattern(" LI")
                .pattern(" BI")
                .pattern(" RI")
                .input('I', Items.IRON_INGOT)
                .input('L', Items.LIGHTNING_ROD)
                .input('B', Items.BLAZE_POWDER)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(Items.BLAZE_POWDER),
                        conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DETONATOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PIPEBOMB)
                .pattern(" IG")
                .pattern("IDI")
                .pattern("GI ")
                .input('I', Items.IRON_INGOT)
                .input('D', ModItems.DETONATOR)
                .input('G', Items.GUNPOWDER)
                .criterion(hasItem(Items.BLAZE_POWDER),
                        conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PIPEBOMB)));
    }
}
