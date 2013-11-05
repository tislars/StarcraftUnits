package concretes;

import interfaces.Stimpack;

public class HasStimpack implements Stimpack {

	@Override
	public String useStimpack() {
		return "Using my stimpack!";
	}
}
