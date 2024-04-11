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
    private final NewTab newTab; // Добавляем ссылку на класс, создающий вкладки

    public Button1Handler(TabPane tabPane, NewTab newTab) {
        this.tabPane = tabPane;
        this.newTab = newTab;
    }

    @Override
    public void handle(ActionEvent event) {
        if (!isTabCreated) {
            // Создаем новую вкладку только если она еще не создана
            Tab newTab = NewTab.createNewTab();
            tabPane.getTabs().add(newTab);
            isTabCreated = true; // Устанавливаем флаг, что вкладка уже создана

            // Добавляем слушатель событий для закрытия вкладки
            newTab.setOnClosed(e -> {
                isTabCreated = false; // Сбрасываем флаг, чтобы можно было создать новую вкладку
            });
        }

    }
}

