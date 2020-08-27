package net.mcreator.ourmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ourmod.item.StormbreakerItem;
import net.mcreator.ourmod.OurmodModElements;

import java.util.Map;

@OurmodModElements.ModElement.Tag
public class StormbreakerRangedItemUsedProcedure extends OurmodModElements.ModElement {
	public StormbreakerRangedItemUsedProcedure(OurmodModElements instance) {
		super(instance, 51);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure StormbreakerRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(StormbreakerItem.block, (int) (1));
			_setstack.setCount((int) (-1));
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(StormbreakerItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
