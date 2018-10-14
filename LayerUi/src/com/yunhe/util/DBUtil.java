package com.yunhe.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public final class DBUtil {
	// ����
	private String driver = "com.mysql.jdbc.Driver";
	// ���ӵ�ַ ������֧�����������
	private String url = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf-8";
	// �����û���
	private String username = "root";
	// ����
	private String password = "admin";

	/**
	 * ������������������
	 * @return
	 */
	public Connection getConn() {
		
		Connection conn = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}


	public int execUpdate(String sql, Object[] obj) {
		int nu=0;
		Connection conn = this.getConn();

		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(sql);

			
			if (obj != null) {
				
				for (int i = 0; i < obj.length; i++) {
					ps.setObject(i + 1, obj[i]);
				}
			}
			nu= ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		
		finally {
			
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return nu;

	}

	
	public List<Map<String, String>> exexQuery(String sql, Object[] obj)
			 {
		
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();

		PreparedStatement ps = null;

		Connection conn = this.getConn();
		
		ResultSet rs = null;


		try {
			ps = conn.prepareStatement(sql);

	
			if (obj != null) {
				for (int i = 0; i < obj.length; i++) {
					ps.setObject(i + 1, obj[i]);
				}
			}
			
			rs = ps.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();

			
			while (rs.next()) {
			
				Map<String, String> map = new HashMap<String, String>();

				for (int i = 1; i <= rsmd.getColumnCount();i++) {
					
					map.put(rsmd.getColumnName(i), rs.getString(i));
				}
				
				list.add(map);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		finally {
				try {
					if (rs != null) {
						rs.close();
					}
					if (ps != null) {
						ps.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return list;
	}
}
