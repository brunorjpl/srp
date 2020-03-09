package br.edu.infnet.srp.testes;


import br.edu.infnet.srp.dao.JpaConnection;

import br.edu.infnet.srp.dao.MysqlConection;

public class GeraTabelas {

	public static void main(String[] args) {
	   
			MysqlConection.getConnection();
	        JpaConnection.getEmf();
	     }
	
		
	
	}


