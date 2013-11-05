package application;

import interfaces.ITerran;
import interfaces.ITerranFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import concretes.TerranGhostFactory;

public class GhostListener implements ActionListener {

	SUController _Controller;
	
	int supplyValue = 2;
	int currentSupply;
	
	public GhostListener(SUController controller) {
		this._Controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ProduceUnit(new TerranGhostFactory());

		_Controller.UpdateSupplyValue(supplyValue);
	}

	private ITerran ProduceUnit(ITerranFactory factory) {
		ITerran terran = factory.CreateTerran();

		System.out.println("Producing a " + terran.getName() + ", tier "
				+ terran.getTier() + " unit.");
		System.out.println("Build time is 3 seconds..");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(terran.getDescription());

		System.out.println("-------------------");

		return terran;
	}
}