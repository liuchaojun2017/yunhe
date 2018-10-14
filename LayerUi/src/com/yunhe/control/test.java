package com.yunhe.control;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;

import com.google.gson.Gson;

public class test {
	public static void main(String[] args)
	{
		/*
		 题目: 将颜色数组 红色,绿色,蓝色 转成 JSON 字符串
		 */
		String[] colors={"红色","蓝色","绿色"};
		
		Map map = new HashMap<>();
		map.put("name", 10);
		// JSONArray 存入 colors 
		try
		{
			JSONArray jsonArray=new JSONArray(colors);
			System.out.println(jsonArray);
			System.out.println(jsonArray.toString());
			
		    Gson jsonArray1=new Gson();
		
			System.out.println(map);
			System.out.println(jsonArray1.toJson(map));
			
		} catch (JSONException e)
		{
			e.printStackTrace();
		}
	}


}
