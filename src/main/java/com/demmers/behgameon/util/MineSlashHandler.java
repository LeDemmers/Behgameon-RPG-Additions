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

		for (int i = 1; i <= 3; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Bracelet()));
		for (int i = 4; i <= 8; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Necklace()));
		for (int i = 9; i <= 20; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Bracelet()));
		for (int i = 21; i <= 32; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Necklace()));
		for (int i = 33; i <= 48; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Charm()));
		for (int i = 49; i <= 54; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Necklace()));
		for (int i = 55; i <= 56; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":accessory_" + i,
					new ConfigItem().setType(new Charm()));
		for (int i = 1; i <= 106; i++)
			MineAndSlashAPI.addCompatibleItem(BehgameonMod.MODID + ":ring_" + i, new ConfigItem().setType(new Ring()));
	}
}