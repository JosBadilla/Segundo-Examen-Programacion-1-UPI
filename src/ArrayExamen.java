
import java.util.ArrayList;


public class ArrayExamen {
    
     public static void main(String[] args) {
         
   ArrayList<String> encuesta = new ArrayList<String>();
   
   encuesta.add("nombre y apellido");
   encuesta.add("edad");
   encuesta.add("correo");
   encuesta.add("carro propio");
        

   
        System.out.println(encuesta.get(1));
        
        encuesta.remove(3);
        
        for (int i = 0; i < encuesta.size(); i++) {
            System.out.println(encuesta.get(i));
        }
}
}