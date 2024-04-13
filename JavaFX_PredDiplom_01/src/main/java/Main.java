import buttons.mainMenu.buttonsMenu.ButtonHuman;
import buttons.mainMenu.buttonsMenu.ButtonSongs;
import buttons.mainMenu.buttonsMenu.ButtonSymbolism;
import buttons.mainMenu.buttonsMenu.ButtonsPhotos;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Энциклопедия Ангарска от А до Я");

        // Создание главного окна; ________________________________________________________________________________
        Group root = new Group();
        Scene scene = new Scene(root, 1280, 720, Color.BEIGE);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        // Добавляем иконку к главному окну;
        primaryStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icons/icon.png"))));

        // Создание кнопок;
        // Создание кнопки "Ангарчане";________________________________________________________________________________
        Button buttonHuman = ButtonHuman.buttonHuman();

        // Создание кнопки "Символика";
        Button buttonSymbolism = ButtonSymbolism.buttonSymbolism();

        // Создание кнопки "Ангарск в фотографиях";
        Button buttonPhotos = ButtonsPhotos.buttonPhotos();

        // Создание кнопки "Песни о городе";
        Button buttonSongs = ButtonSongs.buttonSongs();
        // _________________________________________________________________________________________________________


        root.getChildren().add(buttonPhotos);
        root.getChildren().add(buttonHuman);
        root.getChildren().add(buttonSymbolism);
        root.getChildren().add(buttonSongs);
    }
}

/*
- Ось X будет от 0 до 1280 по горизонтали.
- Ось Y будет от 0 до 720 по вертикали.
*/
