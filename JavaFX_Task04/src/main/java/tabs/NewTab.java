package tabs;

import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
public class NewTab {

    public static Tab createNewTab() {
        Tab newTab = new Tab("Новая вкладка");
        Button button1 = new Button("Кнопка 1");
        Button button2 = new Button("Кнопка 2");
        VBox contentPane = new VBox(button1, button2);

        newTab.setContent(contentPane);

        return newTab;
    }
}

