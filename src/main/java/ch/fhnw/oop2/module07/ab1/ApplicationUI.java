package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ApplicationUI extends GridPane {
	private int number=1;
	private Button button;
	private int maxCols=6;
	private int currCol=1;
	private int currRow=0;

	public ApplicationUI() {
		initializeControls();
		layoutControls();

	}

	private void initializeControls() {
		this.setPadding(new Insets(10));
		button = new Button("Add Label");
		button.setOnAction(event->addLabel());
	}

	private void layoutControls() {
		this.add(button, 0, 0);
	}
	public void addLabel(){
		Label label=new Label("Label "+number++);
		label.setPadding(new Insets(0,0,0,10));
		if(currCol==maxCols) {
			currRow++;
			currCol=0;
		}
		this.add(label, currCol++, currRow);
	}
}
