/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;

/**
 *
 * @author TOSHIBA
 */
public class Persona {
     private String Nombre;
    private Date Nacimiento;

    public Persona(String Nombre, Date Nacimiento) {
        this.Nombre = Nombre;
        this.Nacimiento = Nacimiento;
    }

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }
    
}
