package Classes;
/**
 *
 * @author OBEL
 */
public class Dados {
    
    private final int maxusuarios = 50;
    
    private final Usuario Musuarios[]= new Usuario[maxusuarios];
    
    private int countusuarios = 0;
    
    public Dados(){
        Usuario Musuario = new Usuario("Admin", "Admin", "Admin", "Admin", "1");
        Musuarios[countusuarios]=Musuario;
        countusuarios ++;
    }
    
    public int NUsuarios(){
        return countusuarios;
    }
    
    public Usuario[] getUsuarios(){
        return Musuarios;
    }
    public boolean ValidarUsuario(String usuario, String senha){
        boolean x = false;
        for(int i=0;i <countusuarios; i++){
            if (Musuarios[i].getIdcodusuario().equals(usuario)&& Musuarios[i].getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    
    }

    public int LinhaUsuario(String usuario){
        
   
        for(int i=0;i < countusuarios; i++){
            if (Musuarios[i].getIdcodusuario().equals(usuario)){
                return i;
            }
        }
        return -1;
        
    }
    public String CadUsuario(Usuario MMusuario){
        if (countusuarios == maxusuarios){
            return "Não há espaço no banco de dados";
        }
    
    
    Musuarios[countusuarios]=MMusuario;
    countusuarios++;
    return " Usuario cadastrado com Sucesso";
    
    }
    
}
