/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorfinanceiro.telaprincipal;

import gestorfinanceiro.MainApp;
import gestorfinanceiro.bean.Contas;
import gestorfinanceiro.telacriacao.TelacriacaoView;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author RyLaw
 */
public class TelaprincipalPresenter implements Initializable {

    private ResourceBundle resources = null;
    private TelacriacaoView telaCriacao;
    @FXML
    private DatePicker databusca;
    @FXML
    private TextField anodabusca;
    @FXML
    private Button bt_agosto;
    @FXML
    private Label icone_logo;
    private TelacriacaoView telacriacaoView;
    @FXML
    private ListView<Contas> llistview;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.resources = resources;
        llistview.setItems(MainApp.getContasList());
    }

    @FXML
    private void btJaneiro(ActionEvent event) {

    }

    @FXML
    private void btFevereiro(ActionEvent event) {
    }

    @FXML
    private void btMarco(ActionEvent event) {
    }

    @FXML
    private void btAbril(ActionEvent event) {
    }

    @FXML
    private void btMaio(ActionEvent event) {
    }

    @FXML
    private void btJunho(ActionEvent event) {
    }

    @FXML
    private void btJulho(ActionEvent event) {
    }

    @FXML
    private void btAgosto(ActionEvent event) {
    }

    @FXML
    private void btSetembro(ActionEvent event) {
    }

    @FXML
    private void btOutubro(ActionEvent event) {
    }

    @FXML
    private void btNovembro(ActionEvent event) {
    }

    @FXML
    private void btDezembro(ActionEvent event) {
    }

    @FXML
    private void btNovo(ActionEvent event) {
       telacriacaoView = new TelacriacaoView();
       Scene scene = new Scene(telacriacaoView.getView());
       Stage stage = new Stage();
       stage.setTitle("Gestor Financeiro");
       stage.setScene(scene);
       stage.showAndWait();
    }

    @FXML
    private void impRelatorio(ActionEvent event) {
    }
    
}
