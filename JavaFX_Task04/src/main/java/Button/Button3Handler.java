package Button;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;


public class Button3Handler implements EventHandler<ActionEvent> {
    private Stage primaryStage;
    public Button3Handler(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void handle(ActionEvent event) {
        primaryStage.setOpacity(0); // Устанавливаем прозрачность старого(основного) окна чтобы было видно только новое;
        Stage newStage = new Stage(); // Создаем новое окно;
        newStage.initOwner(primaryStage); // Устанавливаем основное окно владельцем нового окна;
        newStage.initModality(Modality.WINDOW_MODAL); // Устанавливаем режим модального окна (новое окно будет блокировать основное окно до закрытия);

        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(50));
//        gridPane.setAlignment(Pos.CENTER);
//        gridPane.setHgap(10);
//        gridPane.setVgap(10);

        Button closeButton = new Button("Закрыть");
        closeButton.setOnAction(e -> {
            newStage.close();
            primaryStage.setOpacity(1);
            primaryStage.show(); // Показываем исходное окно после закрытия нового окна
        });

        Label label = new Label("Анга́рск — город в Восточной Сибири, с прилегающими населёнными пунктами " +
                "образует Ангарский городской округ.\n" +
                "\n" +
                "Население города — 221 296 (2021) человек. Пятнадцатый по числу жителей город Сибири, " +
                "девяносто третий город по числу жителей в стране.\n" +
                "\n" +
                "Расположен в южной, наиболее освоенной и экономически развитой части Иркутской области.\n" +
                "\n" +
                "Название города происходит от названия реки Ангары. Неофициально город с момента основания " +
                "называют — Город, рождённый Победой. В СМИ по отношению к Ангарску часто используется определение — Город нефтехимиков.\n" +
                "\n" +
                "Экономической основой города являются крупные предприятия нефтепереработки, химической " +
                "промышленности, атомной и строительной отрасли.\n" +
                "\n" +
                "Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял " +
                "второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 " +
                "году по результатам конкурса среди муниципальных образований «Самый чистый город России», " +
                "проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое " +
                "место в категории «Большие города». \"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"\"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"\"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"\"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"\"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"\"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"\"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"\"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"\"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"\"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"\"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"\"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"\"Ангарск — один из лучших по уровню благоустройства в Восточной Сибири: в 2003 году город занял \" +\n" +
                "                \"второе место в конкурсе на самый благоустроенный город России, а в 2005 и 2008 — первое. В 2013 \" +\n" +
                "                \"году по результатам конкурса среди муниципальных образований «Самый чистый город России», \" +\n" +
                "                \"проводившегося в рамках Всероссийского политического проекта «Чистый город», Ангарск занял первое \" +\n" +
                "                \"место в категории «Большие города».\"");
        Font font = Font.font("Arial", 12);
        label.setFont(font);
        label.setAlignment(Pos.TOP_CENTER);
        label.setWrapText(true);
        label.setMaxWidth(800);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(label);
        scrollPane.setFitToWidth(false);
        scrollPane.setFitToHeight(false);
        scrollPane.setPrefViewportHeight(700);
        scrollPane.setPrefViewportWidth(300);


        BorderPane.setAlignment(closeButton, Pos.BOTTOM_RIGHT);

        // pane.setCenter(label);
        pane.setCenter(scrollPane);
        pane.setBottom(closeButton);

        // Создаем сцену и устанавливаем контент в новое окно
        Scene scene = new Scene(pane, primaryStage.getWidth(), primaryStage.getHeight());
        newStage.setScene(scene);
        newStage.setTitle("Новое окно");

        primaryStage.toFront(); // Перемещаем исходное окно вверх стека окон

        newStage.show();
    }
}
