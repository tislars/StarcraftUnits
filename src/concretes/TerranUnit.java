package concretes;

import interfaces.ITerran;
import interfaces.Stimpack;

public class TerranUnit implements ITerran {

	Stimpack stim;
	
	private String _Name;
	private String _Description;
	private int _Health, _Damage, _Tier;

	@Override
	public void setName(String name) {
		_Name = name;
	}

	@Override
	public String getName() {
		return _Name;
	}

	@Override
	public void setHealth(int health) {
		_Health = health;
	}

	@Override
	public int getHealth() {
		return _Health;
	}

	@Override
	public void setDamage(int damage) {
		_Damage = damage;
	}

	@Override
	public int getDamage() {
		return _Damage;
	}

	@Override
	public void setTier(int tier) {
		_Tier = tier;
	}

	@Override
	public int getTier() {
		return _Tier;
	}

	@Override
	public void setDescription(String description) {
		_Description = description;
	}

	@Override
	public String getDescription() {
		return _Description;
	}
	
	@Override
	public String useStimpack() {
		return stim.useStimpack();
	}
	
	@Override
	public void setStimpack(Stimpack hasStimpack) {
		stim = hasStimpack;
	}
}
