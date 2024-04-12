import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import Button.Button1Handler;
import java.util.Objects;
import Button.Button2Handler;
import Button.Button3Handler;
import Button.Button4Handler;
import Button.Button5Handler;
import tabs.NewTab;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        GridPane root = new GridPane(); // Создаем контейнер;
        root.setPadding(new Insets(60, 50, 60, 50)); // Установка внутренних отступов
        root.setHgap(100);
        // root.setVgap(40); Вертикальное расстояние;
        root.getStyleClass().add("container");


        Button button1 = new Button("Кнопка 1"); // Редактируем кнопки;
        NewTab newTab = new NewTab();
        TabPane tabPane = new TabPane(); // Создаем TabPane
        Button1Handler button1Handler = new Button1Handler(tabPane, newTab);
        button1.setOnAction(button1Handler);
        button1.setPrefWidth(250);
        button1.setPrefHeight(50);

        Button2Handler button2Handler = new Button2Handler(stage);
        Button button2 = new Button("Кнопка 2");
        button2.setOnAction(button2Handler);
        button2.setPrefWidth(250);
        button2.setPrefHeight(50);

        Button3Handler button3Handler = new Button3Handler(stage);
        Button button3 = new Button("Кнопка 3");
        button3.setOnAction(button3Handler);
        button3.setPrefWidth(250);
        button3.setPrefHeight(50);

        Button4Handler button4Handler = new Button4Handler(stage);
        Button button4 = new Button("Кнопка 4");
        button4.setOnAction(button4Handler);
        button4.setPrefWidth(250);
        button4.setPrefHeight(50);

        Button5Handler button5Handler = new Button5Handler(stage);
        Button button5 = new Button("Кнопка 5");
        button5.setOnAction(button5Handler);
        button5.setPrefWidth(250);
        button5.setPrefHeight(50);


        Button button6 = new Button("Кнопка 6");
        button6.setPrefWidth(250);
        button6.setPrefHeight(50);

        root.add(button1, 0, 0);
        root.add(button2, 1, 0);
        root.add(button3, 2, 0);
        root.add(button4, 3, 0);
        root.add(button5, 4, 0);
        root.add(tabPane, 0, 1);
        root.add(button6, 4, 1);

        Scene scene = new Scene(root, 1300, 850);
        scene.getStylesheets().add(getClass().getResource("css/styles.css").toExternalForm());


        stage.setScene(scene);
        stage.setTitle("Пример Scene");
        stage.setResizable(false); // Запрет на изменение размеров окна;
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

1. GridPane: Используется для размещения элементов в виде сетки с ячейками.

2. HBox: Используется для размещения элементов горизонтально, один за другим.

3. VBox: Используется для размещения элементов вертикально, один под другим.

4. BorderPane: Используется для размещения элементов на краях (верх, низ, лево, право) и в центре.

5. StackPane: Используется для размещения элементов один над другим (в стеке).

6. AnchorPane: Используется для указания расположения элементов относительно границ родительского контейнера или других элементов.

7. FlowPane: Используется для размещения элементов по порядку, автоматически перенося их на новую строку при необходимости.

8. TilePane: Используется для размещения элементов в виде плитки, автоматически заполняя ими доступное пространство.

9. ScrollPane: Используется для размещения содержимого, которое превышает размеры окна, и добавляет полосы прокрутки
* для доступа к скрытой информации.

 * */

