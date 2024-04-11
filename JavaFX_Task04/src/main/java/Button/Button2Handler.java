package Button;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Button2Handler implements EventHandler<ActionEvent> {
    private Stage primaryStage;

    public Button2Handler(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void handle(ActionEvent event) {
        primaryStage.setOpacity(0);
        Stage newStage = new Stage(); // Создаем новое окно
        newStage.initOwner(primaryStage); // Устанавливаем основное окно владельцем нового окна
        newStage.initModality(Modality.WINDOW_MODAL); // Устанавливаем режим модального окна (новое окно будет блокировать основное окно до закрытия)

        // Создаем контент нового окна
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Button closeButton = new Button("Закрыть");
        closeButton.setOnAction(e -> {
            newStage.close();
            primaryStage.setOpacity(1);
            primaryStage.show(); // Показываем исходное окно после закрытия нового окна
        });

        gridPane.getChildren().addAll(closeButton);

        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(gridPane, primaryStage.getWidth(), primaryStage.getHeight());
        newStage.setScene(scene);
        newStage.setTitle("Новое окно");

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон

        newStage.show();
    }
}

