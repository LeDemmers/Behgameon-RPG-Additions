package com.demmers.behgameon.util;

import java.util.ArrayList;
import java.util.List;

import com.demmers.behgameon.BehgameonMod;
import com.demmers.behgameon.config.Config;
import com.robertx22.mine_and_slash.config.compatible_items.OldConfigItem;
import com.robertx22.mine_and_slash.data_generation.compatible_items.CompatibleItem;
import com.robertx22.mine_and_slash.data_generation.compatible_items.CompatibleItemProvider;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Bracelet;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Charm;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Necklace;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Ring;
import com.robertx22.mine_and_slash.database.gearitemslots.offhand.Shield;
import com.robertx22.mine_and_slash.onevent.data_gen.providers.SlashDataProvider;

import net.minecraft.data.DataGenerator;

public class MineSlashHandler {

	public static String ID = "compatible_items";

	public MineSlashHandler() {
	}

	@SuppressWarnings("rawtypes")
	public SlashDataProvider getDataPackCreator(DataGenerator gen) {
		return new CompatibleItemProvider(gen, getList(), ID);
	}

	public static List<CompatibleItem> getList() {
		List<CompatibleItem> items = new ArrayList<>();
		try {
			for (int type = 1; type <= 3; type++)
				switch (type) {
				case 1:
					for (int braceletnumber = 1; braceletnumber <= 3; braceletnumber++) {
						OldConfigItem braceletconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Bracelet.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id = BehgameonMod.MODID + ":accessory_" + braceletnumber;

						CompatibleItem bracelet = braceletconfig.convertToNewFormat();
						bracelet.guid = id;
						bracelet.item_id = id;

						items.add(bracelet);
					}
				case 2:
					for (int necklacenumber = 4; necklacenumber <= 8; necklacenumber++) {
						OldConfigItem necklaceconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Necklace.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id2 = BehgameonMod.MODID + ":accessory_" + necklacenumber;
						;

						CompatibleItem necklace = necklaceconfig.convertToNewFormat();
						necklace.guid = id2;
						necklace.item_id = id2;

						items.add(necklace);
					}
				case 3:
					for (int braceletnumber = 9; braceletnumber <= 20; braceletnumber++) {
						OldConfigItem braceletconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Bracelet.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id3 = BehgameonMod.MODID + ":accessory_" + braceletnumber;
						;

						CompatibleItem bracelet = braceletconfig.convertToNewFormat();
						bracelet.guid = id3;
						bracelet.item_id = id3;

						items.add(bracelet);
					}
				case 4:
					for (int necklacenumber = 21; necklacenumber <= 32; necklacenumber++) {
						OldConfigItem necklaceconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Necklace.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id4 = BehgameonMod.MODID + ":accessory_" + necklacenumber;
						;

						CompatibleItem necklace = necklaceconfig.convertToNewFormat();
						necklace.guid = id4;
						necklace.item_id = id4;

						items.add(necklace);
					}
				case 5:
					for (int charmnumber = 33; charmnumber <= 44; charmnumber++) {
						OldConfigItem charmconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Charm.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id5 = BehgameonMod.MODID + ":accessory_" + charmnumber;
						;

						CompatibleItem charm = charmconfig.convertToNewFormat();
						charm.guid = id5;
						charm.item_id = id5;

						items.add(charm);
					}
				case 6:
					for (int charmnumber = 45; charmnumber <= 48; charmnumber++) {
						OldConfigItem charmconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Charm.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id6 = BehgameonMod.MODID + ":accessory_" + charmnumber;
						;

						CompatibleItem charm = charmconfig.convertToNewFormat();
						charm.guid = id6;
						charm.item_id = id6;

						items.add(charm);
					}
				case 7:
					for (int necklacenumber = 49; necklacenumber <= 54; necklacenumber++) {
						OldConfigItem necklaceconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Necklace.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id7 = BehgameonMod.MODID + ":accessory_" + necklacenumber;
						;

						CompatibleItem necklace = necklaceconfig.convertToNewFormat();
						necklace.guid = id7;
						necklace.item_id = id7;

						items.add(necklace);
					}
				case 8:
					for (int charmnumber = 55; charmnumber <= 56; charmnumber++) {
						OldConfigItem charmconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Charm.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id8 = BehgameonMod.MODID + ":accessory_" + charmnumber;
						;

						CompatibleItem charm = charmconfig.convertToNewFormat();
						charm.guid = id8;
						charm.item_id = id8;

						items.add(charm);
					}
				case 9:
					for (int ringnumber = 1; ringnumber <= 106; ringnumber++) {
						OldConfigItem ringconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Ring.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id9 = BehgameonMod.MODID + ":ring_" + ringnumber;
						;

						CompatibleItem ring = ringconfig.convertToNewFormat();
						ring.guid = id9;
						ring.item_id = id9;

						items.add(ring);
					}
				case 10:
					for (int shieldnumber = 1; shieldnumber <= 15; shieldnumber++) {
						OldConfigItem shieldconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Shield.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id10 = BehgameonMod.MODID + ":shield" + shieldnumber;
						;

						CompatibleItem shield = shieldconfig.convertToNewFormat();
						shield.guid = id10;
						shield.item_id = id10;

						items.add(shield);
					}
				}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return items;
	}
}