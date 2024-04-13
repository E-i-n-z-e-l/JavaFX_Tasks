import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Создание и редактирование кнопок.
 */
public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Тестирование GUI-компонентов");

        Group root = new Group();
        Scene scene = new Scene(root, 300, 300, Color.LIGHTGREEN);

        Button btn = new Button();
        btn.setLayoutX(20);
        btn.setLayoutY(20);
        btn.setText("Тестировать свойства");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Свойства, унаследованные от класса Node:" + "\n" +
                        "Свойство blendMode: " + btn.blendModeProperty().getValue() + "\n" +
                        "Свойство boundsInLocal: " + btn.boundsInLocalProperty().getValue() + "\n");
            }
        });

        Button btnON = new Button();
        btnON.setLayoutX(20); // Установка координат кнопки по осям x и y;
        btnON.setLayoutY(150);
        btnON.setText("Установить свойства"); // Установка текста кнопки;
        btnON.setStyle("* {-fx-font: bold italic 12pt Arial; " + // задает шрифт текста кнопки;
                "-fx-text-fill: #660000; " + // устанавливает цвет текста кнопки как темно-красный (#660000);
                "-fx-background-color: #ff99ff; " + // устанавливает цвет фона кнопки как светло-розовый (#ff99ff);
                "-fx-border-width: 3px; " + // устанавливает ширину границы кнопки как 3 пикселя;
                "-fx-background-radius: 30; " + // устанавливает радиус скругления углов фона кнопки как 30 пикселей;
                "-fx-border-color: #660066; }"); // устанавливает цвет границы кнопки как темно-фиолетовый (#660066);


        btnON.setPrefSize(200,30); // устанавливает предпочитаемый размер кнопки;
        btnON.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) { // Устанавливает обработчик событий для кнопки btnON.
                                                    // При нажатии на кнопку btnON выполняется код внутри метода handle();

                /* Устанавливает режим смешивания BlendMode для кнопки btn как DARKEN. Это изменяет способ
                отображения элементов, когда они перекрывают друг друга. */
                btn.setBlendMode(BlendMode.DARKEN);

                /* Создает новый объект Circle из пакета javafx.scene.shape с центром в координатах (75, 53) и
                радиусом 80 пикселей. */
                javafx.scene.shape.Circle clip=new javafx.scene.shape.Circle(75,53,80);

                /* Устанавливает курсор мыши для кнопки btn как CLOSED_HAND. Это изменяет внешний вид курсора
                при наведении на кнопку. */
                btn.setCursor(Cursor.CLOSED_HAND);

                /* Создает новый объект DropShadow из пакета javafx.scene.effect. Этот эффект добавляет тень к кнопке. */
                DropShadow effect=new DropShadow();

                effect.setOffsetX(10); // Задает горизонтальное смещение для тени равное 10 пикселям;
                effect.setOffsetY(10); // Задает вертикальное смещение для тени равное 10 пикселям;
                btn.setEffect(effect); // Устанавливает эффект DropShadow на кнопку btn, добавляя тень;

                btn.setOpacity(0.5); // Устанавливает прозрачность кнопки btn как 0.5;
                btn.setRotate(10); // Поворачивает кнопку btn на 10 градусов по часовой стрелке;
                btn.setLayoutX(80); // Задает горизонтальное расположение кнопки btn на сцене в координате X равной 80;
                btn.setScaleX(1.8); // Масштабирует кнопку btn по горизонтали в 1.8 раза;
                btn.setLayoutY(170); // Задает вертикальное расположение кнопки btn на сцене в координате Y равной 170;
                btn.setTranslateZ(-50); // Перемещает кнопку btn по оси Z на -50 пикселей, изменяя ее глубину;
                btn.setPrefSize(150,100); // Устанавливает предпочтительный размер кнопки btn равным 150 пикселей по ширине и 100 пикселей по высоте;

                /* Устанавливает всплывающую подсказку (Tooltip) для кнопки btn с текстом "Это кнопка тестирования
                свойств класса Button". */
                btn.setTooltip(new Tooltip("Это кнопка тестирования свойств класса Button"));

                /* Создает объект Image изображения с именем "Angarsk.jpg". */
                Image im=new Image(this.getClass().getResource("Angarsk.jpg").toString());

                ImageView imv=new ImageView(im); // Создает объект ImageView, который представляет изображение im;
                imv.setFitHeight(50); // Устанавливает высоту изображения imv равной 50 пикселям;
                imv.setFitWidth(50); // Устанавливает ширину изображения imv равной 50 пикселям;
                btn.setGraphic(imv); // Устанавливает графическое изображение imv в качестве иконки кнопки btn;

                /* Устанавливает стиль текста кнопки btn с использованием CSS. В данном случае,
                шрифт на кнопке будет Helvetica с жирным (bold) начертанием, курсивом (italic)
                и размером 10 пунктов. */
                btn.setStyle("-fx-font: bold italic 10pt Helvetica;");

                btn.setAlignment(Pos.CENTER); // Выравнивает текст на кнопке по центру;
                btn.setContentDisplay(ContentDisplay.RIGHT); // Устанавливает выравнивание содержимого кнопки btn справа;
                btn.setUnderline(true); // Устанавливает подчеркивание текста на кнопке btn;

                /* Разрешает перенос текста на несколько строк, если кнопка не вмещает его целиком. */
                btn.setWrapText(true);
            }});

        root.getChildren().add(btnON);
        root.getChildren().add(btn);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
