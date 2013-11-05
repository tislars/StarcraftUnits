package concretes;

import interfaces.Stimpack;

public class NoStimpack implements Stimpack {

	@Override
	public String useStimpack() {
		return "I currently do not have a stimpack.";
	}
}
