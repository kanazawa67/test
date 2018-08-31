package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserIchiranDAO;
import com.internousdev.ecsite.dto.UserIchiranDTO;
import com.opensymphony.xwork2.ActionSupport;


public class UserIchiranAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private UserIchiranDAO userIchiranDAO=new UserIchiranDAO();
	private ArrayList<UserIchiranDTO> userList=new ArrayList<UserIchiranDTO>();


	public String execute() throws SQLException{

	userList=userIchiranDAO.getUserInfo();


	String result=SUCCESS;

	return result;
}



	public ArrayList<UserIchiranDTO>getUserList(){
		return this.userList;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}


}

