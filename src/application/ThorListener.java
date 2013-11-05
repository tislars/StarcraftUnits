package application;

import interfaces.ITerran;
import interfaces.ITerranFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import concretes.TerranThorFactory;

public class ThorListener implements ActionListener {

	SUController controller;

	int supplyValue = 6;
	int currentSupply;

	public ThorListener(SUController controller) {
		this.controller = controller;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ProduceUnit(new TerranThorFactory());

		controller.UpdateSupplyValue(supplyValue);
	}

	private ITerran ProduceUnit(ITerranFactory factory) {
		ITerran terran = factory.CreateTerran();

		System.out.println("Producing a " + terran.getName() + ", tier "
				+ terran.getTier() + " unit.");
		System.out.println("Build time is 5 seconds..");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(terran.getDescription());

		System.out.println("-------------------");

		return terran;
	}
}