package Classes;
/**
 *
 * @author OBEL
 */
public class Dados {
    public boolean validarUsuarios (String usuario, String senha){
        if (usuario.equals("Alexsandro")&& senha.equals("1234")){
            return true;
        }else{
            return false;
        }
    }
}
