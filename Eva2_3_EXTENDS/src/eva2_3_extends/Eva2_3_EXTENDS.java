/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_extends;

/**
 *
 * @author invitado
 */
public class Eva2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante este = new Estudiante();
        este.setNombre("Tilin");
        este.setApellido("Eso");
        este.setEdad(6);
        este.setNoControl("22550377");
        
        System.out.println("Presentamos");
        System.out.println(este.getApellido());
        System.out.println(este.getNombre());
        System.out.println(este.getEdad());
        System.out.println(este.getNoControl());
    }
    
}
