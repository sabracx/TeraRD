package tera.gameserver.model.npc.interaction.conditions;

import tera.gameserver.model.npc.Npc;
import tera.gameserver.model.playable.Player;
import tera.gameserver.model.quests.Quest;

/**
 * Проверка на минимальный уровень игрока.
 * 
 * @author Ronn Mod Evestu
 */
public class ConditionPlayerMinLevel extends AbstractCondition
{
	/** с какого уровня */
	private int level;
	
	public ConditionPlayerMinLevel(Quest quest, int level)
	{
		super(quest);

		this.level = level;
	}

	@Override
	public boolean test(Npc npc, Player player)
	{
		if(player == null)
			return false;
		
		return player.getLevel() >= level;
	}

	@Override
	public String toString()
	{
		return "ConditionPlayerMinLevel level = " + level;
	}
}
