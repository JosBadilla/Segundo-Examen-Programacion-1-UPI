
import java.util.ArrayList;


public class ClsEncuesta {
     private static ArrayList<String> nombre = new ArrayList<String>();
  private static ArrayList<String> edad = new ArrayList<String>();
  private static ArrayList<String> correo = new ArrayList<String>();
   private static ArrayList<String> CarroPropio = new ArrayList<String>();
  public static String Carro_Propio;

    static void getCarroPropio(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public ClsEncuesta(){
     nombre.clear();
     edad.clear();
     correo.clear();
     CarroPropio.clear();
    }

    
    public static void BuscarNombre(String nombre){
    
     for (int i = 0; i < nombre.length(); i++) {
           if (nombre.equals(nombre.length()))
           {
             Carro_Propio = CarroPropio.get(i);
             break;
           }
        }
    }
    
    public static void nombre(String nombre) {
       
      
        
        
    }

    public static void getedad() {
         
    }

    public static void getcorreo() {
       
    }
    public static void getCarroPropio() {
       
    }
    public static void setnombre(String pnombre) {
      nombre.add(pnombre);
    }

    public static void setedad(String pedad) {
       edad.add(pedad);
    }
   
    public static void setcorreo(String pcorreo) {
       correo.add(pcorreo);
    }
    public static void setCarroPropio(String pCarroPropio) {
       CarroPropio.add(pCarroPropio);
}
    }
