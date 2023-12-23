package org.pack1.test;

import java.io.IOException;




import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pack1.beans.CreateUser;
import org.pack1.beans.UserRegistry;



public class AppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserRegistry user1 = new UserRegistry(username, password);
		CreateUser creation_valide = new CreateUser();
		creation_valide.addUser(user1);
		creation_valide.afficher_nombre_user();
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/creationUserValid.jsp").forward(request, response);


	}

}
