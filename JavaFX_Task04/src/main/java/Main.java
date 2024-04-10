import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        HBox root = new HBox(); // Создаем контейнер;
        root.setPadding(new Insets(60, 50, 60, 50)); // Установка внутренних отступов
        root.setSpacing(70); // Указываем расстояние между кнопками;
        root.getStyleClass().add("container");

        Button button1 = new Button("Кнопка 1"); // Редактируем кнопки;
        button1.setPrefWidth(200);
        button1.setPrefHeight(100);

        Button button2 = new Button("Кнопка 2");
        button2.setPrefWidth(200);
        button2.setPrefHeight(100);

        Button button3 = new Button("Кнопка 3");
        button3.setPrefWidth(200);
        button3.setPrefHeight(100);

        Button button4 = new Button("Кнопка 4");
        button4.setPrefWidth(200);
        button4.setPrefHeight(100);

        Button button5 = new Button("Кнопка 5");
        button5.setPrefWidth(200);
        button5.setPrefHeight(100);

        root.getChildren().addAll(button1, button2, button3, button4, button5);

        Scene scene = new Scene(root, 1400, 900);
        scene.getStylesheets().add(getClass().getResource("css/styles.css").toExternalForm());


        stage.setScene(scene);
        stage.setTitle("Пример Scene");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

/*
**HBox**:
HBox (горизонтальный контейнер) располагает дочерние элементы горизонтально, в порядке их добавления.
* Элементы будут размещены в одной строке, пока есть достаточно места. Если дочерние элементы не помещаются
* в одной строке, они будут автоматически перенесены на новую строку. В HBox все элементы имеют одинаковую высоту,
* которая равна высоте самого высокого элемента в контейнере. Ширина каждого элемента в HBox зависит от его размера
* и ширины контейнера.

**VBox**:
VBox (вертикальный контейнер) располагает дочерние элементы вертикально, в порядке их добавления. Элементы будут
* размещены один под другим, занимая всю доступную вертикальную область. В VBox все элементы имеют одинаковую ширину,
* которая равна ширине самого широкого элемента в контейнере. Высота каждого элемента в VBox зависит от его размера
* и высоты контейнера.
 */

