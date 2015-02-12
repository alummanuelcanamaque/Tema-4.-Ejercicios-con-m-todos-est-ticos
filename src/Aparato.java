/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Cañamaque
 */
public class Aparato {
    private static int consumo;
    private int potencia;
    private boolean encendido = false;

    public Aparato(int potencia) {
        this.potencia = potencia;
//        System.out.println("Consumo: "+consumo);
    }
    
    public void encender(){
        if(!encendido){
            this.encendido = true;
            consumo += potencia;
        }        
    }
    
    public void apagar(){
        if(encendido){
            this.encendido = false;
            consumo -= potencia;
        }        
    }
    
    public static void mostrarConsumoTotal(){
        System.out.println("Consumo: "+consumo);
    }
}
