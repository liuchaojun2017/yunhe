package com.yunhe.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;

import com.google.gson.Gson;
import com.yunhe.daoImpl.DBookManagerImpl;
import com.yunhe.service.SBookManager;

public class SBookManagerImpl implements SBookManager {

	@Override
	public String getBooks() {
		
		List<Map<String,String>> list = new DBookManagerImpl().getBooks();
		
		 Gson gson = new Gson();
		 
		 String jsonStr = gson.toJson(list);
		 
		   /* JSONArray jsonArray=new JSONArray(jsonStr);
			System.out.println(jsonArray.toString());*/
		
			
		 Map map  = new HashMap<String,String>();
		 map.put("code", 0);
		 map.put("msg", "数据展示");
		 map.put("count", 2);
		 map.put("data", list);
		 
		String stu = new Gson().toJson(map);
		System.out.println(stu);
		 return stu;
		
	}

}
