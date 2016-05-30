/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorfinanceiro.telacriacao;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author LaBTauControl
 */
public class TelacriacaoPresenter implements Initializable {

    private ResourceBundle resources = null;
    @FXML
    private TextField valor_da_conta;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.resources = resources;
    }



    
}
