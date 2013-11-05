package abstracts;

import interfaces.ITerran;
import interfaces.ITerranFactory;

public abstract class TerranFactory implements ITerranFactory {

	@Override
	public abstract ITerran CreateTerran();

}
