package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ShohinIchiranDAO;
import com.internousdev.ecsite.dto.ShohinIchiranDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ShohinIchiranAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private ShohinIchiranDAO shohinIchiranDAO=new ShohinIchiranDAO();
	private ArrayList<ShohinIchiranDTO> shohinList=new ArrayList<ShohinIchiranDTO>();


	public String execute() throws SQLException{




	shohinList=shohinIchiranDAO.getShohinInfo();


	String result=SUCCESS;

	return result;
}



	public ArrayList<ShohinIchiranDTO>getShohinList(){
		return this.shohinList;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}


}
