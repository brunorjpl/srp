package br.edu.infnet.srp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.srp.dao.PatrimonioJPADAO;
import br.edu.infnet.srp.modelo.Patrimonio;


@WebServlet(urlPatterns = {"/NovoSrv"})
public class NovoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PatrimonioJPADAO service;
	

	
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		String numero = req.getParameter("numero");
		String descricao = req.getParameter("descricao");
		String local = req.getParameter("local");
		String action = req.getParameter("action");
		
		if("new".equals(action)) {
			Patrimonio patrimonio = new Patrimonio(numero, descricao, local);
			service.save(patrimonio);
			
		}
		
		else {
			req.setAttribute("error", "dados inválidos!");
		}
		
		req.getRequestDispatcher("pages/home.jsp")
		.forward(req, resp);
		
	}
	
}
