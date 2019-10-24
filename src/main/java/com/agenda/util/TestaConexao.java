package com.agenda.util;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) {
		
		try {
			Connection connection = new ConnectionFactory().getConnection();
			connection.close();
			System.out.println("Conex�o aberta!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
