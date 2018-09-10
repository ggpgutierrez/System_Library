/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relatorios;

import BancoDeDados.BdBiblioteca;
import Utilitarios.Mensagem;
import java.sql.Connection;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Gabriel
 */
public class GerarRelatorios {

    private Connection connection;

    public void GerarTodosItens(){
        String src = "C:\\Program Files\\projetoBiblioteca\\src\\Relatorios\\Livros.jasper";
        JasperPrint jasperprint = null;
        try (Connection conn = new BdBiblioteca().getConnection()) {
            jasperprint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception e) {
            Mensagem.exibirMensagem("Erro" + e);
        }
        JasperViewer view = new JasperViewer(jasperprint, false);
        view.setVisible(true);
    }

    public void GerarUsuarios() {
        String src = "C:\\Program Files\\projetoBiblioteca\\src\\Relatorios\\Relatorio_Usuarios.jasper";
        JasperPrint jasperprint = null;
        try (Connection conn = new BdBiblioteca().getConnection()) {
            jasperprint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception e) {
            Mensagem.exibirMensagem("Erro" + e);
        }
        JasperViewer view = new JasperViewer(jasperprint, false);
        view.setVisible(true);
    }

    public void GerarItens() {
        String src = "C:\\Program Files\\projetoBiblioteca\\src\\Relatorios\\Relatório_Itens_Atrasados.jasper";
        JasperPrint jasperprint = null;
        try (Connection conn = new BdBiblioteca().getConnection()) {
            jasperprint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception e) {
            Mensagem.exibirMensagem("Erro" + e);
        }
        JasperViewer view = new JasperViewer(jasperprint, false);
        view.setVisible(true);
    }
}
