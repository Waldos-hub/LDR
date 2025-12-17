package Frontend;

//Importar paquetes
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
                
        StackPane root = new StackPane();
        Scene scene = new Scene(root,300,250);
        Label label = new Label("Bienvenidos a la futura aplicacion de LDR");
        root.getChildren().add(label);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Aplicacion LDR");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}