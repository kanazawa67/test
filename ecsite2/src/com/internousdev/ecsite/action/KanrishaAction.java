package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class KanrishaAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String shohinFlg;
	private String shohinIchiranFlg;
	private String userFlg;
	private String userIchiranFlg;

	public String execute(){



		if(!(shohinFlg==null)){
		String result= "shohin";
		return result;
		}


		else if(!(shohinIchiranFlg==null)){
		String result="shohinIchiranFlg";
			return result;
		}


		else if(!(userFlg==null)){
		String result="userFlg";
			return result;
		}


		else if(!(userIchiranFlg==null)){


		}
		String result="userIchiranFlg";
		return result;
	}


	public String getShohinFlg(){
		return this.shohinFlg;
	}

	public void setShohinFlg(String shohinFlg){
		this.shohinFlg=shohinFlg;
	}

	public String getShohinIchiranFlg(){
		return this.shohinIchiranFlg;
	}

	public void setShohinIchiranFlg(String shohinIchiranFlg){
		this.shohinIchiranFlg=shohinIchiranFlg;
	}

	public String getUserFlg(){
		return this.userFlg;
	}

	public void setUserFlg(String userFlg){
		this.userFlg=userFlg;
	}

	public String getUserIchiranFlg(){
		return this.userIchiranFlg;
	}

	public void setUserIchiranFlg(String userIchiranFlg){
		this.userIchiranFlg=userIchiranFlg;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}



}