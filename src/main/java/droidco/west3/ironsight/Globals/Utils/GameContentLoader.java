package droidco.west3.ironsight.Globals.Utils;

import droidco.west3.ironsight.Items.CustomItem;
import droidco.west3.ironsight.Items.ItemIcon;
import droidco.west3.ironsight.Items.Potions.BrewingRecipe;
import droidco.west3.ironsight.Location.Location;
import droidco.west3.ironsight.Location.LocationType;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

public class GameContentLoader {
    public static void loadCustomItems()
    {
        //COMMONS
        CustomItem stew = new CustomItem("Brown Stew", 1, true, false,
                "What's in this..?", Material.MUSHROOM_STEW,0.0,0.0);
        CustomItem charPot = new CustomItem("Charred Potato",1, true, false,
                "Cooked on the coals.",Material.BAKED_POTATO,0.0,0.0);
        CustomItem cookFox = new CustomItem("Cooked Fox", 1, true, false,
                "Bigger drumstick than chicken!",Material.COOKED_CHICKEN,0.0,0.0);
        CustomItem rabStew = new CustomItem("Rabbit Stew",2, true, false,
                "Delicious with bread",Material.RABBIT_STEW,0.0,0.0);
        CustomItem cookedRab = new CustomItem("Cooked Rabbit",2,true,false,
                "Get's you through winter",Material.COOKED_RABBIT,0.0,0.0);
        CustomItem seaweed = new CustomItem("Seaweed", 1,true,false,
                "Useless",Material.KELP_PLANT,0.0,0.0);
        CustomItem reed = new CustomItem("Reed",1,true,false,
                "Useless", Material.BAMBOO,0.0,0.0);
        CustomItem brokenPick = new CustomItem("Broken Pick",2,true,false,
                "A good starter pick",Material.STONE_PICKAXE,0.0,0.0);
        CustomItem shotAmmo = new CustomItem("Shotgun Ammo",2,true,false,
                "Buckshot only.",Material.WHEAT_SEEDS,0.0,0.0);
        CustomItem pistolAmmo = new CustomItem("Pistol Ammo",1,true,false,
                "Load your favorite .22",Material.NETHER_WART,0.0,0.0);
        CustomItem rifleAmmo = new CustomItem("Rifle Ammo",2,true,false,
                "Imported from China",Material.CLAY_BALL,0.0,0.0);
        CustomItem bandage = new CustomItem("Bandage",2,true,false,
                "Used to heal bloody wounds",Material.PAPER,0.0,0.0);
        CustomItem splint = new CustomItem("Splint",2,true,false,
                "Used to heal broken bones", Material.STICK,0.0,0.0);
        CustomItem tracker = new CustomItem("Tracker",1,true,false,
                "Track different locations",Material.COMPASS,0.0,0.0);
        CustomItem glassBottle = new CustomItem("Glass Bottle",2,true,false,
                "Used for brewing drinks",Material.GLASS_BOTTLE,0.0,0.0);
        CustomItem fishingRod = new CustomItem("Wooden Fishing Rod",2,true,false,
                "Basic stick and line",Material.FISHING_ROD,0.0,0.0);
        CustomItem unSmokeLeaf = new CustomItem("Unprocessed Smokeleaf",2,false,false,
                "Process to consume",Material.ENDER_PEARL,0.0,0.0);
        CustomItem unSpice = new CustomItem("Spice",2,false,false,
                "Process to consume",Material.HONEY_BOTTLE,0.0,0.0);
        CustomItem iron = new CustomItem("Iron Ore",2, true, false,
                "Can be refined or sold",Material.IRON_ORE,0.0,0.0);
        CustomItem copper = new CustomItem("Copper Ore",1, true, false,
                "Can be refined or sold",Material.COPPER_ORE,0.0,0.0);



        //UNCOMMON
        CustomItem cookedSalmon = new CustomItem("Smoked Salmon",3,true,false,
                "Fresh caught, fresh smoked",Material.COOKED_SALMON,0.0,0.0);
        CustomItem fermentedLiquor = new CustomItem("Fermented Liquor",4,true,false,
                "Extra kick to any home brew",Material.DRAGON_BREATH,0.0,0.0);
        CustomItem crappie = new CustomItem("Poor Man's Crappie",3,true,false,
                "Skinniest fish",Material.COD,0.0,0.0);
        CustomItem grayHerring = new CustomItem("Grey Stonned Herring",3,true,false,
                "The cheapest of Herring",Material.SALMON,0.0,0.0);
        CustomItem chub = new CustomItem("Cactus Pronged Chub",3,true,false,
                "Too spikey to eat",Material.TROPICAL_FISH,0.0,0.0);
        CustomItem boarCarcass = new CustomItem("Boar Carcass",3,true,false,
                "Right click to skin",Material.MUSIC_DISC_MALL,0.0,0.0);
        CustomItem cowCarcass = new CustomItem("Cow Carcass",3,true,false,
                "Right click to skin",Material.MUSIC_DISC_STRAD,0.0,0.0);
        CustomItem gold = new CustomItem("Gold Ore",3, true, false,
                "Can be refined or sold",Material.GOLD_ORE,0.0,0.0);
        CustomItem slug = new CustomItem("Slug",3,true, false,
                "Reaks of the sea",Material.SPIDER_EYE,0.0,0.0);
        CustomItem boarmeat = new CustomItem("Boar Meat",3,true,false,
                "Closest thing to bacon",Material.PORKCHOP,0.0,0.0);
        CustomItem cowmeat = new CustomItem("Cow Meat",3,true,false,
                "Prime beef",Material.BEEF,0.0,0.0);
        CustomItem rabbitmeat = new CustomItem("Rabbit Meat",3,true,false,
                "Not too gamey",Material.RABBIT,0.0,0.0);
        CustomItem foxmeat = new CustomItem("Fox Meat",4,true,false,
                "Better than chicken!",Material.CHICKEN,0.0,0.0);
        CustomItem boarhide = new CustomItem("Boar Hide",4,true,false,
                "Extermely tough hide",Material.RABBIT_HIDE,0.0,0.0);
        CustomItem cowhide = new CustomItem("Cow Hide",4,true,false,
                "Good for boots",Material.LEATHER,0.0,0.0);
        CustomItem rabbithide = new CustomItem("Rabbit Hide",4,true,false,
                "Good for small leather work",Material.LIGHT_GRAY_DYE,0.0,0.0);
        CustomItem foxfur = new CustomItem("Fox Fur",4,true,false,
                "Warmest fur on the market",Material.ORANGE_DYE,0.0,0.0);
        CustomItem geode = new CustomItem("Geode",4,true,false,
                "Bring to geologist to open",Material.FIREWORK_STAR,0.0,0.0);
        CustomItem minerspick = new CustomItem("Old Miner's Pick",4,true,false,
                "Steeled with rust",Material.IRON_PICKAXE,0.0,0.0);
        CustomItem procsmokeleaf = new CustomItem("Processed Smokeleaf",4,false,false,
                "Process to consume",Material.ENDER_PEARL,0.0,0.0);
        CustomItem spicebottle = new CustomItem("Spice Bottle",4,false,false,
                "Smell's like the future",Material.HONEY_BOTTLE,0.0,0.0);
        CustomItem oil = new CustomItem("Unrefined Oil",4,false,false,
                "Refine for higher sale value",Material.BUCKET,0.0,0.0);
        CustomItem frenzyrecipe = new CustomItem("Miner's Frenzy Brew Recipe",3,true,false,
                "Right click to view recipe",Material.FLOWER_BANNER_PATTERN,0.0,0.0);
        CustomItem doublespaderecipe = new CustomItem("Miner's Double Spade Brew Recipe",3,true,false,
                "Right click to view recipe",Material.FLOWER_BANNER_PATTERN,0.0,0.0);
        CustomItem greenthumbrecipe = new CustomItem("Green Thumb Brew Recipe",3,true,false,
                "Right click to view recipe",Material.FLOWER_BANNER_PATTERN,0.0,0.0);
        CustomItem fermentliquorrecipe = new CustomItem("Fermented Liquor Recipe",3,true,false,
                "Right click to view recipe",Material.FLOWER_BANNER_PATTERN,0.0,0.0);

        //RARE ITEMS
        CustomItem amythestBud = new CustomItem("Amythest Bud",6, true,false,
                "Like a blossoming rose",Material.AMETHYST_SHARD,0.0,0.0);
        CustomItem mossyJade = new CustomItem("Mossy Jade",5,true,false,
                "Look's alive under light",Material.SLIME_BALL,0.0,0.0);
        CustomItem hermitCrab = new CustomItem("Hermit Crab",5,true,false,
                "Fish love it",Material.NAUTILUS_SHELL,0.0,0.0);
        CustomItem frenziedStems = new CustomItem("Frenzied Stems",5,true,false,
                "Used on workers for productivity",Material.FIRE_CORAL,0.0,0.0);
        CustomItem heartFruit = new CustomItem("Heart Fruit",5,true,false,
                "Still beating",Material.SWEET_BERRIES,0.0,0.0);
        CustomItem refinedOil = new CustomItem("Refined Oil",6,false,false,
                "Highly sought after",Material.LAVA_BUCKET,0.0,0.0);
        CustomItem southernsalmon = new CustomItem("Southern Salmon",6,true,false,
                "Migrated south through the tributaries",Material.MUSIC_DISC_FAR,0.0,0.0);
        CustomItem arcticsalmon = new CustomItem("Arctic Salmon",6,true,false,
                "Still in the frozen north",Material.MUSIC_DISC_13,0.0,0.0);


        //LEGENDARY
        CustomItem alligator = new CustomItem("Alligator",8,true,false,
                "Crikey!",Material.MUSIC_DISC_CHIRP,0.0,0.0);
        CustomItem sunkenCatfish = new CustomItem("Sunken Catfish",8,true,false,
                "Evolved in the low-lands",Material.MUSIC_DISC_BLOCKS,0.0,0.0);
        CustomItem goldstonnedherring = new CustomItem("Gold Stonned Herring",7,true,false,
                "The rare mutation of the gray herring",Material.MUSIC_DISC_MELLOHI,0.0,0.0);
        CustomItem pearlrivertrout = new CustomItem("Pearl River Trout",7,true,false,
                "Alluring rainbow scales",Material.MUSIC_DISC_CAT,0.0,0.0);
        CustomItem piratesBooty = new CustomItem("Pirates booty",8,true,false,
                "Richest dabloon",Material.SUNFLOWER,0.0,0.0);
        CustomItem oilBarrel = new CustomItem("Oil Barrel",7,false,false,
                "A large amount of refined oil",Material.WATER_BUCKET,0.0,0.0);
        CustomItem goldengamble = new CustomItem("Golden Gamble Petal",7,true,false,
                "Said to be lucky!",Material.HONEYCOMB,0.0,0.0);
        CustomItem molesbreath = new CustomItem("Moles Breath Spores",7,true,false,
                "Moles use it to dig quicker",Material.FROGSPAWN,0.0,0.0);
        CustomItem starpetal = new CustomItem("Star Malt Petal",7,true,false,
                "It smell makes dreams come true",Material.GLOW_INK_SAC,0.0,0.0);
        CustomItem riverdiamond = new CustomItem("River Diamond",7,true,false,
                "The root of many wars",Material.DIAMOND,0.0,0.0);
        CustomItem barronsemerald = new CustomItem("Barron's Emerald",7,true,false,
                "An old king was fond of these",Material.EMERALD,0.0,0.0);
        CustomItem voidopal = new CustomItem("Void Opal",8,true,false,
                "Stare into the depths of the universe",Material.ECHO_SHARD,0.0,0.0);


    }
    public static void loadLocations(){
        Location stormpoint = new Location("Storm Point","Drug Base", LocationType.ILLEGAL, 26, -157, -2788, -3015);
        Location northoil = new Location("North Oil Field","Illegal area!",LocationType.ILLEGAL, 2827,3041,-2951,-3189);
        Location sloughcreek = new Location("Slough Creek","Scav Town",LocationType.ILLEGAL,2589,2835,799,471);

        Location neworleans = new Location("New Orleans", "PvP disabled!",LocationType.TOWN,-1230,-1403,-1834,-1664.0,-1253.0,86.0,-1667.0);
        Location santafe = new Location("Santa Fe","PvP Disabled",LocationType.TOWN,1119,888,-1755,-2066,1055.0,94.0,-1955.0);
        Location texas = new Location("Republic of Texas","PvP Disabled",LocationType.TOWN,-1197,-831,2628,2214,-1034.0,72.0,2526.0);

        Location prison = new Location("Prison","JaiL!",LocationType.Prison, 47,52,1271,1277,50,67,1273);

        Location blackspur = new Location("Black Spur Mines","Be weary of the depths",LocationType.NATURAL,1542,2248,-2102,-1775);

        Location sloughcreekR = new Location("Slough Creek River","Fishings good",LocationType.River, 2545,2698,38,1243);
        Location pearlR = new Location("Pearl River","Good fishing!",LocationType.River,2599,2083,-2596,-2475);

        Location wilderness = new Location("Wilderness", "Yeehaw", LocationType.WILDERNESS, 0, 0, 0, 0);

    }
    public static void loadIcons()
    {
        // These are player prefixes
        ItemIcon cowboy = new ItemIcon("Cowboy","Choose cowboy!", Material.HAY_BLOCK);
        ItemIcon tracker = new ItemIcon("Tracker", "Choose tracker!",Material.LEATHER_BOOTS);
        ItemIcon raider = new ItemIcon("Raider","Choose raider!",Material.SKELETON_SKULL);

        //These are icons for the tracker system
        ItemIcon town = new ItemIcon("Towns", "Find town", Material.DARK_OAK_HANGING_SIGN);
            ItemIcon santaFe = new ItemIcon("Santa Fe", "Directions to Santa Fe", Material.WHITE_BANNER);
            ItemIcon newOrleans = new ItemIcon("New Orleans", "Directions to New Orleans", Material.YELLOW_BANNER);
            ItemIcon texas = new ItemIcon("Republic of0 Texas", "Directions to the Republic of Texas", Material.BLUE_BANNER);
        ItemIcon player = new ItemIcon("Players", "Find players", Material.PLAYER_HEAD);
            ItemIcon wantedPlayer = new ItemIcon("Nearest Wanted Player", "Nearest wanted player", Material.ZOMBIE_HEAD);
        ItemIcon contracts = new ItemIcon("Contracts", "Contract location", Material.BOOK);
            // contract icons ???
        ItemIcon merchants = new ItemIcon("Merchants", "Find Merchants", Material.BELL);
            ItemIcon fisherman = new ItemIcon("Fisherman", "Find Fisherman", Material.FISHING_ROD);
            ItemIcon pharmacist = new ItemIcon("Pharmacist", "Find Pharmacist", Material.PAPER);
            ItemIcon armsDealer = new ItemIcon("Arms Dealer", "Find Arms Dealer", Material.STONE_AXE);
            ItemIcon illegalArms = new ItemIcon("Illegal Arms Dealer", "Illegal Arms Dealer", Material.IRON_AXE);
            ItemIcon armorer = new ItemIcon("Armorer", "Find Armorer", Material.LEATHER_CHESTPLATE);
            ItemIcon illegalArmor = new ItemIcon("Illegal Armorer", "Find Illegal Armorer", Material.NETHERITE_CHESTPLATE);
            ItemIcon generalStore = new ItemIcon("General Store", "Find General Store", Material.COOKED_BEEF);
            ItemIcon geologist = new ItemIcon("Geologist", "Find Geologist", Material.STONE);
            ItemIcon stableManager = new ItemIcon("Stable Manager", "Find Stable Manager", Material.SADDLE);
        ItemIcon npc =  new ItemIcon("NPCs", "Find NPCs", Material.BOOKSHELF);
            ItemIcon conductor = new ItemIcon("Conductor", "Find Conductor", Material.RAIL);
            ItemIcon ferryCaptain = new ItemIcon("Ferry Captain", "Find Ferry Captain", Material.BIRCH_BOAT);
            ItemIcon bankTeller = new ItemIcon("Banker Teller", "Find Bank Teller", Material.GOLD_INGOT);
            ItemIcon itemVault = new ItemIcon("Item Vault Manager", "Find Vault Manager", Material.DIAMOND);
            ItemIcon contractor = new ItemIcon("Contractor", "Find Contractor", Material.FILLED_MAP);
            ItemIcon chief = new ItemIcon("Chief of Police", "Find Chief", Material.PIGLIN_HEAD);
        ItemIcon locations = new ItemIcon("Locations", "Find locations", Material.COMPASS);
            ItemIcon mines = new ItemIcon("Mines", "Find Mines", Material.COBBLESTONE);
                ItemIcon blackSpur = new ItemIcon("Black Spur Mines", "Find the Black Spur Mines", Material.FLINT);
                ItemIcon barron = new ItemIcon("Barron's Canyon", "Find Barron's Canyon", Material.TERRACOTTA);
                ItemIcon halfDome = new ItemIcon("Half Dome Mines", "Find the Half Dome Mines", Material.STONE);
            ItemIcon rivers = new ItemIcon("Rivers", "Find Rivers", Material.WATER_BUCKET);
                ItemIcon pearl = new ItemIcon("Pearl River", "Find Pearl River", Material.MUSIC_DISC_CAT);
                ItemIcon threeForks = new ItemIcon("Three Forks Delta", "Find Three Forks Delta", Material.MUSIC_DISC_CHIRP);
                ItemIcon lowerGuada = new ItemIcon("Lower Guadalupe River", "Find Guadalupe River", Material.MUSIC_DISC_BLOCKS);
                ItemIcon slough = new ItemIcon("Slough Creek", "Find Slough Creek", Material.MUSIC_DISC_FAR);
            ItemIcon forestReserves = new ItemIcon("Forest Reserves", "Find Forest Reserves", Material.OAK_SAPLING);
                ItemIcon grizzly = new ItemIcon("Grizzly Ridge", "Find Grizzly Ridge", Material.OAK_SAPLING);
                ItemIcon marston = new ItemIcon("Marston Glacier", "Find Marston Glacier", Material.BIRCH_SAPLING);
                ItemIcon hawkRidge = new ItemIcon("Hawk Ridge Forest", "Find Hawk Ridge Forest", Material.ACACIA_SAPLING);
                ItemIcon sentinel = new ItemIcon("Sentinel Rock", "Find Sentinel Rock", Material.QUARTZ);
            ItemIcon banditCamps = new ItemIcon("Bandit Camps", "Find Bandit Camps", Material.SKELETON_SKULL);
                ItemIcon redAsh = new ItemIcon("Red Ash Camp", "Find Red Ash Camp", Material.REDSTONE);
                ItemIcon stormPoint = new ItemIcon("Storm Point Rebel Base", "Find Storm Point", Material.ITEM_FRAME);
            ItemIcon scavTowns = new ItemIcon("Scav Towns", "Find Scav Towns", Material.OAK_DOOR);
                ItemIcon florence = new ItemIcon("Florence Peak", "Find Florence Peak", Material.ACACIA_DOOR);
                ItemIcon washington = new ItemIcon("Washington Column", "Find Washington Column", Material.SPRUCE_DOOR);
                ItemIcon sierra = new ItemIcon("Sierra Gorge", "Find Sierra Gorge", Material.BIRCH_DOOR);
            ItemIcon oilFields = new ItemIcon("Oil Fields", "Find Oil Fields", Material.BUCKET);
                ItemIcon northMoraine = new ItemIcon("North Moraine Oil Field", "Find North Moraine Oil Field", Material.BUCKET);
            ItemIcon drugFields = new ItemIcon("Drug Fields", "Find Drug Fields", Material.KELP);
                ItemIcon smokeLeaf = new ItemIcon("Smokeleaf Drug Field", "Find Smokeleaf Drug Field", Material.KELP);




        ItemIcon miner = new ItemIcon("Miner","Choose miner!",Material.STONE_PICKAXE);
        ItemIcon medic = new ItemIcon("Medic","Choose medic!",Material.PAPER);
        ItemIcon explorer = new ItemIcon("Explorer","Choose explorer!",Material.SPYGLASS);
        ItemIcon contractorTitle = new ItemIcon("Contractor Title","Select your contractor title",Material.SPRUCE_HANGING_SIGN);

        ItemIcon santafeRespawn = new ItemIcon("Respawn: Santa Fe","Click to respawn here",Material.WHITE_BANNER);
        ItemIcon neworleansRespawn = new ItemIcon("Respawn: New Orleans","Click to respawn here",Material.YELLOW_BANNER);
        ItemIcon texasRespawn = new ItemIcon("Respawn: Republic of Texas", "Click to respawn here",Material.BLUE_BANNER);

    }

    public static void loadBrewing(){
        System.out.println("In Load Brewing");
        new BrewingRecipe(Material.BOWL, (inventory, ingredient) -> {//Some lambda magic
            return new ItemStack(Material.BEACON);

        });
    }
}
