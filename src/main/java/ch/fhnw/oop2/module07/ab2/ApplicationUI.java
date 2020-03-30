package ch.fhnw.oop2.module07.ab2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
	private Label label;
	private Slider slider;

	public ApplicationUI() {
		initializeControls();
		layoutControls();

	}

	private void initializeControls() {

		slider = new Slider(1,10,5);
		
		label = new Label(String.valueOf(slider.getValue()));

	}

	private void layoutControls() {
		this.setAlignment(Pos.CENTER);
		this.setSpacing(10);
		this.setPadding(new Insets(10));
		
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setSnapToTicks(true);;
		
		slider.valueProperty().addListener((obsVal,oldValue,newValue)->label.setText(String.valueOf(newValue)));
		

		this.getChildren().addAll(label, slider);

	}
}
