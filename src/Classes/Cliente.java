
package Classes;

import java.util.Date;

/**
 *
 * @author OBEL
 */
public class Cliente {
    private String idCliente;
    private int Indent;
    private String Nome;
    private String Sobnome;
    private String Endereco;
    private String Telefone;
    private String Cidade;
    private Date DataNasc;
    private Date DataVenda;
    private String Email;

    public Cliente(String idCliente, int Indent, String Nome, String Sobnome, String Endereco, String Telefone, String Cidade, Date DataNasc, Date DataVenda, String Email) {
        this.idCliente = idCliente;
        this.Indent = Indent;
        this.Nome = Nome;
        this.Sobnome = Sobnome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Cidade = Cidade;
        this.DataNasc = DataNasc;
        this.DataVenda = DataVenda;
        this.Email = Email;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getIndent() {
        return Indent;
    }

    public void setIndent(int Indent) {
        this.Indent = Indent;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobnome() {
        return Sobnome;
    }

    public void setSobnome(String Sobnome) {
        this.Sobnome = Sobnome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public Date getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(Date DataNasc) {
        this.DataNasc = DataNasc;
    }

    public Date getDataVenda() {
        return DataVenda;
    }

    public void setDataVenda(Date DataVenda) {
        this.DataVenda = DataVenda;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}