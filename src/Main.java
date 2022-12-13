import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @Description: //TODO 多个场景之间切换
 * @Author: zhangxueliang
 * @Create: 2021-05-27 09:35
 * @Version: 1.0
 **/
public class Main extends Application {
    Scene scene1,scene2;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn1 = new Button("scene 1");
        btn1.setOnMouseClicked(e->{
            primaryStage.setScene(scene2);
        });
        VBox vBox = new VBox();
        vBox.getChildren().add(btn1);
        scene1 = new Scene(vBox,200,200);

        Button btn2 = new Button("scene 2");
        btn2.setOnMouseClicked(event -> {
            primaryStage.setScene(scene1);
        });
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(btn2);
        scene2 = new Scene(stackPane, 600, 600);

        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

