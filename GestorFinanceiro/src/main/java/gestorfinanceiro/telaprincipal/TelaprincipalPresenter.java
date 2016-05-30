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
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author RyLaw
 */
public class TelaprincipalPresenter implements Initializable {

    private ResourceBundle resources = null;
    private TelacriacaoView telaCriacao;
    @FXML
    private DatePicker data_busca;
    @FXML
    private TextField ano_da_busca;
    @FXML
    private Button bt_janeiro;
    @FXML
    private Button bt_fevereiro;
    @FXML
    private Button bt_marco;
    @FXML
    private Button bt_abril;
    @FXML
    private Button bt_maio;
    @FXML
    private Button bt_junho;
    @FXML
    private Button bt_julho;
    @FXML
    private Button bt_agosto;
    @FXML
    private Button bt_setembro;
    @FXML
    private Button bt_outubro;
    @FXML
    private Button bt_novembro;
    @FXML
    private Button bt_dezembro;
    @FXML
    private Label icone_logo;
    @FXML
    private Button imp_relatorio;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.resources = resources;
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
    private void impRelatorio(ActionEvent event) {
    }
    
}
