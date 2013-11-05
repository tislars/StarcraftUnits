package application;

public class SUController {

	private SUView _View;
	private SUModel _Model;

	public SUController(SUView view, SUModel model) {
		this._View = view;
		this._Model = model;

		_View.produceMarineListener(new MarineListener(this));
		_View.produceGhostListener(new GhostListener(this));
		_View.produceThorListener(new ThorListener(this));
	}

	public void UpdateSupplyValue(int unitValue) {
		int _currentSupply = _View.getTotalSupply();
		int _unitValue = unitValue;

		_Model.updateSupply(_currentSupply, _unitValue);
		_View.setTotalSupply(_Model.getTotalSupply());
	}
}