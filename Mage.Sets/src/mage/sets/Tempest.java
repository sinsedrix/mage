package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

public class Tempest extends ExpansionSet {

    private static final Tempest instance = new Tempest();

    public static Tempest getInstance() {
        return instance;
    }

    private Tempest() {
        super("Tempest", "TMP", ExpansionSet.buildDate(1997, 10, 1), SetType.EXPANSION);
        this.blockName = "Tempest";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Abandon Hope", 1, Rarity.UNCOMMON, mage.cards.a.AbandonHope.class));
        cards.add(new SetCardInfo("Advance Scout", 213, Rarity.COMMON, mage.cards.a.AdvanceScout.class));
        cards.add(new SetCardInfo("Aftershock", 160, Rarity.COMMON, mage.cards.a.Aftershock.class));
        cards.add(new SetCardInfo("Altar of Dementia", 266, Rarity.RARE, mage.cards.a.AltarOfDementia.class));
        cards.add(new SetCardInfo("Aluren", 107, Rarity.RARE, mage.cards.a.Aluren.class));
        cards.add(new SetCardInfo("Ancient Runes", 161, Rarity.UNCOMMON, mage.cards.a.AncientRunes.class));
        cards.add(new SetCardInfo("Ancient Tomb", 305, Rarity.UNCOMMON, mage.cards.a.AncientTomb.class));
        cards.add(new SetCardInfo("Angelic Protector", 214, Rarity.UNCOMMON, mage.cards.a.AngelicProtector.class));
        cards.add(new SetCardInfo("Anoint", 215, Rarity.COMMON, mage.cards.a.Anoint.class));
        cards.add(new SetCardInfo("Apes of Rath", 108, Rarity.UNCOMMON, mage.cards.a.ApesOfRath.class));
        cards.add(new SetCardInfo("Apocalypse", 162, Rarity.RARE, mage.cards.a.Apocalypse.class));
        cards.add(new SetCardInfo("Armored Pegasus", 217, Rarity.COMMON, mage.cards.a.ArmoredPegasus.class));
        cards.add(new SetCardInfo("Armor Sliver", 216, Rarity.UNCOMMON, mage.cards.a.ArmorSliver.class));
        cards.add(new SetCardInfo("Auratog", 218, Rarity.RARE, mage.cards.a.Auratog.class));
        cards.add(new SetCardInfo("Avenging Angel", 219, Rarity.RARE, mage.cards.a.AvengingAngel.class));
        cards.add(new SetCardInfo("Barbed Sliver", 163, Rarity.UNCOMMON, mage.cards.b.BarbedSliver.class));
        cards.add(new SetCardInfo("Bayou Dragonfly", 109, Rarity.COMMON, mage.cards.b.BayouDragonfly.class));
        cards.add(new SetCardInfo("Bellowing Fiend", 2, Rarity.RARE, mage.cards.b.BellowingFiend.class));
        cards.add(new SetCardInfo("Benthic Behemoth", 54, Rarity.RARE, mage.cards.b.BenthicBehemoth.class));
        cards.add(new SetCardInfo("Blood Frenzy", 164, Rarity.COMMON, mage.cards.b.BloodFrenzy.class));
        cards.add(new SetCardInfo("Blood Pet", 3, Rarity.COMMON, mage.cards.b.BloodPet.class));
        cards.add(new SetCardInfo("Boil", 165, Rarity.UNCOMMON, mage.cards.b.Boil.class));
        cards.add(new SetCardInfo("Bottle Gnomes", 268, Rarity.UNCOMMON, mage.cards.b.BottleGnomes.class));
        cards.add(new SetCardInfo("Bounty Hunter", 4, Rarity.RARE, mage.cards.b.BountyHunter.class));
        cards.add(new SetCardInfo("Broken Fall", 110, Rarity.COMMON, mage.cards.b.BrokenFall.class));
        cards.add(new SetCardInfo("Caldera Lake", 306, Rarity.RARE, mage.cards.c.CalderaLake.class));
        cards.add(new SetCardInfo("Canopy Spider", 111, Rarity.COMMON, mage.cards.c.CanopySpider.class));
        cards.add(new SetCardInfo("Canyon Drake", 166, Rarity.RARE, mage.cards.c.CanyonDrake.class));
        cards.add(new SetCardInfo("Canyon Wildcat", 167, Rarity.COMMON, mage.cards.c.CanyonWildcat.class));
        cards.add(new SetCardInfo("Capsize", 55, Rarity.COMMON, mage.cards.c.Capsize.class));
        cards.add(new SetCardInfo("Chaotic Goo", 168, Rarity.RARE, mage.cards.c.ChaoticGoo.class));
        cards.add(new SetCardInfo("Charging Rhino", 112, Rarity.UNCOMMON, mage.cards.c.ChargingRhino.class));
        cards.add(new SetCardInfo("Chill", 56, Rarity.UNCOMMON, mage.cards.c.Chill.class));
        cards.add(new SetCardInfo("Choke", 113, Rarity.UNCOMMON, mage.cards.c.Choke.class));
        cards.add(new SetCardInfo("Cinder Marsh", 307, Rarity.UNCOMMON, mage.cards.c.CinderMarsh.class));
        cards.add(new SetCardInfo("Circle of Protection: Black", 220, Rarity.COMMON, mage.cards.c.CircleOfProtectionBlack.class));
        cards.add(new SetCardInfo("Circle of Protection: Blue", 221, Rarity.COMMON, mage.cards.c.CircleOfProtectionBlue.class));
        cards.add(new SetCardInfo("Circle of Protection: Green", 222, Rarity.COMMON, mage.cards.c.CircleOfProtectionGreen.class));
        cards.add(new SetCardInfo("Circle of Protection: Red", 223, Rarity.COMMON, mage.cards.c.CircleOfProtectionRed.class));
        cards.add(new SetCardInfo("Circle of Protection: Shadow", 224, Rarity.COMMON, mage.cards.c.CircleOfProtectionShadow.class));
        cards.add(new SetCardInfo("Circle of Protection: White", 225, Rarity.COMMON, mage.cards.c.CircleOfProtectionWhite.class));
        cards.add(new SetCardInfo("Clergy en-Vec", 226, Rarity.COMMON, mage.cards.c.ClergyEnVec.class));
        cards.add(new SetCardInfo("Clot Sliver", 6, Rarity.COMMON, mage.cards.c.ClotSliver.class));
        cards.add(new SetCardInfo("Cloudchaser Eagle", 227, Rarity.COMMON, mage.cards.c.CloudchaserEagle.class));
        cards.add(new SetCardInfo("Coercion", 7, Rarity.COMMON, mage.cards.c.Coercion.class));
        cards.add(new SetCardInfo("Coffin Queen", 8, Rarity.RARE, mage.cards.c.CoffinQueen.class));
        cards.add(new SetCardInfo("Coiled Tinviper", 269, Rarity.COMMON, mage.cards.c.CoiledTinviper.class));
        cards.add(new SetCardInfo("Cold Storage", 270, Rarity.RARE, mage.cards.c.ColdStorage.class));
        cards.add(new SetCardInfo("Commander Greven il-Vec", 9, Rarity.RARE, mage.cards.c.CommanderGrevenIlVec.class));
        cards.add(new SetCardInfo("Corpse Dance", 10, Rarity.RARE, mage.cards.c.CorpseDance.class));
        cards.add(new SetCardInfo("Counterspell", 57, Rarity.COMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Crazed Armodon", 114, Rarity.RARE, mage.cards.c.CrazedArmodon.class));
        cards.add(new SetCardInfo("Crown of Flames", 169, Rarity.COMMON, mage.cards.c.CrownOfFlames.class));
        cards.add(new SetCardInfo("Cursed Scroll", 271, Rarity.RARE, mage.cards.c.CursedScroll.class));
        cards.add(new SetCardInfo("Dark Banishing", 11, Rarity.COMMON, mage.cards.d.DarkBanishing.class));
        cards.add(new SetCardInfo("Darkling Stalker", 13, Rarity.COMMON, mage.cards.d.DarklingStalker.class));
        cards.add(new SetCardInfo("Dark Ritual", 12, Rarity.COMMON, mage.cards.d.DarkRitual.class));
        cards.add(new SetCardInfo("Dauthi Embrace", 14, Rarity.UNCOMMON, mage.cards.d.DauthiEmbrace.class));
        cards.add(new SetCardInfo("Dauthi Ghoul", 15, Rarity.UNCOMMON, mage.cards.d.DauthiGhoul.class));
        cards.add(new SetCardInfo("Dauthi Horror", 16, Rarity.COMMON, mage.cards.d.DauthiHorror.class));
        cards.add(new SetCardInfo("Dauthi Marauder", 17, Rarity.COMMON, mage.cards.d.DauthiMarauder.class));
        cards.add(new SetCardInfo("Dauthi Mercenary", 18, Rarity.UNCOMMON, mage.cards.d.DauthiMercenary.class));
        cards.add(new SetCardInfo("Dauthi Mindripper", 19, Rarity.UNCOMMON, mage.cards.d.DauthiMindripper.class));
        cards.add(new SetCardInfo("Dauthi Slayer", 20, Rarity.COMMON, mage.cards.d.DauthiSlayer.class));
        cards.add(new SetCardInfo("Deadshot", 170, Rarity.RARE, mage.cards.d.Deadshot.class));
        cards.add(new SetCardInfo("Death Pits of Rath", 21, Rarity.RARE, mage.cards.d.DeathPitsOfRath.class));
        cards.add(new SetCardInfo("Diabolic Edict", 22, Rarity.COMMON, mage.cards.d.DiabolicEdict.class));
        cards.add(new SetCardInfo("Dirtcowl Wurm", 115, Rarity.RARE, mage.cards.d.DirtcowlWurm.class));
        cards.add(new SetCardInfo("Disenchant", 228, Rarity.COMMON, mage.cards.d.Disenchant.class));
        cards.add(new SetCardInfo("Dismiss", 58, Rarity.UNCOMMON, mage.cards.d.Dismiss.class));
        cards.add(new SetCardInfo("Disturbed Burial", 23, Rarity.COMMON, mage.cards.d.DisturbedBurial.class));
        cards.add(new SetCardInfo("Dracoplasm", 341, Rarity.RARE, mage.cards.d.Dracoplasm.class));
        cards.add(new SetCardInfo("Dread of Night", 24, Rarity.UNCOMMON, mage.cards.d.DreadOfNight.class));
        cards.add(new SetCardInfo("Dream Cache", 59, Rarity.COMMON, mage.cards.d.DreamCache.class));
        cards.add(new SetCardInfo("Dregs of Sorrow", 25, Rarity.RARE, mage.cards.d.DregsOfSorrow.class));
        cards.add(new SetCardInfo("Earthcraft", 116, Rarity.RARE, mage.cards.e.Earthcraft.class));
        cards.add(new SetCardInfo("Echo Chamber", 272, Rarity.RARE, mage.cards.e.EchoChamber.class));
        cards.add(new SetCardInfo("Eladamri, Lord of Leaves", 117, Rarity.RARE, mage.cards.e.EladamriLordOfLeaves.class));
        cards.add(new SetCardInfo("Eladamri's Vineyard", 118, Rarity.RARE, mage.cards.e.EladamrisVineyard.class));
        cards.add(new SetCardInfo("Elite Javelineer", 229, Rarity.COMMON, mage.cards.e.EliteJavelineer.class));
        cards.add(new SetCardInfo("Elven Warhounds", 119, Rarity.RARE, mage.cards.e.ElvenWarhounds.class));
        cards.add(new SetCardInfo("Elvish Fury", 120, Rarity.UNCOMMON, mage.cards.e.ElvishFury.class));
        cards.add(new SetCardInfo("Emerald Medallion", 273, Rarity.RARE, mage.cards.e.EmeraldMedallion.class));
        cards.add(new SetCardInfo("Emmessi Tome", 274, Rarity.RARE, mage.cards.e.EmmessiTome.class));
        cards.add(new SetCardInfo("Endless Scream", 26, Rarity.COMMON, mage.cards.e.EndlessScream.class));
        cards.add(new SetCardInfo("Energizer", 275, Rarity.RARE, mage.cards.e.Energizer.class));
        cards.add(new SetCardInfo("Enfeeblement", 27, Rarity.COMMON, mage.cards.e.Enfeeblement.class));
        cards.add(new SetCardInfo("Enraging Licid", 171, Rarity.UNCOMMON, mage.cards.e.EnragingLicid.class));
        cards.add(new SetCardInfo("Essence Bottle", 276, Rarity.UNCOMMON, mage.cards.e.EssenceBottle.class));
        cards.add(new SetCardInfo("Evincar's Justice", 28, Rarity.COMMON, mage.cards.e.EvincarsJustice.class));
        cards.add(new SetCardInfo("Excavator", 277, Rarity.UNCOMMON, mage.cards.e.Excavator.class));
        cards.add(new SetCardInfo("Extinction", 29, Rarity.RARE, mage.cards.e.Extinction.class));
        cards.add(new SetCardInfo("Fevered Convulsions", 30, Rarity.RARE, mage.cards.f.FeveredConvulsions.class));
        cards.add(new SetCardInfo("Field of Souls", 230, Rarity.RARE, mage.cards.f.FieldOfSouls.class));
        cards.add(new SetCardInfo("Fighting Drake", 63, Rarity.UNCOMMON, mage.cards.f.FightingDrake.class));
        cards.add(new SetCardInfo("Firefly", 172, Rarity.UNCOMMON, mage.cards.f.Firefly.class));
        cards.add(new SetCardInfo("Fireslinger", 173, Rarity.COMMON, mage.cards.f.Fireslinger.class));
        cards.add(new SetCardInfo("Flailing Drake", 121, Rarity.UNCOMMON, mage.cards.f.FlailingDrake.class));
        cards.add(new SetCardInfo("Flickering Ward", 231, Rarity.UNCOMMON, mage.cards.f.FlickeringWard.class));
        cards.add(new SetCardInfo("Flowstone Giant", 174, Rarity.COMMON, mage.cards.f.FlowstoneGiant.class));
        cards.add(new SetCardInfo("Flowstone Salamander", 175, Rarity.UNCOMMON, mage.cards.f.FlowstoneSalamander.class));
        cards.add(new SetCardInfo("Flowstone Sculpture", 278, Rarity.RARE, mage.cards.f.FlowstoneSculpture.class));
        cards.add(new SetCardInfo("Flowstone Wyvern", 176, Rarity.RARE, mage.cards.f.FlowstoneWyvern.class));
        cards.add(new SetCardInfo("Fool's Tome", 279, Rarity.RARE, mage.cards.f.FoolsTome.class));
        cards.add(new SetCardInfo("Forest", 308, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 309, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 310, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 311, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Frog Tongue", 122, Rarity.COMMON, mage.cards.f.FrogTongue.class));
        cards.add(new SetCardInfo("Fugitive Druid", 123, Rarity.RARE, mage.cards.f.FugitiveDruid.class));
        cards.add(new SetCardInfo("Furnace of Rath", 177, Rarity.RARE, mage.cards.f.FurnaceOfRath.class));
        cards.add(new SetCardInfo("Fylamarid", 64, Rarity.UNCOMMON, mage.cards.f.Fylamarid.class));
        cards.add(new SetCardInfo("Gallantry", 232, Rarity.UNCOMMON, mage.cards.g.Gallantry.class));
        cards.add(new SetCardInfo("Gaseous Form", 65, Rarity.COMMON, mage.cards.g.GaseousForm.class));
        cards.add(new SetCardInfo("Gerrard's Battle Cry", 233, Rarity.RARE, mage.cards.g.GerrardsBattleCry.class));
        cards.add(new SetCardInfo("Ghost Town", 312, Rarity.UNCOMMON, mage.cards.g.GhostTown.class));
        cards.add(new SetCardInfo("Giant Crab", 66, Rarity.COMMON, mage.cards.g.GiantCrab.class));
        cards.add(new SetCardInfo("Giant Strength", 178, Rarity.COMMON, mage.cards.g.GiantStrength.class));
        cards.add(new SetCardInfo("Goblin Bombardment", 179, Rarity.UNCOMMON, mage.cards.g.GoblinBombardment.class));
        cards.add(new SetCardInfo("Gravedigger", 31, Rarity.COMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Grindstone", 280, Rarity.RARE, mage.cards.g.Grindstone.class));
        cards.add(new SetCardInfo("Hand to Hand", 180, Rarity.RARE, mage.cards.h.HandToHand.class));
        cards.add(new SetCardInfo("Hanna's Custody", 234, Rarity.RARE, mage.cards.h.HannasCustody.class));
        cards.add(new SetCardInfo("Harrow", 124, Rarity.UNCOMMON, mage.cards.h.Harrow.class));
        cards.add(new SetCardInfo("Havoc", 181, Rarity.UNCOMMON, mage.cards.h.Havoc.class));
        cards.add(new SetCardInfo("Heart Sliver", 182, Rarity.COMMON, mage.cards.h.HeartSliver.class));
        cards.add(new SetCardInfo("Heartwood Dryad", 125, Rarity.COMMON, mage.cards.h.HeartwoodDryad.class));
        cards.add(new SetCardInfo("Heartwood Giant", 126, Rarity.RARE, mage.cards.h.HeartwoodGiant.class));
        cards.add(new SetCardInfo("Heartwood Treefolk", 127, Rarity.UNCOMMON, mage.cards.h.HeartwoodTreefolk.class));
        cards.add(new SetCardInfo("Helm of Possession", 281, Rarity.RARE, mage.cards.h.HelmOfPossession.class));
        cards.add(new SetCardInfo("Hero's Resolve", 235, Rarity.COMMON, mage.cards.h.HerosResolve.class));
        cards.add(new SetCardInfo("Horned Sliver", 128, Rarity.UNCOMMON, mage.cards.h.HornedSliver.class));
        cards.add(new SetCardInfo("Horned Turtle", 67, Rarity.COMMON, mage.cards.h.HornedTurtle.class));
        cards.add(new SetCardInfo("Humility", 236, Rarity.RARE, mage.cards.h.Humility.class));
        cards.add(new SetCardInfo("Imps' Taunt", 32, Rarity.UNCOMMON, mage.cards.i.ImpsTaunt.class));
        cards.add(new SetCardInfo("Insight", 68, Rarity.UNCOMMON, mage.cards.i.Insight.class));
        cards.add(new SetCardInfo("Interdict", 69, Rarity.UNCOMMON, mage.cards.i.Interdict.class));
        cards.add(new SetCardInfo("Intuition", 70, Rarity.RARE, mage.cards.i.Intuition.class));
        cards.add(new SetCardInfo("Invulnerability", 237, Rarity.UNCOMMON, mage.cards.i.Invulnerability.class));
        cards.add(new SetCardInfo("Island", 313, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 314, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 315, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 316, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jackal Pup", 183, Rarity.UNCOMMON, mage.cards.j.JackalPup.class));
        cards.add(new SetCardInfo("Jet Medallion", 282, Rarity.RARE, mage.cards.j.JetMedallion.class));
        cards.add(new SetCardInfo("Jinxed Idol", 283, Rarity.RARE, mage.cards.j.JinxedIdol.class));
        cards.add(new SetCardInfo("Kezzerdrix", 33, Rarity.RARE, mage.cards.k.Kezzerdrix.class));
        cards.add(new SetCardInfo("Kindle", 184, Rarity.COMMON, mage.cards.k.Kindle.class));
        cards.add(new SetCardInfo("Knight of Dawn", 238, Rarity.UNCOMMON, mage.cards.k.KnightOfDawn.class));
        cards.add(new SetCardInfo("Knight of Dusk", 34, Rarity.UNCOMMON, mage.cards.k.KnightOfDusk.class));
        cards.add(new SetCardInfo("Krakilin", 129, Rarity.UNCOMMON, mage.cards.k.Krakilin.class));
        cards.add(new SetCardInfo("Leeching Licid", 35, Rarity.UNCOMMON, mage.cards.l.LeechingLicid.class));
        cards.add(new SetCardInfo("Legacy's Allure", 71, Rarity.UNCOMMON, mage.cards.l.LegacysAllure.class));
        cards.add(new SetCardInfo("Legerdemain", 72, Rarity.UNCOMMON, mage.cards.l.Legerdemain.class));
        cards.add(new SetCardInfo("Lightning Blast", 185, Rarity.COMMON, mage.cards.l.LightningBlast.class));
        cards.add(new SetCardInfo("Lightning Elemental", 186, Rarity.COMMON, mage.cards.l.LightningElemental.class));
        cards.add(new SetCardInfo("Light of Day", 239, Rarity.UNCOMMON, mage.cards.l.LightOfDay.class));
        cards.add(new SetCardInfo("Living Death", 36, Rarity.RARE, mage.cards.l.LivingDeath.class));
        cards.add(new SetCardInfo("Lobotomy", 342, Rarity.UNCOMMON, mage.cards.l.Lobotomy.class));
        cards.add(new SetCardInfo("Lotus Petal", 284, Rarity.COMMON, mage.cards.l.LotusPetal.class));
        cards.add(new SetCardInfo("Lowland Giant", 187, Rarity.COMMON, mage.cards.l.LowlandGiant.class));
        cards.add(new SetCardInfo("Maddening Imp", 37, Rarity.RARE, mage.cards.m.MaddeningImp.class));
        cards.add(new SetCardInfo("Magmasaur", 188, Rarity.RARE, mage.cards.m.Magmasaur.class));
        cards.add(new SetCardInfo("Manakin", 286, Rarity.COMMON, mage.cards.m.Manakin.class));
        cards.add(new SetCardInfo("Mana Severance", 73, Rarity.RARE, mage.cards.m.ManaSeverance.class));
        cards.add(new SetCardInfo("Manta Riders", 74, Rarity.COMMON, mage.cards.m.MantaRiders.class));
        cards.add(new SetCardInfo("Marble Titan", 240, Rarity.RARE, mage.cards.m.MarbleTitan.class));
        cards.add(new SetCardInfo("Marsh Lurker", 38, Rarity.COMMON, mage.cards.m.MarshLurker.class));
        cards.add(new SetCardInfo("Master Decoy", 241, Rarity.COMMON, mage.cards.m.MasterDecoy.class));
        cards.add(new SetCardInfo("Mawcor", 75, Rarity.RARE, mage.cards.m.Mawcor.class));
        cards.add(new SetCardInfo("Maze of Shadows", 317, Rarity.UNCOMMON, mage.cards.m.MazeOfShadows.class));
        cards.add(new SetCardInfo("Meditate", 76, Rarity.RARE, mage.cards.m.Meditate.class));
        cards.add(new SetCardInfo("Metallic Sliver", 287, Rarity.COMMON, mage.cards.m.MetallicSliver.class));
        cards.add(new SetCardInfo("Mindwhip Sliver", 39, Rarity.UNCOMMON, mage.cards.m.MindwhipSliver.class));
        cards.add(new SetCardInfo("Mirri's Guile", 130, Rarity.RARE, mage.cards.m.MirrisGuile.class));
        cards.add(new SetCardInfo("Mnemonic Sliver", 77, Rarity.UNCOMMON, mage.cards.m.MnemonicSliver.class));
        cards.add(new SetCardInfo("Mogg Cannon", 288, Rarity.UNCOMMON, mage.cards.m.MoggCannon.class));
        cards.add(new SetCardInfo("Mogg Conscripts", 189, Rarity.COMMON, mage.cards.m.MoggConscripts.class));
        cards.add(new SetCardInfo("Mogg Fanatic", 190, Rarity.COMMON, mage.cards.m.MoggFanatic.class));
        cards.add(new SetCardInfo("Mogg Hollows", 318, Rarity.UNCOMMON, mage.cards.m.MoggHollows.class));
        cards.add(new SetCardInfo("Mogg Raider", 191, Rarity.COMMON, mage.cards.m.MoggRaider.class));
        cards.add(new SetCardInfo("Mogg Squad", 192, Rarity.COMMON, mage.cards.m.MoggSquad.class));
        cards.add(new SetCardInfo("Mongrel Pack", 131, Rarity.RARE, mage.cards.m.MongrelPack.class));
        cards.add(new SetCardInfo("Mountain", 319, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 320, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 321, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 322, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mounted Archers", 242, Rarity.COMMON, mage.cards.m.MountedArchers.class));
        cards.add(new SetCardInfo("Muscle Sliver", 132, Rarity.COMMON, mage.cards.m.MuscleSliver.class));
        cards.add(new SetCardInfo("Natural Spring", 133, Rarity.COMMON, mage.cards.n.NaturalSpring.class));
        cards.add(new SetCardInfo("Nature's Revolt", 134, Rarity.RARE, mage.cards.n.NaturesRevolt.class));
        cards.add(new SetCardInfo("Needle Storm", 135, Rarity.UNCOMMON, mage.cards.n.NeedleStorm.class));
        cards.add(new SetCardInfo("Nurturing Licid", 136, Rarity.UNCOMMON, mage.cards.n.NurturingLicid.class));
        cards.add(new SetCardInfo("Opportunist", 194, Rarity.UNCOMMON, mage.cards.o.Opportunist.class));
        cards.add(new SetCardInfo("Oracle en-Vec", 243, Rarity.RARE, mage.cards.o.OracleEnVec.class));
        cards.add(new SetCardInfo("Orim, Samite Healer", 244, Rarity.RARE, mage.cards.o.OrimSamiteHealer.class));
        cards.add(new SetCardInfo("Overrun", 137, Rarity.UNCOMMON, mage.cards.o.Overrun.class));
        cards.add(new SetCardInfo("Pacifism", 246, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Pallimud", 195, Rarity.RARE, mage.cards.p.Pallimud.class));
        cards.add(new SetCardInfo("Patchwork Gnomes", 289, Rarity.UNCOMMON, mage.cards.p.PatchworkGnomes.class));
        cards.add(new SetCardInfo("Pearl Medallion", 290, Rarity.RARE, mage.cards.p.PearlMedallion.class));
        cards.add(new SetCardInfo("Pegasus Refuge", 247, Rarity.RARE, mage.cards.p.PegasusRefuge.class));
        cards.add(new SetCardInfo("Perish", 41, Rarity.UNCOMMON, mage.cards.p.Perish.class));
        cards.add(new SetCardInfo("Phyrexian Grimoire", 291, Rarity.RARE, mage.cards.p.PhyrexianGrimoire.class));
        cards.add(new SetCardInfo("Phyrexian Hulk", 292, Rarity.UNCOMMON, mage.cards.p.PhyrexianHulk.class));
        cards.add(new SetCardInfo("Pincher Beetles", 138, Rarity.COMMON, mage.cards.p.PincherBeetles.class));
        cards.add(new SetCardInfo("Pine Barrens", 323, Rarity.RARE, mage.cards.p.PineBarrens.class));
        cards.add(new SetCardInfo("Pit Imp", 42, Rarity.COMMON, mage.cards.p.PitImp.class));
        cards.add(new SetCardInfo("Plains", 324, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 325, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 326, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 327, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Power Sink", 78, Rarity.COMMON, mage.cards.p.PowerSink.class));
        cards.add(new SetCardInfo("Precognition", 79, Rarity.RARE, mage.cards.p.Precognition.class));
        cards.add(new SetCardInfo("Propaganda", 80, Rarity.UNCOMMON, mage.cards.p.Propaganda.class));
        cards.add(new SetCardInfo("Puppet Strings", 294, Rarity.UNCOMMON, mage.cards.p.PuppetStrings.class));
        cards.add(new SetCardInfo("Quickening Licid", 248, Rarity.UNCOMMON, mage.cards.q.QuickeningLicid.class));
        cards.add(new SetCardInfo("Rain of Tears", 43, Rarity.UNCOMMON, mage.cards.r.RainOfTears.class));
        cards.add(new SetCardInfo("Rampant Growth", 139, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Ranger en-Vec", 343, Rarity.UNCOMMON, mage.cards.r.RangerEnVec.class));
        cards.add(new SetCardInfo("Rathi Dragon", 196, Rarity.RARE, mage.cards.r.RathiDragon.class));
        cards.add(new SetCardInfo("Rats of Rath", 44, Rarity.COMMON, mage.cards.r.RatsOfRath.class));
        cards.add(new SetCardInfo("Reality Anchor", 140, Rarity.COMMON, mage.cards.r.RealityAnchor.class));
        cards.add(new SetCardInfo("Reanimate", 45, Rarity.UNCOMMON, mage.cards.r.Reanimate.class));
        cards.add(new SetCardInfo("Reap", 141, Rarity.UNCOMMON, mage.cards.r.Reap.class));
        cards.add(new SetCardInfo("Reckless Spite", 46, Rarity.UNCOMMON, mage.cards.r.RecklessSpite.class));
        cards.add(new SetCardInfo("Recycle", 142, Rarity.RARE, mage.cards.r.Recycle.class));
        cards.add(new SetCardInfo("Reflecting Pool", 328, Rarity.RARE, mage.cards.r.ReflectingPool.class));
        cards.add(new SetCardInfo("Renegade Warlord", 197, Rarity.UNCOMMON, mage.cards.r.RenegadeWarlord.class));
        cards.add(new SetCardInfo("Repentance", 249, Rarity.UNCOMMON, mage.cards.r.Repentance.class));
        cards.add(new SetCardInfo("Respite", 143, Rarity.COMMON, mage.cards.r.Respite.class));
        cards.add(new SetCardInfo("Rolling Thunder", 198, Rarity.COMMON, mage.cards.r.RollingThunder.class));
        cards.add(new SetCardInfo("Rootbreaker Wurm", 145, Rarity.COMMON, mage.cards.r.RootbreakerWurm.class));
        cards.add(new SetCardInfo("Root Maze", 144, Rarity.RARE, mage.cards.r.RootMaze.class));
        cards.add(new SetCardInfo("Rootwalla", 146, Rarity.COMMON, mage.cards.r.Rootwalla.class));
        cards.add(new SetCardInfo("Rootwater Depths", 329, Rarity.UNCOMMON, mage.cards.r.RootwaterDepths.class));
        cards.add(new SetCardInfo("Rootwater Diver", 81, Rarity.UNCOMMON, mage.cards.r.RootwaterDiver.class));
        cards.add(new SetCardInfo("Rootwater Hunter", 82, Rarity.COMMON, mage.cards.r.RootwaterHunter.class));
        cards.add(new SetCardInfo("Rootwater Matriarch", 83, Rarity.RARE, mage.cards.r.RootwaterMatriarch.class));
        cards.add(new SetCardInfo("Rootwater Shaman", 84, Rarity.RARE, mage.cards.r.RootwaterShaman.class));
        cards.add(new SetCardInfo("Ruby Medallion", 295, Rarity.RARE, mage.cards.r.RubyMedallion.class));
        cards.add(new SetCardInfo("Sacred Guide", 250, Rarity.RARE, mage.cards.s.SacredGuide.class));
        cards.add(new SetCardInfo("Sadistic Glee", 47, Rarity.COMMON, mage.cards.s.SadisticGlee.class));
        cards.add(new SetCardInfo("Safeguard", 251, Rarity.RARE, mage.cards.s.Safeguard.class));
        cards.add(new SetCardInfo("Salt Flats", 330, Rarity.RARE, mage.cards.s.SaltFlats.class));
        cards.add(new SetCardInfo("Sandstone Warrior", 199, Rarity.COMMON, mage.cards.s.SandstoneWarrior.class));
        cards.add(new SetCardInfo("Sapphire Medallion", 296, Rarity.RARE, mage.cards.s.SapphireMedallion.class));
        cards.add(new SetCardInfo("Sarcomancy", 48, Rarity.RARE, mage.cards.s.Sarcomancy.class));
        cards.add(new SetCardInfo("Scabland", 331, Rarity.RARE, mage.cards.s.Scabland.class));
        cards.add(new SetCardInfo("Scalding Tongs", 297, Rarity.RARE, mage.cards.s.ScaldingTongs.class));
        cards.add(new SetCardInfo("Scorched Earth", 200, Rarity.RARE, mage.cards.s.ScorchedEarth.class));
        cards.add(new SetCardInfo("Scragnoth", 147, Rarity.UNCOMMON, mage.cards.s.Scragnoth.class));
        cards.add(new SetCardInfo("Screeching Harpy", 49, Rarity.UNCOMMON, mage.cards.s.ScreechingHarpy.class));
        cards.add(new SetCardInfo("Scroll Rack", 298, Rarity.RARE, mage.cards.s.ScrollRack.class));
        cards.add(new SetCardInfo("Sea Monster", 85, Rarity.COMMON, mage.cards.s.SeaMonster.class));
        cards.add(new SetCardInfo("Searing Touch", 201, Rarity.UNCOMMON, mage.cards.s.SearingTouch.class));
        cards.add(new SetCardInfo("Seeker of Skybreak", 148, Rarity.COMMON, mage.cards.s.SeekerOfSkybreak.class));
        cards.add(new SetCardInfo("Segmented Wurm", 344, Rarity.UNCOMMON, mage.cards.s.SegmentedWurm.class));
        cards.add(new SetCardInfo("Selenia, Dark Angel", 345, Rarity.RARE, mage.cards.s.SeleniaDarkAngel.class));
        cards.add(new SetCardInfo("Serene Offering", 252, Rarity.UNCOMMON, mage.cards.s.SereneOffering.class));
        cards.add(new SetCardInfo("Servant of Volrath", 50, Rarity.COMMON, mage.cards.s.ServantOfVolrath.class));
        cards.add(new SetCardInfo("Shadow Rift", 86, Rarity.COMMON, mage.cards.s.ShadowRift.class));
        cards.add(new SetCardInfo("Shadowstorm", 202, Rarity.UNCOMMON, mage.cards.s.Shadowstorm.class));
        cards.add(new SetCardInfo("Shatter", 203, Rarity.COMMON, mage.cards.s.Shatter.class));
        cards.add(new SetCardInfo("Shimmering Wings", 87, Rarity.COMMON, mage.cards.s.ShimmeringWings.class));
        cards.add(new SetCardInfo("Shocker", 204, Rarity.RARE, mage.cards.s.Shocker.class));
        cards.add(new SetCardInfo("Skyshroud Condor", 88, Rarity.UNCOMMON, mage.cards.s.SkyshroudCondor.class));
        cards.add(new SetCardInfo("Skyshroud Elf", 149, Rarity.COMMON, mage.cards.s.SkyshroudElf.class));
        cards.add(new SetCardInfo("Skyshroud Forest", 332, Rarity.RARE, mage.cards.s.SkyshroudForest.class));
        cards.add(new SetCardInfo("Skyshroud Ranger", 150, Rarity.COMMON, mage.cards.s.SkyshroudRanger.class));
        cards.add(new SetCardInfo("Skyshroud Troll", 151, Rarity.COMMON, mage.cards.s.SkyshroudTroll.class));
        cards.add(new SetCardInfo("Skyshroud Vampire", 51, Rarity.UNCOMMON, mage.cards.s.SkyshroudVampire.class));
        cards.add(new SetCardInfo("Sky Spirit", 346, Rarity.UNCOMMON, mage.cards.s.SkySpirit.class));
        cards.add(new SetCardInfo("Soltari Crusader", 253, Rarity.UNCOMMON, mage.cards.s.SoltariCrusader.class));
        cards.add(new SetCardInfo("Soltari Emissary", 254, Rarity.RARE, mage.cards.s.SoltariEmissary.class));
        cards.add(new SetCardInfo("Soltari Foot Soldier", 255, Rarity.COMMON, mage.cards.s.SoltariFootSoldier.class));
        cards.add(new SetCardInfo("Soltari Guerrillas", 347, Rarity.RARE, mage.cards.s.SoltariGuerrillas.class));
        cards.add(new SetCardInfo("Soltari Lancer", 256, Rarity.COMMON, mage.cards.s.SoltariLancer.class));
        cards.add(new SetCardInfo("Soltari Monk", 257, Rarity.UNCOMMON, mage.cards.s.SoltariMonk.class));
        cards.add(new SetCardInfo("Soltari Priest", 258, Rarity.UNCOMMON, mage.cards.s.SoltariPriest.class));
        cards.add(new SetCardInfo("Soltari Trooper", 259, Rarity.COMMON, mage.cards.s.SoltariTrooper.class));
        cards.add(new SetCardInfo("Souldrinker", 52, Rarity.UNCOMMON, mage.cards.s.Souldrinker.class));
        cards.add(new SetCardInfo("Spell Blast", 89, Rarity.COMMON, mage.cards.s.SpellBlast.class));
        cards.add(new SetCardInfo("Spike Drone", 152, Rarity.COMMON, mage.cards.s.SpikeDrone.class));
        cards.add(new SetCardInfo("Spinal Graft", 53, Rarity.COMMON, mage.cards.s.SpinalGraft.class));
        cards.add(new SetCardInfo("Spirit Mirror", 260, Rarity.RARE, mage.cards.s.SpiritMirror.class));
        cards.add(new SetCardInfo("Spontaneous Combustion", 348, Rarity.UNCOMMON, mage.cards.s.SpontaneousCombustion.class));
        cards.add(new SetCardInfo("Squee's Toy", 299, Rarity.COMMON, mage.cards.s.SqueesToy.class));
        cards.add(new SetCardInfo("Stalking Stones", 333, Rarity.UNCOMMON, mage.cards.s.StalkingStones.class));
        cards.add(new SetCardInfo("Starke of Rath", 205, Rarity.RARE, mage.cards.s.StarkeOfRath.class));
        cards.add(new SetCardInfo("Static Orb", 300, Rarity.RARE, mage.cards.s.StaticOrb.class));
        cards.add(new SetCardInfo("Staunch Defenders", 261, Rarity.UNCOMMON, mage.cards.s.StaunchDefenders.class));
        cards.add(new SetCardInfo("Steal Enchantment", 90, Rarity.UNCOMMON, mage.cards.s.StealEnchantment.class));
        cards.add(new SetCardInfo("Stinging Licid", 91, Rarity.UNCOMMON, mage.cards.s.StingingLicid.class));
        cards.add(new SetCardInfo("Stone Rain", 206, Rarity.COMMON, mage.cards.s.StoneRain.class));
        cards.add(new SetCardInfo("Storm Front", 153, Rarity.UNCOMMON, mage.cards.s.StormFront.class));
        cards.add(new SetCardInfo("Stun", 207, Rarity.COMMON, mage.cards.s.Stun.class));
        cards.add(new SetCardInfo("Sudden Impact", 208, Rarity.UNCOMMON, mage.cards.s.SuddenImpact.class));
        cards.add(new SetCardInfo("Swamp", 334, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 335, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 336, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 337, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tahngarth's Rage", 209, Rarity.UNCOMMON, mage.cards.t.TahngarthsRage.class));
        cards.add(new SetCardInfo("Talon Sliver", 262, Rarity.COMMON, mage.cards.t.TalonSliver.class));
        cards.add(new SetCardInfo("Telethopter", 301, Rarity.UNCOMMON, mage.cards.t.Telethopter.class));
        cards.add(new SetCardInfo("Thalakos Dreamsower", 92, Rarity.UNCOMMON, mage.cards.t.ThalakosDreamsower.class));
        cards.add(new SetCardInfo("Thalakos Lowlands", 338, Rarity.UNCOMMON, mage.cards.t.ThalakosLowlands.class));
        cards.add(new SetCardInfo("Thalakos Mistfolk", 93, Rarity.COMMON, mage.cards.t.ThalakosMistfolk.class));
        cards.add(new SetCardInfo("Thalakos Seer", 94, Rarity.COMMON, mage.cards.t.ThalakosSeer.class));
        cards.add(new SetCardInfo("Thalakos Sentry", 95, Rarity.COMMON, mage.cards.t.ThalakosSentry.class));
        cards.add(new SetCardInfo("Thumbscrews", 302, Rarity.RARE, mage.cards.t.Thumbscrews.class));
        cards.add(new SetCardInfo("Time Ebb", 96, Rarity.COMMON, mage.cards.t.TimeEbb.class));
        cards.add(new SetCardInfo("Time Warp", 97, Rarity.RARE, mage.cards.t.TimeWarp.class));
        cards.add(new SetCardInfo("Tooth and Claw", 210, Rarity.RARE, mage.cards.t.ToothAndClaw.class));
        cards.add(new SetCardInfo("Torture Chamber", 303, Rarity.RARE, mage.cards.t.TortureChamber.class));
        cards.add(new SetCardInfo("Tradewind Rider", 98, Rarity.RARE, mage.cards.t.TradewindRider.class));
        cards.add(new SetCardInfo("Trained Armodon", 154, Rarity.COMMON, mage.cards.t.TrainedArmodon.class));
        cards.add(new SetCardInfo("Tranquility", 155, Rarity.COMMON, mage.cards.t.Tranquility.class));
        cards.add(new SetCardInfo("Trumpeting Armodon", 156, Rarity.UNCOMMON, mage.cards.t.TrumpetingArmodon.class));
        cards.add(new SetCardInfo("Twitch", 99, Rarity.COMMON, mage.cards.t.Twitch.class));
        cards.add(new SetCardInfo("Unstable Shapeshifter", 100, Rarity.RARE, mage.cards.u.UnstableShapeshifter.class));
        cards.add(new SetCardInfo("Vec Townships", 339, Rarity.UNCOMMON, mage.cards.v.VecTownships.class));
        cards.add(new SetCardInfo("Verdant Force", 157, Rarity.RARE, mage.cards.v.VerdantForce.class));
        cards.add(new SetCardInfo("Verdigris", 158, Rarity.UNCOMMON, mage.cards.v.Verdigris.class));
        cards.add(new SetCardInfo("Vhati il-Dal", 349, Rarity.RARE, mage.cards.v.VhatiIlDal.class));
        cards.add(new SetCardInfo("Volrath's Curse", 101, Rarity.COMMON, mage.cards.v.VolrathsCurse.class));
        cards.add(new SetCardInfo("Wall of Diffusion", 211, Rarity.COMMON, mage.cards.w.WallOfDiffusion.class));
        cards.add(new SetCardInfo("Warmth", 263, Rarity.UNCOMMON, mage.cards.w.Warmth.class));
        cards.add(new SetCardInfo("Wasteland", 340, Rarity.UNCOMMON, mage.cards.w.Wasteland.class));
        cards.add(new SetCardInfo("Watchdog", 304, Rarity.UNCOMMON, mage.cards.w.Watchdog.class));
        cards.add(new SetCardInfo("Whispers of the Muse", 103, Rarity.UNCOMMON, mage.cards.w.WhispersOfTheMuse.class));
        cards.add(new SetCardInfo("Wild Wurm", 212, Rarity.UNCOMMON, mage.cards.w.WildWurm.class));
        cards.add(new SetCardInfo("Wind Dancer", 104, Rarity.UNCOMMON, mage.cards.w.WindDancer.class));
        cards.add(new SetCardInfo("Wind Drake", 105, Rarity.COMMON, mage.cards.w.WindDrake.class));
        cards.add(new SetCardInfo("Winds of Rath", 264, Rarity.RARE, mage.cards.w.WindsOfRath.class));
        cards.add(new SetCardInfo("Winged Sliver", 106, Rarity.COMMON, mage.cards.w.WingedSliver.class));
        cards.add(new SetCardInfo("Winter's Grasp", 159, Rarity.UNCOMMON, mage.cards.w.WintersGrasp.class));
        cards.add(new SetCardInfo("Wood Sage", 350, Rarity.RARE, mage.cards.w.WoodSage.class));
        cards.add(new SetCardInfo("Worthy Cause", 265, Rarity.UNCOMMON, mage.cards.w.WorthyCause.class));
    }
}
