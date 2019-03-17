package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Babysitter;
import com.bean.Toddler;
import com.bean.view;
import com.dbutil.DBUtil;

public class Daydao {
	Connection con=null;
	PreparedStatement ps= null;
	ResultSet rs=null;

	public ArrayList<Babysitter> fetchallbs() {
		// TODO Auto-generated method stub
		ArrayList<Babysitter> bslist =new ArrayList<Babysitter>();
		
		con=DBUtil.getConnection();
		String q= "Select * from Babysitter where bsstatus=?";
		try {
			ps=con.prepareStatement(q);
			ps.setString(1, "Inactive");
			rs=ps.executeQuery();
			while(rs.next()){
				Babysitter b =new Babysitter(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6));
				bslist.add(b);
//				System.out.println("baby");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return bslist;
	}

	public boolean registertod(int todid, String todname, int todage, int bsid) {
		// TODO Auto-generated method stub
		int rowinsert=0;
		con=DBUtil.getConnection();
		String q= "insert into toddler values (?,?,?,?)";
		try {
			ps=con.prepareStatement(q);
			ps.setInt(1, todid);
			ps.setString(2, todname);
			ps.setInt(3, todage);
			ps.setInt(4, bsid);
			rowinsert=ps.executeUpdate();
			if(rowinsert>0)
			{
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	public ArrayList<view> fechalldetails() {
		ArrayList<view> vlist =new ArrayList<view>();
		
		con=DBUtil.getConnection();
		String q= "select * from  Toddler join BABYSITTER on BABYSITTER.BSID=Toddler.BSID ";
		try {
			ps=con.prepareStatement(q);
			rs=ps.executeQuery();
			while(rs.next()){
				
				view v =new view (rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getString(10));

				vlist.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vlist;
	}

	public Toddler gettoddetails(int tid) {
		// TODO Auto-generated method stub
		con=DBUtil.getConnection();
		String q= "select * from  Toddler where  Toddlerid=?";
		try {
			ps=con.prepareStatement(q);
			ps.setInt(1, tid);
			rs=ps.executeQuery();
			while(rs.next()){
				Toddler t = new Toddler(rs.getInt(1),rs.getString(2),rs.getInt(3));
				t.setBsid(rs.getInt(4));
				return t;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return null;
	}

	public boolean updatetod(int todid, String todname, int todage, int bsid) {
		int rowinsert=0;
		con=DBUtil.getConnection();
		String q= "update Toddler set Toddlername=? , Toddlerage=? where Toddlerid=?";
		try {
			ps=con.prepareStatement(q);
			ps.setInt(3, todid);
			ps.setString(1, todname);
			ps.setInt(2, todage);
		
			rowinsert=ps.executeUpdate();
			if(rowinsert>0)
			{
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	public boolean deletetod(int tid) {
		int rowinsert=0;
		con=DBUtil.getConnection();
		String q= "delete from Toddler  where Toddlerid=?";
		try {
			ps=con.prepareStatement(q);
			ps.setInt(1, tid);
			
		
			rowinsert=ps.executeUpdate();
			if(rowinsert>0)
			{
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

}
