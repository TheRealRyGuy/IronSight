package droidco.west3.ironsight.Objects.Player;

import droidco.west3.ironsight.Objects.Contracts.Contract;
import droidco.west3.ironsight.Utils.PlayerUtils;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IronPlayer
{
    private String pId;
    private double wallet;
    private double bank;
    private boolean isBleeding;
    private boolean brokenLegs;
    private boolean isWanted;
    private boolean isJailed;
    private boolean isJailedFlag;
    private boolean isCombatBlocked;
    private boolean combatBlockFlag;
    private boolean doingContract;
    //private Sheriff sheriffType;
    //private Team team;
    private int bounty;
    private int pceContractXp;
    private int cmbtContractXp;
    private int pceContractLvl;
    private int cmbtContractLvl;
    private int contractorTitle;
    private String roleTitle;
    private Player onlinePlayer;
    private String currentLocation;
    private Contract rookieContract;
    private Contract apprenticeContract;
    private Contract experiencedContract;
    private Contract activeContract;
    private static List<IronPlayer> playerList = new ArrayList<>();
    //private final IronSight plugin;

    private int wantedKills;
    private static HashMap<String, IronPlayer> ironPlayers = new HashMap<>();
    //private List<ironHorse> horses;

    public IronPlayer(String pId)
    {
        this.pId = pId;
        this.wallet = 0.0;
        this.bank = 1000.0;
        this.isBleeding = false;
        this.isJailed = false;
        this.isWanted = false;
        this.isCombatBlocked = false;
        this.brokenLegs = false;
        this.isJailedFlag = false;
        this.roleTitle = PlayerUtils.getPlayerRoleTitle();

        this.bounty = 0;
        this.wantedKills = 0;
        this.pceContractXp = 0;
        this.pceContractLvl = 0;
        this.cmbtContractLvl =0;
        this.cmbtContractXp = 0;

        playerList.add(this);
        ironPlayers.put(pId,this);
        //this.plugin = plugin;
        this.onlinePlayer = null;
    }
    public IronPlayer(String pId, double wallet, double bank, boolean isBleeding, boolean isJailed,
                      boolean isWanted, boolean isCombatBlocked, boolean brokenLegs, int bounty, int
                              wantedKills, int pceContractLvl, int pceContractXp, int cmbtContractLvl, int cmbtContractXp)
    {
        this.doingContract = false;
        this.pId = pId;
        this.wallet = wallet;
        this.bank = bank;
        this.isBleeding = isBleeding;
        this.isJailed = isJailed;
        this.isWanted = isWanted;
        this.isCombatBlocked = isCombatBlocked;
        this.brokenLegs = brokenLegs;
        this.isJailedFlag = false;
        this.roleTitle = PlayerUtils.getPlayerRoleTitle();

        this.bounty = bounty;
        this.wantedKills = wantedKills;
        this.pceContractLvl = pceContractLvl;
        this.pceContractXp = pceContractXp;
        this.cmbtContractLvl = cmbtContractLvl;
        this.cmbtContractXp = cmbtContractXp;

        playerList.add(this);
        ironPlayers.put(pId,this);
    }
    public void setOnlinePlayer(Player p)
    {
        if(pId.equalsIgnoreCase(p.getUniqueId().toString())){
            onlinePlayer = p;
        }
    }
    public static List<IronPlayer> getPlayerList()
    {
        return playerList;
    }
    public static IronPlayer getPlayer(Player p){
        if(ironPlayers.containsKey(p.getUniqueId().toString())){
            return ironPlayers.get(p.getUniqueId().toString());
        }
        return null;
    }

    public String getRoleTitle() {
        return roleTitle;
    }
    public String getTitle(){
        return getContractorTitle().equalsIgnoreCase("") ? roleTitle : getContractorTitle()+" "+roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

    public String getContractorTitle() {
        switch(contractorTitle){
            case 1:
                return "Cowboy";
            case 2:
                return "Tracker";
            case 3:
                return "Raider";
            case 4:
                return "Miner";
            case 5:
                return "Medic";
            case 6:
                return "Explorer";
        }
        return "";
    }

    public void setContractorTitle(int contractorTitle) {
        this.contractorTitle = contractorTitle;
    }

    public Contract getActiveContract() {
        return activeContract;
    }

    public void setActiveContract(Contract activeContract) {
        this.activeContract = activeContract;
    }

    public void setRookieContract(Contract rookieContract) {
        this.rookieContract = rookieContract;
    }

    public boolean isDoingContract() {
        return doingContract;
    }

    public void setDoingContract(boolean doingContract) {
        this.doingContract = doingContract;
    }

    public void setApprenticeContract(Contract apprenticeContract) {
        this.apprenticeContract = apprenticeContract;
    }
    public void setExperiencedContract(Contract experiencedContract) {
        this.experiencedContract = experiencedContract;
    }
    public void setCurrentLocation(String locName){
        this.currentLocation = locName;
    }
    public String getCurrentLocation()
    {
        return this.currentLocation;
    }
    public void updateBank(double deposit){
        this.bank += deposit;
    }
    public void updateWallet(double deposit){
        this.wallet += deposit;
    }
    public void updateBounty(int increase){ this.bounty += increase; }

    public boolean isJailedFlag() {
        return isJailedFlag;
    }

    public void setJailedFlag(boolean jailedFlag) {
        isJailedFlag = jailedFlag;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public double getBank() {
        return bank;
    }

    public void setBank(double bank) {
        this.bank = bank;
    }

    public boolean isBleeding() {
        return isBleeding;
    }

    public void setBleeding(boolean bleeding) {
        isBleeding = bleeding;
    }

    public boolean isBrokenLegs() {
        return brokenLegs;
    }

    public void setBrokenLegs(boolean brokenLegs) {
        this.brokenLegs = brokenLegs;
    }

    public boolean isWanted() {
        return isWanted;
    }

    public void setWanted(boolean wanted) {
        isWanted = wanted;
    }

    public boolean isJailed() {
        return isJailed;
    }

    public void setJailed(boolean jailed) {
        isJailed = jailed;
    }

    public boolean isCombatBlockFlag() {
        return combatBlockFlag;
    }

    public void setCombatBlockFlag(boolean combatBlockFlag) {
        this.combatBlockFlag = combatBlockFlag;
    }

    public boolean isCombatBlocked() {
        return isCombatBlocked;
    }

    public void setCombatBlocked(boolean combatBlocked) {
        isCombatBlocked = combatBlocked;
    }

    public int getBounty() {
        return bounty;
    }

    public void setBounty(int bounty) {
        this.bounty = bounty;
    }

    public int getPceContractXp() {
        return pceContractXp;
    }

    public void setPceContractXp(int pceContractXp) {
        this.pceContractXp = pceContractXp;
    }

    public int getCmbtContractXp() {
        return cmbtContractXp;
    }

    public void setCmbtContractXp(int cmbtContractXp) {
        this.cmbtContractXp = cmbtContractXp;
    }

    public int getPceContractLvl() {
        return pceContractLvl;
    }

    public void setPceContractLvl(int pceContractLvl) {
        this.pceContractLvl = pceContractLvl;
    }

    public int getCmbtContractLvl() {
        return cmbtContractLvl;
    }

    public void setCmbtContractLvl(int cmbtContractLvl) {
        this.cmbtContractLvl = cmbtContractLvl;
    }

    public Player getOnlinePlayer() {
        return onlinePlayer;
    }


    public int getWantedKills() {
        return wantedKills;
    }

    public void setWantedKills(int wantedKills) {
        this.wantedKills = wantedKills;
    }

    public Contract getRookieContract() {
        return rookieContract;
    }

    public Contract getApprenticeContract() {
        return apprenticeContract;
    }

    public Contract getExperiencedContract() {
        return experiencedContract;
    }
}
