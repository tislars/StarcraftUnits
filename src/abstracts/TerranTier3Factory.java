package abstracts;

import interfaces.ITerran;
import concretes.TerranUnit;

public abstract class TerranTier3Factory extends TerranFactory {

	@Override
	public ITerran CreateTerran() {
		ITerran terran = new TerranUnit();
		terran.setTier(3);
		terran.setDescription("A tier 3 Terran unit.");
		return terran;
	}

}