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
public abstract class SerVivo {
    
    int edad;
    String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getdescripcion ();
    public abstract String getdescripcion2 ();
    
    
}
