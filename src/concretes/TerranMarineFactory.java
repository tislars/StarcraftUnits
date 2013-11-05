package concretes;

import interfaces.ITerran;
import abstracts.TerranTier1Factory;

public class TerranMarineFactory extends TerranTier1Factory {
	
	@Override
	public ITerran CreateTerran() {
		ITerran terran = super.CreateTerran();
		terran.setName("Marine");
		terran.setDamage(6);
		terran.setHealth(45);
		terran.setDescription("You want a piece of me, boy?");
		terran.setStimpack(new HasStimpack());
		return terran;
	}

}
