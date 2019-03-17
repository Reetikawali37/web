package com.service;

import java.util.ArrayList;

import com.bean.Babysitter;
import com.bean.Toddler;
import com.bean.view;
import com.dao.Daydao;

public class DaycareService {

	Daydao dd= new Daydao();

	public ArrayList<Babysitter> fetchallbs() {
		// TODO Auto-generated method stub
	
		return dd.fetchallbs();
	}

	public boolean registertod(int todid, String todname, int todage, int bsid) {
		// TODO Auto-generated method stub
		return dd.registertod( todid,  todname,  todage,  bsid);
	}

	public ArrayList<view> fechalldetails() {
		// TODO Auto-generated method stub
		return dd.fechalldetails();
	}

	public Toddler gettoddetails(int tid) {
		// TODO Auto-generated method stub
		return dd.gettoddetails(tid);
	}

	public boolean updatetod(int todid, String todname, int todage, int bsid) {
		// TODO Auto-generated method stub
		return dd.updatetod(todid,todname,todage,bsid);
	}

	public boolean deletetod(int tid) {
		// TODO Auto-generated method stub
		return dd.deletetod(tid);
	}

	
	
	
}
