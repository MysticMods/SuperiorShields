package epicsquid.superiorshields.init;

import javax.annotation.Nonnull;

import epicsquid.mysticallib.event.RegisterContentEvent;
import epicsquid.superiorshields.SuperiorShields;
import epicsquid.superiorshields.config.ConfigManager;
import epicsquid.superiorshields.item.ItemAuraShield;
import epicsquid.superiorshields.item.ItemEnergyShield;
import epicsquid.superiorshields.item.ItemManaShield;
import epicsquid.superiorshields.item.ItemVanillaShield;
import epicsquid.superiorshields.shield.BotaniaShield;
import epicsquid.superiorshields.shield.EnderIOShield;
import epicsquid.superiorshields.shield.IFShield;
import epicsquid.superiorshields.shield.NaturesAuraShield;
import epicsquid.superiorshields.shield.ThermalShield;
import epicsquid.superiorshields.shield.VanillaShield;
import net.minecraftforge.fml.common.Loader;

public class ModItems {

  /**
   * Register all items
   */
  public static void registerItems(@Nonnull RegisterContentEvent event) {

    if (ConfigManager.vanilla.enableVanillaShields) {
      if (ConfigManager.vanilla.woodEnabled)
        event.addItem(new ItemVanillaShield("vanilla_shield_wood", VanillaShield.WOOD).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.vanilla.stoneEnabled)
        event.addItem(new ItemVanillaShield("vanilla_shield_stone", VanillaShield.STONE).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.vanilla.ironEnabled)
        event.addItem(new ItemVanillaShield("vanilla_shield_iron", VanillaShield.IRON).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.vanilla.goldEnabled)
        event.addItem(new ItemVanillaShield("vanilla_shield_gold", VanillaShield.GOLD).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.vanilla.diamondEnabled)
        event.addItem(new ItemVanillaShield("vanilla_shield_diamond", VanillaShield.DIAMOND).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.vanilla.obsidianEnabled)
        event.addItem(new ItemVanillaShield("vanilla_shield_obsidian", VanillaShield.OBSIDIAN).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.vanilla.emeraldEnabled)
        event.addItem(new ItemVanillaShield("vanilla_shield_emerald", VanillaShield.EMERALD).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.vanilla.endstoneEnabled)
        event.addItem(new ItemVanillaShield("vanilla_shield_endstone", VanillaShield.ENDSTONE).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
    }

    if (Loader.isModLoaded("thermalexpansion") && ConfigManager.thermal.enableThermalShields) {
      if (ConfigManager.thermal.basicEnabled)
        event.addItem(new ItemEnergyShield("thermal_shield_basic", ThermalShield.BASIC).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.thermal.hardenedEnabled)
        event.addItem(new ItemEnergyShield("thermal_shield_hardened", ThermalShield.HARDENED).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.thermal.reinforcedEnabled)
        event.addItem(new ItemEnergyShield("thermal_shield_reinforced", ThermalShield.REINFORCED).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.thermal.signalumEnabled)
        event.addItem(new ItemEnergyShield("thermal_shield_signalum", ThermalShield.SIGNALUM).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.thermal.enderiumEnabled)
        event.addItem(new ItemEnergyShield("thermal_shield_enderium", ThermalShield.ENDERIUM).setModelCustom(true).setCreativeTab(SuperiorShields.tab));

      if (ConfigManager.thermal.pyrotheumEnabled)
        event.addItem(new ItemEnergyShield("thermal_shield_pyrotheum", ThermalShield.PYROTHEUM).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.thermal.cryotheumEnabled)
        event.addItem(new ItemEnergyShield("thermal_shield_cryotheum", ThermalShield.CRYOTHEUM).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.thermal.aerotheumEnabled)
        event.addItem(new ItemEnergyShield("thermal_shield_aerotheum", ThermalShield.AEROTHEUM).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.thermal.petrotheumEnabled)
        event.addItem(new ItemEnergyShield("thermal_shield_petrotheum", ThermalShield.PETROTHEUM).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
    }

    if (Loader.isModLoaded("enderio") && ConfigManager.enderio.enableEnderIOShields) {
      if (ConfigManager.enderio.darkSteelConductiveIronEnabled)
        event.addItem(new ItemEnergyShield("enderio_ds_shield_conductive_iron", EnderIOShield.DS_CONDUCTIVE_IRON).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.enderio.endSteelConductiveIronEnabled)
        event.addItem(new ItemEnergyShield("enderio_es_shield_conductive_iron", EnderIOShield.ES_CONDUCTIVE_IRON).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.enderio.darkSteelEnergeticAlloyEnabled)
        event.addItem(new ItemEnergyShield("enderio_ds_shield_energetic_alloy", EnderIOShield.DS_ENERGETIC_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.enderio.endSteelEnergeticAlloyEnabled)
        event.addItem(new ItemEnergyShield("enderio_es_shield_energetic_alloy", EnderIOShield.ES_ENERGETIC_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.enderio.darkSteelVibrantAlloyEnabled)
        event.addItem(new ItemEnergyShield("enderio_ds_shield_vibrant_alloy", EnderIOShield.DS_VIBRANT_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.enderio.endSteelVibrantAlloyEnabled)
        event.addItem(new ItemEnergyShield("enderio_es_shield_vibrant_alloy", EnderIOShield.ES_VIBRANT_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      //      event.addItem(new ItemEnergyShield("enderio_ds_shield_pulsating_iron", EnderIOShield.DS_PULSATING_IRON).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      //      event.addItem(new ItemEnergyShield("enderio_es_shield_pulsating_iron", EnderIOShield.ES_PULSATING_IRON).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      //      event.addItem(new ItemEnergyShield("enderio_ds_shield_redstone_alloy", EnderIOShield.DS_REDSTONE_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      //      event.addItem(new ItemEnergyShield("enderio_es_shield_redstone_alloy", EnderIOShield.ES_REDSTONE_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.enderio.soulariumEnabled)
        event.addItem(new ItemEnergyShield("enderio_shield_soularium", EnderIOShield.SOULARIUM).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
    }

    if (Loader.isModLoaded("enderioendergy") && ConfigManager.endergy.enableEndergyShields) {
      if (ConfigManager.endergy.darkSteelEnergeticSilverEnabled)
        event.addItem(new ItemEnergyShield("endergy_ds_shield_energetic_silver", EnderIOShield.DS_ENERGETIC_SILVER).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.endergy.endSteelEnergeticSilverEnabled)
        event.addItem(new ItemEnergyShield("endergy_es_shield_energetic_silver", EnderIOShield.ES_ENERGETIC_SILVER).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.endergy.darkSteelVividAlloyEnabled)
        event.addItem(new ItemEnergyShield("endergy_ds_shield_vivid_alloy", EnderIOShield.DS_VIVID_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.endergy.endSteelVividAlloyEnabled)
        event.addItem(new ItemEnergyShield("endergy_es_shield_vivid_alloy", EnderIOShield.ES_VIVID_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.endergy.darkSteelCrystallineAlloyEnabled)
        event.addItem(new ItemEnergyShield("endergy_ds_shield_crystalline_alloy", EnderIOShield.DS_CRYSTALLINE_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.endergy.endSteelCrystallineAlloyEnabled)
        event.addItem(new ItemEnergyShield("endergy_es_shield_crystalline_alloy", EnderIOShield.ES_CRYSTALLINE_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.endergy.darkSteelMelodicAlloyEnabled)
        event.addItem(new ItemEnergyShield("endergy_ds_shield_melodic_alloy", EnderIOShield.DS_MELODIC_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.endergy.endSteelMelodicAlloyEnabled)
        event.addItem(new ItemEnergyShield("endergy_es_shield_melodic_alloy", EnderIOShield.ES_MELODIC_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.endergy.stellarAlloyEnabled)
        event.addItem(new ItemEnergyShield("endergy_shield_stellar_alloy", EnderIOShield.STELLAR_ALLOY).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
    }

    if (Loader.isModLoaded("naturesaura") && ConfigManager.naturesAura.enableNaturesAuraShields) {
      if (ConfigManager.naturesAura.infusedIronEnabled)
        event.addItem(new ItemAuraShield("natures_aura_shield_infused_iron", NaturesAuraShield.INFUSED_IRON).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.naturesAura.skyIngotEnabled)
        event.addItem(new ItemAuraShield("natures_aura_shield_sky_ingot", NaturesAuraShield.SKY_INGOT).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
    }

    if (Loader.isModLoaded("botania") && ConfigManager.botania.enableBotaniaShields) {
      if (ConfigManager.botania.manaSteelEnabled)
        event.addItem(new ItemManaShield("botania_shield_manasteel", BotaniaShield.MANA_STEEL).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.botania.terraSteelEnabled)
        event.addItem(new ItemManaShield("botania_shield_terrasteel", BotaniaShield.TERRA_STEEL).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.botania.elementiumEnabled)
        event.addItem(new ItemManaShield("botania_shield_elementium", BotaniaShield.ELEMENTIUM).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
    }

    if (Loader.isModLoaded("industrialforegoing") && ConfigManager.industrialForegoing.enableIndustrialForegoingShields) {
      if (ConfigManager.industrialForegoing.pinkSlimeEnabled)
        event.addItem(new ItemEnergyShield("if_pink_slime_shield", IFShield.PINK_SLIME).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
      if (ConfigManager.industrialForegoing.meatEnabled)
        event.addItem(new ItemEnergyShield("if_meat_shield", IFShield.MEAT).setModelCustom(true).setCreativeTab(SuperiorShields.tab));
    }
  }

  /**
   * Register item oredicts here
   */
  public static void registerOredict() {
  }
}
