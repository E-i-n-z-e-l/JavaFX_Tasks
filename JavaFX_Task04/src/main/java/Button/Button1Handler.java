package Button;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import tabs.NewTab;

public class Button1Handler implements EventHandler<ActionEvent> {
    private boolean isTabCreated = false;
    private final TabPane tabPane;

    public Button1Handler(TabPane tabPane) {
        this.tabPane = tabPane;
    }

    @Override
    public void handle(ActionEvent event) {
        if (!isTabCreated) {
            // Создаем новую вкладку только если она еще не создана
            Tab newTab = NewTab.createNewTab();
            tabPane.getTabs().add(newTab);
            isTabCreated = true; // Устанавливаем флаг, что вкладка уже создана
        }
    }
}

