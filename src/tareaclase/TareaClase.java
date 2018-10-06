/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaclase;

/**
 *
 * @author alumno
 */
public class TareaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SerVivo[] varios = new SerVivo[3];
        varios[0] = new SerHumano();
        varios[1] = new Animal();
        varios[2] = new Planta();
        
    }
    
}
