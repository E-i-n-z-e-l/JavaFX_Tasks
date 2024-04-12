package Button;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;
public class Button5Handler implements EventHandler<ActionEvent> {
    private Stage primaryStage;

    public Button5Handler(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void handle(ActionEvent event) {
        primaryStage.setOpacity(0);
        Stage newStage = new Stage();
        newStage.initOwner(primaryStage);
        newStage.initModality(Modality.WINDOW_MODAL);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Создание метки для текста
        Label titleLabel = new Label("Заголовок");
        Label descriptionLabel = new Label("Описание");
        // Создание изображения
        Image image = new Image("images/Angarsk.jpg");
        ImageView imageView = new ImageView(image);

        Button closeButton = new Button("Закрыть");
        closeButton.setOnAction(e -> {
            newStage.close();
            primaryStage.setOpacity(1);
            primaryStage.show();
        });

        newStage.setOnCloseRequest(e -> {
            primaryStage.setOpacity(1);
            primaryStage.show();
        });

        // Добавление элементов в GridPane с помощью метода add()
        gridPane.add(titleLabel, 0, 0); // разместить titleLabel в первом столбце, первой строке
        gridPane.add(descriptionLabel, 0, 1); // разместить descriptionLabel в первом столбце, второй строке
        gridPane.add(imageView, 1, 0, 1, 2); // разместить imageView во втором столбце, начиная с первой строки, на две строки
        gridPane.add(closeButton, 0, 2, 2, 1); // разместить closeButton в первом столбце, начиная с третьей строки, на одну строку

        Scene scene = new Scene(gridPane, primaryStage.getWidth(), primaryStage.getHeight());
        newStage.setScene(scene);
        newStage.setTitle("Новое окно");

        primaryStage.toFront();
        newStage.show();
    }
}
