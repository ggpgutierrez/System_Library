/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author Gabriel
 */
public class RepositorioBase {
       protected Connection conexaoSisProjeto;
	protected PreparedStatement comando;
  public RepositorioBase() {

		comando = null;
	}

	
	
}