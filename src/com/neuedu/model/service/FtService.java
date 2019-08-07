package com.neuedu.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.model.bean.Novel;
import com.neuedu.model.mapper.FtMapper;
@Service
public class FtService {

	@Autowired
	private FtMapper ftMapper;
	public List<Novel> selectXuanhuan1(){
		return ftMapper.selectXuanhuan1();
	}
	
	public List<Novel> selectXuanhuan2(){
		return ftMapper.selectXuanhuan2();
	}
	
	public List<Novel> selectXuanhuan3(){
		return ftMapper.selectXuanhuan3();
	}
	
}
