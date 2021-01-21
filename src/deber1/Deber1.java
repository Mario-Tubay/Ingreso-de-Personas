package deber1;

import Class.Persona;
import java.util.*;

public class Deber1 {
    static ArrayList<Persona> listPersona = new ArrayList<Persona>();
    public static void main(String[] args) {    
    
        
       
        
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        String nombre;
        String apellido;
        String cedula;
        boolean bucle= true;
        do {        
            System.out.println("Ingrese la edad para continuar: ");
            edad = sc.nextInt();
            if(edad>=18){
                System.out.println("Ingrese el nombre: ");
                nombre= sc.next();
                System.out.println("Ingrese el Apellido: ");
                apellido = sc.next();
                System.out.println("Ingrese la cedula: ");
                cedula = sc.next();
                bucle = true;
                Persona persona = new Persona(cedula, nombre, apellido, edad);
               
                listPersona.add(persona);
                System.out.println("Datos ingresados con exito");
                for (int i =0; i<listPersona.size(); i++){
                    System.out.println(""+listPersona.get(i).toString());
                }
            }else{
                System.out.println("Lo sentimos es menor de edad");
                bucle = false;
            }
        } while (bucle);
        
       
    
    }
    
    
}
