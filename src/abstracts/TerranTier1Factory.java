package abstracts;

import interfaces.ITerran;
import concretes.TerranUnit;

public abstract class TerranTier1Factory extends TerranFactory {

	@Override
	public ITerran CreateTerran() {
		ITerran terran = new TerranUnit();
		terran.setTier(1);
		terran.setDescription("A tier 1 Terran unit.");
		return terran;
	}

}