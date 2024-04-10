package tabs;

import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class NewTab {

    public static Tab createNewTab() {
        Tab newTab = new Tab("Новая вкладка");

        VBox contentPane = new VBox();
        contentPane.getChildren().add(new TextField("Новая вкладка!"));

        newTab.setContent(contentPane);

        return newTab;
    }
}

