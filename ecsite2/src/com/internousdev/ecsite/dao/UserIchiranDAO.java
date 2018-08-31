package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserIchiranDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserIchiranDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	public ArrayList<UserIchiranDTO> getUserInfo() throws SQLException{
		ArrayList<UserIchiranDTO> userIchiranDTO=new ArrayList<UserIchiranDTO>();
		String sql=
				"SELECT "
				+ "* "

				+ "FROM "
				+ "login_user_transaction "

				+ "ORDER BY "
				+ "id DESC";


				try{
					PreparedStatement preparedStatement=connection.prepareStatement(sql);

					ResultSet resultSet=preparedStatement.executeQuery();

					while(resultSet.next()){
						UserIchiranDTO dto=new UserIchiranDTO();
						dto.setId(resultSet.getString("id"));
						dto.setLoginId(resultSet.getString("login_id"));
						dto.setLoginPass(resultSet.getString("login_pass"));
						dto.setUserName(resultSet.getString("user_name"));
						dto.setInsert_date(resultSet.getString("insert_date"));
						dto.setUpdated_date(resultSet.getString("updated_date"));
						userIchiranDTO.add(dto);
				}
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					connection.close();
				}
				return userIchiranDTO;
	}

	}





