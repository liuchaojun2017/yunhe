package com.yunhe.daoImpl;

import java.util.List;
import java.util.Map;

import com.yunhe.dao.DBookManager;
import com.yunhe.util.DBUtil;

public class DBookManagerImpl implements DBookManager {

	@Override
	public List<Map<String, String>> getBooks() {
		// TODO Auto-generated method stub
		String sql ="select * from Book";
		
		return new DBUtil().exexQuery(sql, null);
		
	}

	@Override
	public int shanchuByid(int id) {
		// TODO Auto-generated method stub
		String sql="delete from Book where Book_id=?";
		Object[] obj={id};
		
		return new DBUtil().execUpdate(sql, obj);
	}

}
