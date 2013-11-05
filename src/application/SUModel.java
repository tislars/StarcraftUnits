package application;

public class SUModel {

	private int totalSupply;

	// Calculation to add the specified unit supply value to the current supply value
	public void updateSupply(int currentSupply, int supplyValue) {
		totalSupply = currentSupply + supplyValue;
	}

	public int getTotalSupply() {
		return totalSupply;
	}
}
