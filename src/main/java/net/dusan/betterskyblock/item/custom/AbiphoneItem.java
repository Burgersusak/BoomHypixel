package net.dusan.betterskyblock.item.custom;

import net.dusan.betterskyblock.util.Rarity;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class AbiphoneItem extends SkyblockItem{
    public AbiphoneItem(Properties pProperties, Rarity rarity, Integer baseContact,
                        Integer disc, Boolean directory, Boolean doNotDisturb, Boolean ticTacToe, Boolean snake) {
        super(pProperties.stacksTo(1), rarity);
        this.baseContact = baseContact;
        this.disc = disc;
        this.directory = directory;
        this.doNotDisturb = doNotDisturb;
        this.ticTacToe = ticTacToe;
        this.snake = snake;
    }
    private Integer baseContact;
    private Integer contact = baseContact;
    private Integer disc;
    private Boolean directory;
    private Boolean doNotDisturb;
    private Boolean ticTacToe;
    private Boolean snake;
    private Boolean ringtones;

    public void addContactTrio() {
        this.contact = contact + 3;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        Rarity rarity = Rarity.getRarityFromStack(stack, getSRarity(stack));

        tooltip.add(Component.literal("""
                §7A device that can be used to contact
                people! Click NPCs to add them
                to your contacts!
                
                Features:
                Maximum Contacts:§b""" + contact));
        if (disc != 0) {
            tooltip.add(Component.literal("Maximum Discs:§b" + disc));
        }
        if (directory) {
            tooltip.add(Component.literal("§aContacts Directory"));
        }
        if (doNotDisturb) {
            tooltip.add(Component.literal("§cDo Not Disturb"));
        }
        if (ringtones) {
            tooltip.add(Component.literal("§6Ringtones"));
        }
        if (ticTacToe) {
            tooltip.add(Component.literal("§dTic Tac Toe"));
        }
        if (snake) {
            tooltip.add(Component.literal("§dSnake"));
        }
        tooltip.add(Component.literal("\n§eRight–click to open!"));

        //upgrade text
        if (stack.getTag() != null && stack.getTag().getBoolean("HasUpgradedRarity")) {
            tooltip.add(Component.literal("\n§l§dRarity upgraded§r"));
            tooltip.add(Component.literal(rarity.getColor()+ "§kb§r" + rarity.getName() + "§kz"));
        } else {
            tooltip.add(Component.literal(rarity.getName()));
        }
    }
}
