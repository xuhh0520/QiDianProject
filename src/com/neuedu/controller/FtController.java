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
		return ftService.selectXuanhuan2();
	}
	
	@RequestMapping("selectXuanhuan3")
	@ResponseBody
	public List<Novel> selectXuanhuan3(){
		return ftService.selectXuanhuan3();
	}
	
	@RequestMapping("selectDushi1")
	@ResponseBody
	public List<Novel> selectDushi1(){
		return ftService.selectDushi1();
	}
	
	@RequestMapping("selectDushi2")
	@ResponseBody
	public List<Novel> selectDushi2(){
		return ftService.selectDushi2();
	}
	
	@RequestMapping("selectDushi3")
	@ResponseBody
	public List<Novel> selectDushi3(){
		return ftService.selectDushi3();
	}
	
	@RequestMapping("selectJunshi1")
	@ResponseBody
	public List<Novel> selectJunshi1(){
		return ftService.selectJunshi1();
	}
	
	@RequestMapping("selectJunshi2")
	@ResponseBody
	public List<Novel> selectJunshi2(){
		return ftService.selectJunshi2();
	}
	
	@RequestMapping("selectJunshi3")
	@ResponseBody
	public List<Novel> selectJunshi3(){
		return ftService.selectJunshi3();
	}
	
	@RequestMapping("selectKehuan1")
	@ResponseBody
	public List<Novel> selectKehuan1(){
		return ftService.selectKehuan1();
	}
	
	@RequestMapping("selectKehuan2")
	@ResponseBody
	public List<Novel> selectKehuan2(){
		return ftService.selectKehuan2();
	}
	
	@RequestMapping("selectKehuan3")
	@ResponseBody
	public List<Novel> selectKehuan3(){
		return ftService.selectKehuan3();
	}
	
	@RequestMapping("selectLishi1")
	@ResponseBody
	public List<Novel> selectLishi1(){
		return ftService.selectLishi1();
	}
	
	@RequestMapping("selectLishi2")
	@ResponseBody
	public List<Novel> selectLishi2(){
		return ftService.selectLishi2();
	}
	
	@RequestMapping("selectLishi3")
	@ResponseBody
	public List<Novel> selectLishi3(){
		return ftService.selectLishi3();
	}
	
	@RequestMapping("selectQihuan1")
	@ResponseBody
	public List<Novel> selectQihuan1(){
		return ftService.selectQihuan1();
	}
	
	@RequestMapping("selectQihuan2")
	@ResponseBody
	public List<Novel> selectQihuan2(){
		return ftService.selectQihuan2();
	}
	
	@RequestMapping("selectQihuan3")
	@ResponseBody
	public List<Novel> selectQihuan3(){
		return ftService.selectQihuan3();
	}
	
	@RequestMapping("selectXuanhuan1")
	@ResponseBody
	public List<Novel> selectTiyu1(){
		return ftService.selectTiyu1();
	}
	
	@RequestMapping("selectTiyu2")
	@ResponseBody
	public List<Novel> selectTiyu2(){
		return ftService.selectTiyu2();
	}
	
	@RequestMapping("selectTiyu3")
	@ResponseBody
	public List<Novel> selectTiyu3(){
		return ftService.selectTiyu3();
	}
	
	@RequestMapping("selectWuxia1")
	@ResponseBody
	public List<Novel> selectWuxia1(){
		return ftService.selectWuxia1();
	}
	
	@RequestMapping("selectWuxia2")
	@ResponseBody
	public List<Novel> selectWuxia2(){
		return ftService.selectWuxia2();
	}
	
	@RequestMapping("selectWuxia3")
	@ResponseBody
	public List<Novel> selectWuxia3(){
		return ftService.selectWuxia3();
	}
	
	@RequestMapping("selectXuanhuan1")
	@ResponseBody
	public List<Novel> selectXianshi1(){
		return ftService.selectXianshi1();
	}
	
	@RequestMapping("selectXianshi2")
	@ResponseBody
	public List<Novel> selectXianshi2(){
		return ftService.selectXianshi2();
	}
	
	@RequestMapping("selectXianshi")
	@ResponseBody
	public List<Novel> selectXianshi3(){
		return ftService.selectXianshi3();
	}
	
	@RequestMapping("selectXianxia1")
	@ResponseBody
	public List<Novel> selectXianxia1(){
		return ftService.selectXianxia1();
	}
	
	@RequestMapping("selectXianxia2")
	@ResponseBody
	public List<Novel> selectXianxia2(){
		return ftService.selectXianxia2();
	}
	
	@RequestMapping("selectXianxia3")
	@ResponseBody
	public List<Novel> selectXianxia3(){
		return ftService.selectXianxia3();
	}
	
	@RequestMapping("selectXuanyi1")
	@ResponseBody
	public List<Novel> selectXuanyi1(){
		return ftService.selectXuanyi1();
	}
	
	@RequestMapping("selectXuanyi2")
	@ResponseBody
	public List<Novel> selectXuanyi2(){
		return ftService.selectXuanyi2();
	}
	
	@RequestMapping("selectXuanyi3")
	@ResponseBody
	public List<Novel> selectXuanyi3(){
		return ftService.selectXuanyi3();
	}
	
	@RequestMapping("selectYouxi1")
	@ResponseBody
	public List<Novel> selectYouxi1(){
		return ftService.selectYouxi1();
	}
	
	@RequestMapping("selectYouxi2")
	@ResponseBody
	public List<Novel> selectYouxi2(){
		return ftService.selectYouxi2();
	}
	
	@RequestMapping("selectYouxi3")
	@ResponseBody
	public List<Novel> selectYouxi3(){
		return ftService.selectYouxi3();
	}
}
