import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) {
        // Создание корневого контейнера StackPane
        StackPane root = new StackPane();
        root.setPrefWidth(1024); // Устанавливаем размеры этого контейнера;
        root.setPrefHeight(720);

        // Создание кнопки Button с текстом "Нажми меня"
        Button button = new Button("Нажми меня");
        button.setPrefWidth(600); // Устанавливаем размеры кнопки;
        button.setPrefWidth(400);


        root.getChildren().add(button); // Добавление кнопки в корневой контейнер

        root.setBackground(Background.EMPTY); // Устанавливаем прозрачный фон чтобы после придать цвет контейнеру;

        // Создание экземпляра класса Scene с указанием корневого контейнера и размеров
        Scene scene = new Scene(root, 1024, 720);
        // Установка цвета фона сцены
        scene.setFill(Color.rgb(255, 129, 129, 0.5));
        // Установка сцены в окно Stage
        stage.setScene(scene);

        // Установка заголовка окна
        stage.setTitle("Пример Scene");

        // Отображение окна
        stage.show();
    }
}
