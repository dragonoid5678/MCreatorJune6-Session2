
package net.mcreator.ourmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.ourmod.item.StormbreakerItem;
import net.mcreator.ourmod.OurmodModElements;

@OurmodModElements.ModElement.Tag
public class LogansCoolItemGroup extends OurmodModElements.ModElement {
	public LogansCoolItemGroup(OurmodModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablogans_cool") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(StormbreakerItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
