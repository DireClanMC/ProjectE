package moze_intel.projecte.manual;

import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ItemPage extends AbstractPage
{
    private final ItemStack stack;
    private final String body;

    protected ItemPage(ItemStack stack, PageCategory category, String body)
    {
        super(category);
        this.stack = stack;
        this.body = body;
    }

    public ItemStack getItemStack()
    {
        return stack.copy();
    }

    @Override
    public String getHeaderText()
    {
        return StatCollector.translateToLocal(stack.getUnlocalizedName() + ".name");
    }

    @Override
    public String getBodyText()
    {
        return body;
    }
}
