package br.edu.infnet.srp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import br.edu.infnet.srp.dao.JpaDAO;
import br.edu.infnet.srp.dao.PatrimonioJPADAO;
import br.edu.infnet.srp.modelo.Patrimonio;

@WebServlet(urlPatterns = { "/" })
public class PatrimonioServlet extends HttpServlet {

	private PatrimonioJPADAO service;

	public PatrimonioServlet(PatrimonioJPADAO service) {
		super();
		this.service = service;
	}

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		        doGet(request, response);
		    }

		    protected void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {

		    	List<Patrimonio> patrimonio = service.findAll();
		    	
		    	request.setAttribute("lista_patrimonio", patrimonio);
		    	request.getRequestDispatcher("pages/home.jsp").forward(request, response);;


}
}
