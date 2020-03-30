package ch.fhnw.oop2.module07.ab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox {
	private TextField text;
	private Slider slider;

	public ApplicationUI() {
		initializeControls();
		layoutControls();

	}

	private void initializeControls() {

		slider = new Slider(1, 10, 5);

		text = new TextField(String.valueOf(slider.getValue()));

	}

	private void layoutControls() {
		this.setAlignment(Pos.CENTER);
		this.setSpacing(10);
		this.setPadding(new Insets(10));

		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setSnapToTicks(true);
		text.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());


		this.getChildren().addAll(text, slider);

	}
}
