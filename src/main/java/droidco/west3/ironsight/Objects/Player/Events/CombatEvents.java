package droidco.west3.ironsight.Objects.Player.Events;

import droidco.west3.ironsight.Objects.Player.IronPlayer;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class CombatEvents implements Listener
{
    @EventHandler
    public void startCombatTimers(EntityDamageByEntityEvent e){
        if(e.getEntity() instanceof Player p){
            //p.sendMessage("You are combat logged!");
            IronPlayer iPlayer = IronPlayer.getPlayer(p);
            iPlayer.setCombatBlockFlag(true);
            if(!iPlayer.isCombatBlocked()){
                iPlayer.setCombatBlocked(true);
                p.sendMessage(ChatColor.GRAY+"You are "+ChatColor.RED+"combat blocked "+ChatColor.GRAY+"don't log-out!");

            }
        }else if(e.getDamager() instanceof Player p){
            IronPlayer iPlayer = IronPlayer.getPlayer(p);
            iPlayer.setCombatBlockFlag(true);
            if(!iPlayer.isCombatBlocked()){
                iPlayer.setCombatBlocked(true);
                p.sendMessage(ChatColor.GRAY+"You are "+ChatColor.RED+"combat blocked "+ChatColor.GRAY+"don't log-out!");

            }
            if(!iPlayer.isWanted()){
                iPlayer.setWanted(true);
                Bukkit.getServer().broadcastMessage(iPlayer.getTitle()+ChatColor.RESET+p.getDisplayName()+" has gone "+ChatColor.DARK_RED+"rogue!");
            }
        }
    }

    @EventHandler

    public void playerDies(PlayerDeathEvent e){
            IronPlayer p = IronPlayer.getPlayer(e.getEntity());
            if(p.isCombatBlocked()){
                p.setCombatBlocked(false);
            }
            if(p.isWanted()){
                p.setWanted(false);
            }
            if(p.isBleeding()){
                p.setBleeding(false);
            }
            if(p.isBrokenLegs()){
                p.setBrokenLegs(false);
            }
            if(p.getBounty() > 500){
                //Send em to prison
                p.setJailed(true);
            }
        p.setBounty(0);
    }
}
