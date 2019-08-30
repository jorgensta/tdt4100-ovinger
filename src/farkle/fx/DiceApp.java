package farkle.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DiceApp extends Application {

	@Override
	public void start(final Stage primaryStage) throws Exception {
		final Parent root = FXMLLoader.load(getClass().getResource("Dice.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	public static void main(final String[] args) {
		launch(args);
	}
}
