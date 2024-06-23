package droidco.west3.ironsight;


import droidco.west3.ironsight.bandit.Bandit;
import droidco.west3.ironsight.bandit.Commands.AdminCommands;
import droidco.west3.ironsight.bandit.Commands.DropGoldCmd;
import droidco.west3.ironsight.bandit.Commands.PlayerStatsCmd;
import droidco.west3.ironsight.bandit.Commands.SuicideCmd;
import droidco.west3.ironsight.bandit.Events.CombatEvents;
import droidco.west3.ironsight.bandit.Events.FishingEvents;
import droidco.west3.ironsight.bandit.Events.GeneralEvents;
import droidco.west3.ironsight.bandit.Events.VaultEvents;
import droidco.west3.ironsight.bandit.UI.RespawnUIEvents;
import droidco.west3.ironsight.blockharvesting.BlockBreakingEvents;
import droidco.west3.ironsight.contracts.ContractMenuCmd;
import droidco.west3.ironsight.contracts.UI.ContractUiEvents;
import droidco.west3.ironsight.database.PlayerConnector;
import droidco.west3.ironsight.frontiermobs.FrontierMob;
import droidco.west3.ironsight.globals.Events.JoinServerEvents;
import droidco.west3.ironsight.globals.Utils.GameContentLoader;
import droidco.west3.ironsight.horse.Commands.AdminGetHorseCmd;
import droidco.west3.ironsight.horse.Commands.CallHorseCommand;
import droidco.west3.ironsight.horse.HorseEvents;
import droidco.west3.ironsight.items.Looting.LootingEvents;
import droidco.west3.ironsight.items.MasterList.MasterListCmd;
import droidco.west3.ironsight.items.MasterList.MasterListEvents;
import droidco.west3.ironsight.npc.NPCEvents;
import droidco.west3.ironsight.processors.ProcessorEvents;
import droidco.west3.ironsight.tracker.TrackerEvents;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class IronSight extends JavaPlugin {

    //Allows bukkit scheduling, i.e offsetting actions by one tick
    public static IronSight instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Iron Sight plugin starting....");
        System.out.println("Loading all Events.");
        loadAllEvents();
        System.out.println("Events loaded!");
        System.out.println("Loading all commands.");
        loadAllCommands();
        System.out.println("Commands loaded!");
        GameContentLoader.loadIcons();
        GameContentLoader.loadCustomItems();
        GameContentLoader.loadLocations(this);
        GameContentLoader.loadBrewing();
        GameContentLoader.loadItemTables();
        GameContentLoader.loadNPCs();
        GameContentLoader.loadProcessors();
        GameContentLoader.loadPotions();
        System.out.println("Contracts loaded!");
        System.out.println("Iron Sight successfully loaded!");
    }

    public void onLoad() {
        instance = this;
    }


    @Override
    public void onDisable() {
        System.out.println("Disabling IronSight");
        // Plugin shutdown logic
        savePlayers();
        killAllMobs();
        System.out.println("All mobs killed.");
        System.out.println("IronSight shutting down...");
    }

    public void loadAllEvents() {
        getServer().getPluginManager().registerEvents(new GeneralEvents(this), this);
        getServer().getPluginManager().registerEvents(new JoinServerEvents(this), this);
        getServer().getPluginManager().registerEvents(new CombatEvents(), this);
        getServer().getPluginManager().registerEvents(new ContractUiEvents(), this);
        getServer().getPluginManager().registerEvents(new RespawnUIEvents(this), this);
        getServer().getPluginManager().registerEvents(new TrackerEvents(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakingEvents(this), this);
        getServer().getPluginManager().registerEvents(new MasterListEvents(), this);
        getServer().getPluginManager().registerEvents(new NPCEvents(this), this);
        getServer().getPluginManager().registerEvents(new HorseEvents(), this);
        getServer().getPluginManager().registerEvents(new FishingEvents(), this);
        getServer().getPluginManager().registerEvents(new LootingEvents(this), this);
        getServer().getPluginManager().registerEvents(new ProcessorEvents(this), this);
        getServer().getPluginManager().registerEvents(new VaultEvents(), this);
    }

    public void loadAllCommands() {
        getCommand("stats").setExecutor(new PlayerStatsCmd());
        getCommand("ironsight").setExecutor(new AdminCommands());
        getCommand("contract").setExecutor(new ContractMenuCmd());
        getCommand("masterlist").setExecutor(new MasterListCmd());
        getCommand("gethorse").setExecutor(new AdminGetHorseCmd());
        getCommand("call").setExecutor(new CallHorseCommand());
        getCommand("dropgold").setExecutor(new DropGoldCmd());
        getCommand("suicide").setExecutor(new SuicideCmd());
    }

    public void killAllMobs() {
        HashMap<UUID, LivingEntity> entities = FrontierMob.getEntities();
        for (Map.Entry<UUID, LivingEntity> mob : entities.entrySet()) {
            mob.getValue().damage(100);
            System.out.println("Mob killed.");
        }
        String cmd = "minecraft:kill @e[type=minecraft:villager]";

        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        Bukkit.dispatchCommand(console, cmd);
    }

    public void savePlayers() {
        for (Player p : Bukkit.getOnlinePlayers()) {
            PlayerConnector.updatePlayer(Bandit.getPlayer(p), p);
            p.kickPlayer("Ironsight server meshing...");
        }
    }
}
