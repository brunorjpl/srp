package br.edu.infnet.srp.dao;

import br.edu.infnet.srp.modelo.Patrimonio;

public class PatrimonioJPADAO extends JpaDAO<Patrimonio, Integer> {

	public PatrimonioJPADAO() {
		super(Patrimonio.class);
	}

}
