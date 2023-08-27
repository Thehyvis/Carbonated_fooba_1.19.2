package net.thehyvis.carbonated_fooba_core.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.thehyvis.carbonated_fooba_core.item.ModItems;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.gui.screens.Screen;
import java.util.List;
public class SupremeFoobaItem extends Item{

    public static final int EAT_DURATION = 16;
    public SupremeFoobaItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = new ItemStack(ModItems.EMPTY_SUPREME_FOOBA_CAN.get());
        super.finishUsingItem(itemstack, world, entity);

        if (itemstack.isEmpty()) {
            return retval;
        } else {
            if (entity instanceof Player player && !player.getAbilities().instabuild) {
                if (!player.getInventory().add(retval))
                    player.drop(retval, false);
            }
            return itemstack;
        }


    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
        components.add(Component.translatable("tooltip.carbonated_fooba_core.supreme_fooba_shift").withStyle(ChatFormatting.AQUA));
        } else {
            components.add(Component.translatable("tooltip.carbonated_fooba_core.supreme_fooba").withStyle(ChatFormatting.WHITE));
        }

        super.appendHoverText(stack, level, components, flag);

    }
}

