/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorfinanceiro.telaprincipal;

import gestorfinanceiro.MainApp;
import gestorfinanceiro.telacriacao.TelacriacaoView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author RyLaw
 */
public class TelaprincipalPresenter implements Initializable {

    private ResourceBundle resources = null;
    @FXML
    private AnchorPane AnchorPane;
    private TelacriacaoView telaCriacao;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.resources = resources;
    }

    @FXML
    private void clickme(ActionEvent event) {
        telaCriacao = new TelacriacaoView();
            Scene scene = new Scene(telaCriacao.getView());
            Stage stage = new Stage();
            stage.setTitle("Cadastro Alunos");
            stage.setScene(scene);
            stage.showAndWait();
    }
    
}
