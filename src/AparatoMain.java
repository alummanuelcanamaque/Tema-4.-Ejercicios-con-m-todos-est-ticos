/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel Cañamaque
 */
public class AparatoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aparato bombilla = new Aparato(100);
        Aparato radiador = new Aparato(2000);
        Aparato plancha = new Aparato(1200);
        Aparato.mostrarConsumoTotal();
        
        bombilla.encender();
        plancha.encender();
        Aparato.mostrarConsumoTotal();
        
        plancha.apagar();
        radiador.encender();
        Aparato.mostrarConsumoTotal();
    }
    
}
