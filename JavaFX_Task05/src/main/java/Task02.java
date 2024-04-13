import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.paint.Color;

import java.util.Objects;

public class Task02 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Тестирование GUI-компонентов");

        Group root = new Group();
        Scene scene = new Scene(root, 300, 300, Color.BEIGE);
        primaryStage.setScene(scene);
        primaryStage.show();

        ObservableList<String> country = FXCollections.observableArrayList("Ангарск", "Иркутск", "Братск");
        ChoiceBox<String> choice = new ChoiceBox<String>(country);

        choice.setLayoutX(10);
        choice.setLayoutY(10);
        choice.setBlendMode(BlendMode.HARD_LIGHT);
        choice.setCursor(Cursor.CLOSED_HAND);

        DropShadow effect = new DropShadow();
        effect.setOffsetX(8);
        effect.setOffsetY(8);
        choice.setEffect(effect);

        choice.setStyle("-fx-text-fill: #000000; " +
                "-fx-border-width: 5pt; " +
                "-fx-border-color: #d2691e; " +
                "-fx-font: bold italic 14pt Georgia;");

        choice.setPrefSize(200, 50);
        choice.setTooltip(new Tooltip("Выберите город"));
        choice.getSelectionModel().selectFirst();

        Image imR=new Image(Objects.requireNonNull(this.getClass().getResource("Angarsk.jpg")).toString());
        ImageView imvR;
        imvR=new ImageView(imR);
        imvR.setPreserveRatio(true);
        imvR.setFitHeight(200);
        imvR.setFitWidth(200);
        imvR.setLayoutX(10);
        imvR.setLayoutY(100);

        Image imU=new Image(Objects.requireNonNull(this.getClass().getResource("Irkutsk.jpg")).toString());
        ImageView imvU;
        imvU=new ImageView(imU);
        imvU.setPreserveRatio(true);
        imvU.setFitHeight(200);
        imvU.setFitWidth(200);
        imvU.setLayoutX(10);
        imvU.setLayoutY(100);
        imvU.setVisible(false);

        Image imG=new Image(Objects.requireNonNull(this.getClass().getResource("Bratsk.jpg")).toString());
        ImageView imvG;
        imvG=new ImageView(imG);
        imvG.setPreserveRatio(true);
        imvG.setFitHeight(200);
        imvG.setFitWidth(200);
        imvG.setLayoutX(10);
        imvG.setLayoutY(100);
        imvG.setVisible(false);


        choice.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov, String old_val, String
                    new_val) {
                if (new_val.equals("Ангарск")) {
                    imvR.setVisible(true);
                    imvU.setVisible(false);
                    imvG.setVisible(false);
                }
                if (new_val.equals("Иркутск")) {
                    imvU.setVisible(true);
                    imvR.setVisible(false);
                    imvG.setVisible(false);
                }
                if (new_val.equals("Братск")) {
                    imvG.setVisible(true);
                    imvR.setVisible(false);
                    imvU.setVisible(false);
                }
            }
        });

        root.getChildren().add(choice);
        root.getChildren().add(imvR);
        root.getChildren().add(imvU);
        root.getChildren().add(imvG);
    }
}
