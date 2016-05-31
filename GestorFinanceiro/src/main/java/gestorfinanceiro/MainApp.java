package gestorfinanceiro;

import com.airhacks.afterburner.injection.Injector;
import gestorfinanceiro.bean.Contas;
import gestorfinanceiro.telaprincipal.TelaprincipalView;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {
    private static TelaprincipalView telaPrincipal;
    private static ObservableList<Contas> contaslist;
    
    @Override
    public void start(Stage stage) throws Exception {   
       telaPrincipal = new TelaprincipalView();
       Scene scene = new Scene(telaPrincipal.getView());
       stage.setTitle("Gestor Financeiro");
       stage.setScene(scene);
       stage.show();
       

       
    }
    public static TelaprincipalView getTela1View() {
        return telaPrincipal;
    }
    @Override
    public void stop() throws Exception {
        Injector.forgetAll();
    }
    public static ObservableList<Contas> getContasList() {
        if(contaslist == null) {
            contaslist = FXCollections.observableArrayList();
        }
        return contaslist;
    }    
    
    
    
        public static void main(String[] args) {
            
        launch(args);
    }
    
}
