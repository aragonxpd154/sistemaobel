/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Formularios.frmLogin;
/**
 *
 * @author OBEL
 */
public class SistemaObel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dados clsdados = new Dados();
        frmLogin Login = new frmLogin();
        Login.setDados(clsdados);
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
    }
    
}
