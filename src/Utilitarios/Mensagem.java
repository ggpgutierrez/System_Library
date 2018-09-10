/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import Model.Logar;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Mensagem {
    
    public static int  exibirConfirm() 
    {
     
     int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Deseja fechar a tela?","Fechar", JOptionPane.YES_NO_OPTION);
     return showConfirmDialog;
    }
    public static void men(String texto)
    {
        JOptionPane.showMessageDialog(null, texto,"Atenção", JOptionPane.WARNING_MESSAGE);
    }
        public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

   
}
