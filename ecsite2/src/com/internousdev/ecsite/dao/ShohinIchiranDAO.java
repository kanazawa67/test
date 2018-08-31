package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ShohinIchiranDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ShohinIchiranDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	public ArrayList<ShohinIchiranDTO> getShohinInfo()throws SQLException{
		ArrayList<ShohinIchiranDTO> shohinIchiranDTO=new ArrayList<ShohinIchiranDTO>();
		String sql=
				"SELECT "
				+ "* "

				+ "FROM "
				+ "item_info_transaction "

				+ "ORDER BY "
				+ "id DESC";


				try{
					PreparedStatement preparedStatement=connection.prepareStatement(sql);

					ResultSet resultSet=preparedStatement.executeQuery();

					while(resultSet.next()){
						ShohinIchiranDTO dto=new ShohinIchiranDTO();
						dto.setId(resultSet.getString("id"));
						dto.setItemName(resultSet.getString("item_name"));
						dto.setItemPrice(resultSet.getString("item_price"));
						dto.setItemStock(resultSet.getString("item_stock"));
						dto.setInsert_date(resultSet.getString("insert_date"));
						dto.setUpdate_date(resultSet.getString("update_date"));
						shohinIchiranDTO.add(dto);
				}
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					connection.close();
				}
				return shohinIchiranDTO;
	}

	}




