
package Classes;

/**
 *
 * @author OBEL
 */
public class Utilidades {
    public static boolean isNumeric(String Numero){
        try{
            Integer.parseInt(Numero);
            return true;
            
        } catch (Exception e){
            return false;
        }
    }

    public static boolean IsNumeric(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
