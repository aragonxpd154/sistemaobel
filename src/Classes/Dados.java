package Classes;
/**
 *
 * @author OBEL
 */
public class Dados {
    
    // Para usuarios
    
    private final int maxusuarios = 50;
    
    private final Usuario Musuarios[]= new Usuario[maxusuarios];
    
    private int countusuarios = 0;
    
    // Para Produtos
    
    private final int maxprodutos = 80;
    
    private final Produtos Mprodutos[]= new Produtos[maxprodutos];
    
    private int countprodutos = 0;
    
    // Para Cliente
    
    private final int maxclientes = 80;
    
    private final Cliente Mclientes[]= new Cliente[maxclientes];
    
    private int countclientes = 0;
    
    public Dados(){
        
        // Criando cadastro de Usuarios
        Usuario Musuario;
        
        // Regitrando cadastro de Usuarios
        Musuario = new Usuario("Admin", "Admin", "Admin", "1234", "1");
        Musuarios[countusuarios]=Musuario;
        countusuarios ++;
        
        Musuario = new Usuario("Mike", "Mike", "Augusto", "123", "1");
        Musuarios[countusuarios]=Musuario;
        countusuarios ++;
        
        Musuario = new Usuario("Marcos", "Marcos", "Obel", "1234", "1");
        Musuarios[countusuarios]=Musuario;
        countusuarios ++;
        
        // Criando cadastro de produtos
    
        Produtos Mproduto;
        
        // Regitrando cadastro de Produtos
        Mproduto = new Produtos("1", "Arroz", 10, 0, "Arroz Integral");
        Mprodutos[countprodutos]=Mproduto;
        countprodutos ++;
        
        Mproduto = new Produtos("2", "Feijao", 5, 0, "Feijão tipo 1");
        Mprodutos[countprodutos]=Mproduto;
        countprodutos ++;
        
        Mproduto = new Produtos("3", "Carne Suina", 60, 0, "Carrer suino 5 k");
        Mprodutos[countprodutos]=Mproduto;
        countprodutos ++;
        
        
        // Regitrando cadastro de Produtos
        Cliente Mcliente;
        
        // Regitrando cadastro de Produtos
        Mcliente = new Cliente("1",1, "Marcos", "Silva", "Seven Sister Road", "252623325",1,Utilidades.StringToDate("1952/10/04"),Utilidades.StringToDate("1952/10/04"),"marcos.silvabl@live.com");
        Mclientes[countclientes]=Mcliente;
        countclientes ++;
        
        Mcliente = new Cliente("2",1, "Marcos", "Silva", "Seven Sister Road", "252623325",1,Utilidades.StringToDate("1952/10/04"),Utilidades.StringToDate("1952/10/04"),"marcos.silvabl@live.com");
        Mclientes[countclientes]=Mcliente;
        countclientes ++;
        
        Mcliente = new Cliente("3",1, "Marcos", "Silva", "Seven Sister Road", "252623325",1,Utilidades.StringToDate("1952/10/04"),Utilidades.StringToDate("1952/10/04"),"marcos.silvabl@live.com");
        Mclientes[countclientes]=Mcliente;
        countclientes ++;
        
        
        
    }
    
    public int NUsuarios(){
        return countusuarios;
    }
    
    public int NProdutos(){
        return countprodutos;
    }
    
    public int NClientes(){
        return countclientes;
    }   
    
    
    public Usuario[] getUsuarios(){
        return Musuarios;
    }
    public Produtos[] getProdutos(){
        return Mprodutos;
    }
    public Cliente[] getClientes(){
        return Mclientes;
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
    public int LinhaProdutos(String produto){
        
   
        for(int i=0;i < countprodutos; i++){
            if (Mprodutos[i].getCodproduto().equals(produto)){
                return i;
            }
        }
        return -1;
        
    }
    public int LinhaClientes(String cliente){
        
   
        for(int i=0;i < countclientes; i++){
            if (Mclientes[i].getIdCliente().equals(cliente)){
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
    
    public String Cadproduto(Produtos MMprodutos){
        if (countprodutos == maxprodutos){
            return "Não há espaço no banco de dados";
        }
    
    
    Mprodutos[countprodutos]=MMprodutos;
    countprodutos++;
    return " Produto cadastrado com Sucesso";
    
    }

    public String Cadcliente(Cliente MMclientes){
        if (countclientes == maxclientes){
            return "Não há espaço no banco de dados";
        }
    
    
    Mclientes[countclientes]=MMclientes;
    countclientes++;
    return " Cliente cadastrado com Sucesso";
    
    }
    
    public String EditarUsuario(Usuario MMusuario, int poslinha) {
        Musuarios[poslinha].setNome(MMusuario.getNome());
        Musuarios[poslinha].setSobrenome(MMusuario.getSobrenome());
        Musuarios[poslinha].setSenha(MMusuario.getSenha());
        Musuarios[poslinha].setPerfil(MMusuario.getPerfil());
        
        return "Usuario Editado com Sucesso";
    }
        public String EditarProduto(Produtos MMprodutos, int poslinha){
        Mprodutos[poslinha].setCodproduto(MMprodutos.getCodproduto());
        Mprodutos[poslinha].setDescricao(MMprodutos.getDescricao());
        Mprodutos[poslinha].setPreco(MMprodutos.getPreco());
        Mprodutos[poslinha].setTaxa(MMprodutos.getTaxa());
        Mprodutos[poslinha].setObservacao(MMprodutos.getObservacao());
        
        return "Produto Editado com Sucesso";
    }
        public String EditarCliente(Cliente MMclientes, int poslinha){
        Mclientes[poslinha].setIdCliente(MMclientes.getIdCliente());
        Mclientes[poslinha].setIndent(MMclientes.getIndent());
        Mclientes[poslinha].setNome(MMclientes.getNome());
        Mclientes[poslinha].setSobnome(MMclientes.getSobnome());
        Mclientes[poslinha].setEndereco(MMclientes.getEndereco());
        Mclientes[poslinha].setTelefone(MMclientes.getTelefone());
        Mclientes[poslinha].setCidade(MMclientes.getCidade());
        Mclientes[poslinha].setDataNasc(MMclientes.getDataNasc());
        Mclientes[poslinha].setDataVenda(MMclientes.getDataVenda());
        Mclientes[poslinha].setEmail(MMclientes.getEmail());
        
        return "Cliente Editado com Sucesso";
    }
    public String DeletarUsuario(int poslinha){
        for(int i = poslinha; i < countusuarios -1; i++){
            Musuarios[i]=Musuarios[i + 1];
        }
        countusuarios --;
        return "Usuario deletado com Sucesso";
    }
        public String DeletarProduto(int poslinha){
        for(int i = poslinha; i < countprodutos -1; i++){
            Mprodutos[i]=Mprodutos[i + 1];
        }
        countprodutos --;
        return "Produto deletado com Sucesso";
    }
        public String DeletarCliente(int poslinha){
        for(int i = poslinha; i < countclientes -1; i++){
            Mclientes[i]=Mclientes[i + 1];
        }
        countclientes --;
        return "Cliente deletado com Sucesso";
    }

    public int NUClientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
