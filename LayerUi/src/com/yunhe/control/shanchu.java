package com.yunhe.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.yunhe.daoImpl.DBookManagerImpl;

/**
 * Servlet implementation class shanchu
 */
@WebServlet("/shanchu")
public class shanchu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shanchu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id1 = request.getParameter("id");
	     System.out.println(id1);
	        response.setStatus(200);
	    
	        int x=   new DBookManagerImpl().shanchuByid(Integer.parseInt(id1));
	       

	        Map jsonObject = new HashMap();
	        jsonObject.put("state",x>0?true:false);
	        jsonObject.put("code",0);
	        jsonObject.put("msg","null");
	        
	        Gson gson = new Gson();
	        response.getWriter().print(gson.toJson(jsonObject));
		
	}

}
