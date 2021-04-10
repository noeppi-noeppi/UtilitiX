package de.melanx.utilitix.data;

import de.melanx.utilitix.UtilitiX;
import de.melanx.utilitix.item.bells.BellBase;
import de.melanx.utilitix.registration.ModItems;
import io.github.noeppi_noeppi.libx.data.provider.ItemModelProviderBase;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProviderBase {
    public ItemModels(DataGenerator generator, ExistingFileHelper helper) {
        super(UtilitiX.getInstance(), generator, helper);
    }

    @Override
    protected void setup() {
        this.manualModel(ModItems.weakRedstoneTorch);
        this.manualModel(ModItems.mobBell);
        //noinspection ConstantConditions
        this.itemModelFromBlock(ModItems.weakRedstoneTorch.getRegistryName());
    }

    private void itemModelFromBlock(ResourceLocation id) {
        this.withExistingParent(id.getPath(), GENERATED).texture("layer0", new ResourceLocation(id.getNamespace(), "block/" + id.getPath()));
    }

    @Override
    protected void defaultItem(ResourceLocation id, Item item) {
        if (item instanceof BellBase) {
            super.defaultItem(new ResourceLocation(id.getNamespace(), id.getPath() + "_item"), item);
        } else {
            super.defaultItem(id, item);
        }
    }
}
