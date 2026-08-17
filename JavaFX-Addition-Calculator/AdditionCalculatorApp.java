package calculator;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.*;
import javafx.stage.*;

public class AdditionCalculatorApp
        extends Application
{
    private Button addButton, exitButton;
    private TextField num1Field, num2Field, resultField;

    private double calculateSum(double num1, double num2)
    {
        return num1 + num2;
    }

    private double parseInput(String text)
    {
        return Double.parseDouble(text);
    }

    private String formatResult(double value)
    {
        if (value % 1 == 0)
            return String.valueOf((int) value);

        return String.valueOf(value);
    }

    private void showErrorAlert(String message)
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void handleAdd()
    {
        try {
            double num1 = parseInput(num1Field.getText().trim());
            double num2 = parseInput(num2Field.getText().trim());

            resultField.setText(formatResult(calculateSum(num1, num2)));
        }
        catch (NumberFormatException e) {
            showErrorAlert("Please enter a valid number.");
        }
    }

    private void handleExit()
    {
        Platform.exit();
    }

    private void setupEvents()
    {
        addButton.setOnAction(e -> handleAdd());
        exitButton.setOnAction(e -> handleExit());

        num1Field.setOnAction(e -> {
            num2Field.requestFocus();
            resultField.clear();
        });
    }

    private void configureControls()
    {
        num1Field = new TextField();
        num1Field.setPrefWidth(180);

        num2Field = new TextField();
        num2Field.setPrefWidth(180);

        resultField = new TextField();
        resultField.setFocusTraversable(false);
        resultField.setEditable(false);
        resultField.setCursor(Cursor.DEFAULT);


        addButton = new Button("Add");
        addButton.setPrefWidth(90);
        addButton.setDefaultButton(true);

        exitButton = new Button("Exit");
        exitButton.setPrefWidth(90);

        setupEvents();
    }

    private GridPane createMainLayout()
    {
        GridPane grid = new GridPane(10, 10);
        grid.setPadding(new Insets(20));
        grid.setAlignment(Pos.CENTER);

        Label headerLabel = new Label("Addition Calculator");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 24));
        GridPane.setMargin(headerLabel, new Insets(0, 0, 15, 0));
        grid.add(headerLabel, 0, 0, 2, 1);

        grid.add(new Label("Number 1"), 0, 1);
        grid.add(num1Field, 1, 1);

        grid.add(new Label("Number 2"), 0, 2);
        grid.add(num2Field, 1, 2);

        Label resultLabel = new Label("Result");
        GridPane.setHalignment(resultLabel, HPos.RIGHT);
        grid.add(resultLabel, 0, 3);
        grid.add(resultField, 1, 3);

        HBox buttonBox = new HBox(10, addButton, exitButton);
        GridPane.setHalignment(buttonBox, HPos.RIGHT);
        GridPane.setMargin(buttonBox, new Insets(15, 0, 0, 0));
        grid.add(buttonBox, 1, 4);

        return grid;
    }

    @Override
    public void start(Stage stage)
    {
        configureControls();

        stage.setScene(new Scene(createMainLayout(), 400, 400));
        stage.setTitle("Add Two Numbers");
        stage.setResizable(false);
        stage.show();
    }
}
