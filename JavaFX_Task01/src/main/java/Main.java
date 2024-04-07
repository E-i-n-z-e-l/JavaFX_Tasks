import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Создание корневого контейнера BorderPane;
        BorderPane root = new BorderPane();

        // Создание метки Label с текстом "Hello";
        Label text = new Label("Hello");

        // Установка размера шрифта для метки с помощью класса Font;
        text.setFont(new Font(108));

        // Установка метки в центре корневого контейнера BorderPane;
        root.setCenter(text);

        // Создание сцены Scene с размерами 800x600 пикселей;
        Scene scene = new Scene(root, 800, 600);

        // Установка заголовка для окна Stage;
        stage.setTitle("Hello window");

        // Установка сцены в окно Stage;
        stage.setScene(scene);

        // Отображение окна Stage на экране;
        stage.show();
    }
}
