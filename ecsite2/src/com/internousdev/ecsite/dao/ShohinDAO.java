package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ShohinDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ShohinDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	public ArrayList<ShohinDTO> getShohinInfo
		(String id,String item_name)throws SQLException{
		ArrayList<ShohinDTO> shohinDTO=new ArrayList<ShohinDTO>();
		String sql=
				"SELECT "
				+ "ubit.id,iit.item_name,ubit.item_stock, "
				+ "ubit.insert_date "

				+ "FROM "
				+ "item_info_transaction "

				+ "WHERE "
				+ "ubit.item_transaction_id =? AND ubit.user_master_id=? "

				+ "ORDER BY "
				+ "id DESC";


				try{
					PreparedStatement preparedStatement=connection.prepareStatement(sql);
					preparedStatement.setString(1, id);
					preparedStatement.setString(2, item_name);

					ResultSet resultSet=preparedStatement.executeQuery();

					while(resultSet.next()){
						ShohinDTO dto=new ShohinDTO();
						dto.setId(resultSet.getString("id"));
						dto.setItemName(resultSet.getString("item_name"));
						dto.setItemPrice(resultSet.getString("item_price"));
						dto.setItemStock(resultSet.getString("item_stock"));
						dto.setInsert_date(resultSet.getString("insert_date"));
						shohinDTO.add(dto);
				}
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					connection.close();
				}
				return shohinDTO;
	}

	}



