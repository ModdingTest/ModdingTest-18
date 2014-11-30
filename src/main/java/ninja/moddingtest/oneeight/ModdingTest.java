package ninja.moddingtest.oneeight;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ninja.moddingtest.oneeight.proxy.IProxy;
import ninja.moddingtest.oneeight.util.MTLogger;

/** @author ViolentNinjaD
    LGPLv3
**/

@Mod(modid = ModdingTest.MOD_ID, name = ModdingTest.MOD_NAME, version = ModdingTest.MOD_VERSION)
public class ModdingTest 
{
    public static final String MOD_ID = "moddingtest";
    public static final String MOD_NAME = "ModdingTest";
    public static final String MOD_VERSION = "@VERSION@";

    @SidedProxy(clientSide = "ninja.moddingtest.oneeight.rpoxy.ClientProxy", serverSide = "ninja.moddingtest.oneeight.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.Instance(ModdingTest.MOD_ID)
    public static ModdingTest instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MTLogger.info("Modding Test by ViolentNinjaD has finished Pre-Initialization :)");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        MTLogger.info("Modding Test by ViolentNinjaD has finished Initialization :)");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        MTLogger.info("Modding Test by ViolentNinjaD has finished Post-Initialization :)");
    }
}
