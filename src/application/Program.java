package application;

public class Program {

	public static void main(String[] args) {
		SUModel model = new SUModel();
		SUView view = new SUView(model);
		new SUController(view, model);
		
		view.setVisible(true);
	}
}