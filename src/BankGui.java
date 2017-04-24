/**
 * BankGui
 * @author: Lance Pereira
 * @course: ICS4U1
 * @date: Apr 23, 2017
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BankGui extends Application {

	Stage window;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Lance Random Project");

		/*
		 * HBox topMenu = new HBox(); Button buttonA = new Button("File");
		 * Button buttonB = new Button("Edit"); Button buttonC = new
		 * Button("Source"); topMenu.getChildren().addAll(buttonA, buttonB,
		 * buttonC);
		 */

		Label label = new Label("This is the tittle of the Bank");

		VBox sideMenu = new VBox();
		// Spaces at ends of button prompts so they are all evennly sized
		Button newUserButton = new Button("Add member  ");
		Button monthlyRoutineButton = new Button("Monthly tasks");
		Button statsButton = new Button("Stats        ");
		sideMenu.getChildren().addAll(newUserButton, monthlyRoutineButton,
				statsButton);

		BorderPane borderPane = new BorderPane();

		borderPane.setTop(label);
		borderPane.setLeft(sideMenu);

		newUserButton.setOnAction(e -> {
			System.out.println("Hello");
		});

		StackPane layout = new StackPane();
		layout.getChildren().add(borderPane);
		Scene scene = new Scene(layout, 300, 250);

		window.setScene(scene);
		window.show();
	}

}