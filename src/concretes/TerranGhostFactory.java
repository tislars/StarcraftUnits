package concretes;

import interfaces.ITerran;
import abstracts.TerranTier2Factory;

public class TerranGhostFactory extends TerranTier2Factory {
	
	@Override
	public ITerran CreateTerran(){
		ITerran terran = super.CreateTerran();
		terran.setName("Ghost");
		terran.setDamage(10);
		terran.setHealth(100);
		terran.setDescription("Ghost reporting.");
		return terran;
	}

}
