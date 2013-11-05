package abstracts;

import interfaces.ITerran;
import concretes.TerranUnit;

public abstract class TerranTier2Factory extends TerranFactory {

	@Override
	public ITerran CreateTerran() {
		ITerran terran = new TerranUnit();
		terran.setTier(2);
		terran.setDescription("A tier 2 Terran unit.");
		return terran;
	}

}