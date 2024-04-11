package Button;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import tabs.NewTab;

public class Button4Handler implements EventHandler<ActionEvent> {
    private Stage primaryStage;

    public Button4Handler(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void handle(ActionEvent event) {
        primaryStage.setOpacity(0);
        Stage newStage = new Stage(); // Создаем новое окно
        newStage.initOwner(primaryStage); // Устанавливаем основное окно владельцем нового окна
        newStage.initModality(Modality.WINDOW_MODAL); // Устанавливаем режим модального окна (новое окно будет блокировать основное окно до закрытия)

        // Создаем контент нового окна
        BorderPane pane = new BorderPane();

        Button closeButton = new Button("Закрыть");
        closeButton.setOnAction(e -> {
            newStage.close();
            primaryStage.setOpacity(1);
            primaryStage.show(); // Показываем исходное окно после закрытия нового окна
        });

        Label label = new Label("Флаг Ангарского городского округа");

        ImageView imageView = new ImageView(new Image("Images/flag.png"));
        imageView.setFitWidth(600); // Ширина картинки равна 200 пикселей
        imageView.setFitHeight(400); // Высота картинки равна 200 пикселей

        pane.setBottom(closeButton);
        pane.setTop(label);
        pane.setCenter(imageView);

        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(pane, primaryStage.getWidth(), primaryStage.getHeight());
        newStage.setScene(scene);
        newStage.setTitle("Новое окно");

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон

        newStage.show();
    }
}
