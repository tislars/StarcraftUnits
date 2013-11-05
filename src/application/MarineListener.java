package application;

import interfaces.ITerran;
import interfaces.ITerranFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import concretes.TerranMarineFactory;

public class MarineListener implements ActionListener {

	SUController _Controller;

	int supplyValue = 1;
	int currentSupply;

	public MarineListener(SUController controller) {
		this._Controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ProduceUnit(new TerranMarineFactory());

		_Controller.UpdateSupplyValue(supplyValue);
	}

	private ITerran ProduceUnit(ITerranFactory factory) {
		ITerran terran = factory.CreateTerran();

		System.out.println("Producing a " + terran.getName() + ", tier "
				+ terran.getTier() + " unit.");
		System.out.println("Build time is 2 seconds..");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(terran.getDescription());
		System.out.println(terran.useStimpack());

		System.out.println("-------------------");

		return terran;
	}
}