import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Objects;


public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Создание корневого контейнера BorderPane;
        BorderPane root = new BorderPane();

        // Создание метки Label с текстом "Hello";
        Button button = new Button("Открыть окно");

        // Установка метки в центре корневого контейнера BorderPane;
        root.setCenter(button);

        // Установка действия на кнопку, которое вызывает метод newWindow;
        button.setOnAction(event -> {
            newWindow(stage);
        });

        // Установление иконки на окно;
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icons/iconOne.png"))));
        // Размер окна;
        Scene scene = new Scene(root, 800, 600);
        stage.setResizable(false); // Запрет на изменение размеров окна;
        // Установка сцены в окно Stage;
        stage.setScene(scene);

        // Отображение окна;
        stage.show();

    }

    public void newWindow(Stage parent) {
        Stage window = new Stage(); // Создание нового окна;
        window.setTitle("Новое окно"); // Указываем заголовок;

        // Создание корневого контейнера BorderPane;
        BorderPane pane = new BorderPane();

        // Создание кнопки Button с текстом "Скрыть или отобразить главное окно";
        Button btn = new Button("Скрыть или отобразить главное окно");

        // Установка кнопки в центре корневого контейнера BorderPane
        pane.setCenter(btn);

        // Установка действия на кнопку, которое скрывает или отображает главное окно приложения;
        btn.setOnAction(event -> {
            if (parent.isShowing()) parent.hide();   // Если главное окно отображено, то скрыть его;
            else parent.show();                     // Если главное окно скрыто, то отобразить его;
        });

        window.setScene(new Scene(pane, 400, 150));
        window.setResizable(false);
        window.show(); // Отображаем окно;
    }
}
