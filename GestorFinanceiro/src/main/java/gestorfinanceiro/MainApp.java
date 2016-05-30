package gestorfinanceiro;

import com.airhacks.afterburner.injection.Injector;
import gestorfinanceiro.telaprincipal.TelaprincipalView;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {
    private static TelaprincipalView telaPrincipal;
    @Override
    public void start(Stage stage) throws Exception {
       telaPrincipal = new TelaprincipalView();
       Scene scene = new Scene(telaPrincipal.getView());
       stage.setTitle("Gestor Financeiro");
       stage.setScene(scene);
       stage.show();
       
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public static TelaprincipalView getTela1View() {
        return telaPrincipal;
    }
    
    
    @Override
    public void stop() throws Exception {
        Injector.forgetAll();
    }
}
