package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class WhiteStoneBlock extends GenericCubeCustomBlock
{
 
    public WhiteStoneBlock(Plugin plugin)
    {
        super(plugin, "WhiteStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/6338613.png", 16));
    }
}