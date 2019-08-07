package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.bean.Novel;
import com.neuedu.model.service.FtService;
@Controller
public class FtController {

	@Autowired
	private FtService ftService;
	@RequestMapping("selectXuanhuan1")
	@ResponseBody
	public List<Novel> selectXuanhuan1(){
		return ftService.selectXuanhuan1();
	}
	
	@RequestMapping("selectXuanhuan2")
	@ResponseBody
	public List<Novel> selectXuanhuan2(){
		return ftService.selectXuanhuan1();
	}
	
	@RequestMapping("selectXuanhuan3")
	@ResponseBody
	public List<Novel> selectXuanhuan3(){
		return ftService.selectXuanhuan1();
	}
}
