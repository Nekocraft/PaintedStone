package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class MagentaGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public MagentaGlowstone(Plugin plugin)
    {
        super(plugin, "Magenta Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("MagentaGlowstone"), 16));
    }
}