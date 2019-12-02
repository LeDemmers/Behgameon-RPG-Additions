package com.demmers.behgameon.util;

import com.demmers.behgameon.BehgameonMod;
import com.demmers.behgameon.items.BaublesRingItem;
import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Bracelet;
import com.robertx22.database.gearitemslots.Charm;
import com.robertx22.database.gearitemslots.Necklace;
import com.robertx22.database.gearitemslots.Ring;

public class MineSlashHandler {

	public MineSlashHandler() {

		//Runs accessory_1 to 3 and sets them as Bracelets in Mine and Slash.
		for (int i = 1; i <= 3; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Bracelet()));
		//Runs accessory_4 to 8 and sets them as Necklaces in Mine and Slash.
		for (int i = 4; i <= 8; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Necklace()));
		//Runs accessory_9 to 20 and sets them as Bracelets in Mine and Slash.
		for (int i = 9; i <= 20; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Bracelet()));
		//Runs accessory_22 to 32 and sets them as Necklaces in Mine and Slash.
		for (int i = 21; i <= 32; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Necklace()));
		//Runs accessory_33 to 48 and sets them as Charms in Mine and Slash.
		for (int i = 33; i <= 44; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Charm()));
		//Runs accessory_45 to 48 and sets them as Unique Charms in Mine and Slash.
		for (int i = 45; i <= 48; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Charm()).setAlwaysUnique());
		//Runs accessory_49 to 54 and sets them as Unique Necklace in Mine and Slash.
		for (int i = 49; i <= 54; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Necklace()).setAlwaysUnique());
		//Runs accessory_55 to 56 and sets them as Unique Charms in Mine and Slash.
		for (int i = 55; i <= 56; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Charm()).setAlwaysUnique());
		//Runs accessory_49 to 54 and sets them as Rings in Mine and Slash.
		for (int i = 1; i <= 106; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":ring_" + i, new ConfigItem().setType(new Ring()));
	}
}