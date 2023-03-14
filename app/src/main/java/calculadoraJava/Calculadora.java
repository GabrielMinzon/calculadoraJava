/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraJava;

/**
 *
 * @author Admin
 */
public class Calculadora {
    
    public double soma(double x, double y){
            return x + y;
        }
    
    public double subtracao(double x, double y){
        return x - y;
    }
    
    public double multiplicacao(double x, double y){
        return x * y;
    }
    
    public double divisao(double x, double y){
        if(x == 0){
            return 0;
        }
        else{
            return x / y;
        }
    }
    
    public double raizQ(double a){
       return Math.sqrt(a);
    }
    
    public double porcentagem(double x, double y){ 
        return x * y / 100;
    }
    
    public double potencia(double x, double y){
        return Math.pow(x, y); 
    }
    
}
