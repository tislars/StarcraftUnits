package concretes;

import interfaces.ITerran;
import abstracts.TerranTier3Factory;

public class TerranThorFactory extends TerranTier3Factory {
	
	@Override
	public ITerran CreateTerran(){
		ITerran terran = super.CreateTerran();
		terran.setName("Thor");
		terran.setDamage(30);
		terran.setHealth(400);
		terran.setDescription("Thor is here.");
		return terran;
	}

}