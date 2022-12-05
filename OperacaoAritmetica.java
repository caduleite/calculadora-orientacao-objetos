package Aula01;

import javax.swing.JOptionPane;

// Classe OperacaoAritmetica contendo os atributos para as operações da calculadora:
public class OperacaoAritmetica {
    
    private int operacao;
    private double valor1;
    private double valor2;
    private double resultado;
    
// Classe opCalculadora para as operações da calculadora:
    public double opCalculadora(int op, double valor1, double valor2){
        
        if(op == 1){
           resultado = (valor1 + valor2); 
        }
        else if(op == 2){
            resultado = (valor1 - valor2);
        }
        else if(op == 3){
            resultado = (valor1 * valor2);
        }
        else{
            if(valor2 == 0){
               JOptionPane.showMessageDialog( null, "Atenção: " + valor1 + " / " + valor2+ " = " +
               "Não existe divisão por zero!", "Aula 03 - Calculadora La Pascaline", JOptionPane.ERROR_MESSAGE);
            }
            else{
                    resultado = (valor1 / valor2);
                }
                    }
        
        return resultado;
    }

    

}