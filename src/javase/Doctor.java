package javase;

public class Doctor {
    int id ;
    String nombre;
    String espeliacion;
    
    //Doctor(){
       // System.out.println("construyecto el objeto doctor");
    //}  
    Doctor(int id, String nombre, String espeliacion){
        this.id = id;
        this.nombre = nombre;
        this.espeliacion = espeliacion;
    }

    public void MostrarDoctor(){
        System.out.println("\nId: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Especialidad: "+espeliacion);
    }

    public void MostrarId(){
        System.out.println("Id: "+id);
    } 
    
    

}
