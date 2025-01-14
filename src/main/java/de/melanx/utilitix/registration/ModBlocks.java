package de.melanx.utilitix.registration;

import de.melanx.utilitix.UtilitiX;
import de.melanx.utilitix.block.WeakRedstoneTorch;
import io.github.noeppi_noeppi.libx.annotation.RegisterClass;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;

@RegisterClass(priority = 1)
public class ModBlocks {

    public static final WeakRedstoneTorch weakRedstoneTorch = new WeakRedstoneTorch(UtilitiX.getInstance(), AbstractBlock.Properties.from(Blocks.REDSTONE_TORCH));
}
