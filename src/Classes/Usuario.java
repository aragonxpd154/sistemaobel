
package Classes;

/**
 *
 * @author OBEL
 */
public class Usuario {
    private String idcodusuario;
    private String nome;
    private String sobrenome;
    private String senha;
    private String perfil;    

    public Usuario(String idcodusuario, String nome, String sobrenome, String senha, String perfil) {
        this.idcodusuario = idcodusuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getIdcodusuario() {
        return idcodusuario;
    }

    public void setIdcodusuario(String idcodusuario) {
        this.idcodusuario = idcodusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    /*    Object getCodusuario() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    Object getCodusuario() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
