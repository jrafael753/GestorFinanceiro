/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorfinanceiro.telacriacao;

import gestorfinanceiro.MainApp;
import gestorfinanceiro.bean.Contas;
import gestorfinanceiro.bean.Grupo;
import java.net.URL;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author LaBTauControl
 */
public class TelacriacaoPresenter implements Initializable {


    private ResourceBundle resources = null;
    @FXML
    private TextField valorConta;
    @FXML
    private ChoiceBox<?> tipoConta;
    @FXML
    private TextField descricaoConta;
    @FXML
    private TextField detalhesConta;
    @FXML
    private Ellipse Situacao;
    @FXML
    private DatePicker vencimento;
    @FXML
    private DatePicker pagamento;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.resources = resources;
        choicetipo();
    }

    @FXML
    private void Confirmar(ActionEvent event) {
        Contas conta = new Contas();
        Grupo grupo = new Grupo();
        
        conta.setValorDoc(Double.parseDouble(valorConta.getText()));
        conta.setDescricao(descricaoConta.getText());
        conta.setDetalhes(detalhesConta.getText());
        if (vencimento.getValue() != null) {
            Instant instant = vencimento.getValue().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
            conta.setDataVencimento(Date.from(instant));
        }
        MainApp.getContasList().add(conta);
        detalhesConta.getScene().getWindow().hide();
        
    }
    private void choicetipo(){
        
    }



    
}
