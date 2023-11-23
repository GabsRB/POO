/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class Calculadora_ViewController implements Initializable {

    @FXML
    private Label lblNumero1;
    @FXML
    private Label lblNumero2;
    @FXML
    private Label lblResultado;
    @FXML
    private TextField txtNumero1;
    @FXML
    private TextField txtNumero2;
    @FXML
    private TextField txtResultado;
    @FXML
    private RadioButton rbSomar;
    @FXML
    private ToggleGroup tgOperacao;
    @FXML
    private RadioButton rbSubtrair;
    @FXML
    private RadioButton rbMultiplicar;
    @FXML
    private RadioButton rbDividir;
    @FXML
    private Button btnCalcular;
    @FXML
    private Button btnLimpar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnCalcular_Click(ActionEvent event) {
        //variaveis numericas
        double numero1, numero2, resultado = 0;
        char operacao;
        
        try {
            numero1 = Double.parseDouble(txtNumero1.getText());
            numero2 = Double.parseDouble(txtNumero2.getText());
        }
        catch (NumberFormatException ex) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Mensagem");
            alerta.setHeaderText("Entrada de Dados, coloque somente numeros");
            alerta.setContentText(ex.getMessage());

            alerta.showAndWait(); //exibe a mensagem
            
            return;
        }
        
        if(rbDividir.isSelected())
            operacao = '/';
        else if(rbMultiplicar.isSelected())
            operacao = '*';
        else if(rbSomar.isSelected())
            operacao = '+';
        else if(rbSubtrair.isSelected())
            operacao = '-';
        else {
            //dar mensagem de erro
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Mensagem");
            alerta.setHeaderText("Opção de Calculo");
            alerta.setContentText("Escolha uma opção");

            alerta.showAndWait(); //exibe a mensagem
            
            return;
        }
        
        //calcular o resultado
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
        }
        
        //exibir no textField
        txtResultado.setText(String.valueOf(resultado));
    }

    @FXML
    private void btnLimpar_Click(ActionEvent event) {
        //limpar os textFields
        txtNumero1.setText("");
        txtNumero2.setText("");
        txtResultado.setText("");
        
        //limpar todos os radioButtons
        tgOperacao.selectToggle(null);
        
        //enviar o foco para o txtNumero1
        txtNumero1.requestFocus();
    }
    
}
