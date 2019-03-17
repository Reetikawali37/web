package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Babysitter;
import com.bean.Toddler;
import com.bean.view;
import com.service.DaycareService;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String act = request.getParameter("action");
		
		 if(act.equalsIgnoreCase("register")){
			 ArrayList <Babysitter> Bslist = new  ArrayList <Babysitter>();
			 DaycareService ds= new DaycareService();
			 Bslist=ds.fetchallbs();
			 request.setAttribute("Bslist1",Bslist );
			 RequestDispatcher rd= request.getRequestDispatcher("register.jsp");
			 rd.forward(request, response);
			 
			 
		 }
		 
		 
		 if(act.equalsIgnoreCase("view")){
			ArrayList<view> viewlist = new ArrayList<view>();
			 DaycareService ds= new DaycareService();
			 viewlist=ds.fechalldetails();
			 request.setAttribute("viewlist1",viewlist );
			 RequestDispatcher rd= request.getRequestDispatcher("view.jsp");
			 rd.forward(request, response);
			 
			 
		 }
		 
		 
		 
		 if(act.equalsIgnoreCase("home")){
			 RequestDispatcher rd= request.getRequestDispatcher("index.html");
			 rd.forward(request, response);
		 }
		 if(act.equalsIgnoreCase("update")){
			 int tid = Integer.parseInt(request.getParameter("todid"));
			 DaycareService ds= new DaycareService();
			 Toddler t =new Toddler();
			
			t= ds.gettoddetails(tid);
			
			 request.setAttribute("tod1",t );
			 RequestDispatcher rd= request.getRequestDispatcher("update.jsp");
			 rd.forward(request, response);
			 
			 
		 }
		 
		 if(act.equalsIgnoreCase("delete")){
			 int tid = Integer.parseInt(request.getParameter("todid"));
			 DaycareService ds= new DaycareService();
			
			boolean check=false;
			check= ds.deletetod(tid);
			
			if(check){
				RequestDispatcher rd= request.getRequestDispatcher("success.html");
				 rd.forward(request, response);	
			}
			 
			 
			 
		 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String act = request.getParameter("form1");
		if(act.equalsIgnoreCase("registertod")){
			int todid=Integer.parseInt(request.getParameter("tdid"));
			String todname=request.getParameter("tdname");
			int todage=Integer.parseInt(request.getParameter("tdage"));
			int bsid=Integer.parseInt(request.getParameter("bsid"));
			boolean check=false;
			 DaycareService ds= new DaycareService();
			 check=ds.registertod(todid,todname,todage,bsid);
			 if(check){
				 RequestDispatcher rd= request.getRequestDispatcher("success.html");
				 rd.forward(request, response);
			 }
	
		}
		if(act.equalsIgnoreCase("updatetod")){
			int todid=Integer.parseInt(request.getParameter("tdid"));
			String todname=request.getParameter("tdname");
			int todage=Integer.parseInt(request.getParameter("tdage"));
			int bsid=Integer.parseInt(request.getParameter("bsid"));
			boolean check=false;
			 DaycareService ds= new DaycareService();
			 check=ds.updatetod(todid,todname,todage,bsid);
			 if(check){
				 RequestDispatcher rd= request.getRequestDispatcher("success.html");
				 rd.forward(request, response);
		}
		
	}
		
		

	}
}
