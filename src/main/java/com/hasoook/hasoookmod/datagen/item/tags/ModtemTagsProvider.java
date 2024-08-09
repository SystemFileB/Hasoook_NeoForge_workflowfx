package com.hasoook.hasoookmod.datagen.item.tags;

import com.hasoook.hasoookmod.tags.ModItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModtemTagsProvider extends ItemTagsProvider {

    public ModtemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModItemTags.SEPARATION_ITEMS).add(Items.TNT)
                .add(Items.TNT_MINECART)
                .add(Items.WIND_CHARGE);
        this.tag(ModItemTags.DISDAIN_ITEMS).addTag(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .addTag(ItemTags.WEAPON_ENCHANTABLE)
                .addTag(ModItemTags.SEPARATION_ITEMS);
    }
}
