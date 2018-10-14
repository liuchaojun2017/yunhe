package com.yunhe.dao;

import java.util.List;
import java.util.Map;

public interface DBookManager {
	public List<Map<String,String>> getBooks();
	
	public int shanchuByid(int id);
}
