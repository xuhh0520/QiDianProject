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
	
	public List<Novel> selectDushi1(){
		return ftMapper.selectDushi1();
	}
	
	public List<Novel> selectDushi2(){
		return ftMapper.selectDushi2();
	}
	
	public List<Novel> selectDushi3(){
		return ftMapper.selectDushi3();
	}
	
	public List<Novel> selectJunshi1(){
		return ftMapper.selectJunshi1();
	}
	
	public List<Novel> selectJunshi2(){
		return ftMapper.selectJunshi2();
	}
	
	public List<Novel> selectJunshi3(){
		return ftMapper.selectJunshi3();
	}
	
	public List<Novel> selectKehuan1(){
		return ftMapper.selectKehuan1();
	}
	
	public List<Novel> selectKehuan2(){
		return ftMapper.selectKehuan2();
	}
	
	public List<Novel> selectKehuan3(){
		return ftMapper.selectKehuan3();
	}
	
	public List<Novel> selectLishi1(){
		return ftMapper.selectLishi1();
	}
	
	public List<Novel> selectLishi2(){
		return ftMapper.selectLishi2();
	}
	
	public List<Novel> selectLishi3(){
		return ftMapper.selectLishi3();
	}
	
	public List<Novel> selectQihuan1(){
		return ftMapper.selectQihuan1();
	}
	
	public List<Novel> selectQihuan2(){
		return ftMapper.selectQihuan2();
	}
	
	public List<Novel> selectQihuan3(){
		return ftMapper.selectQihuan3();
	}
	
	public List<Novel> selectTiyu1(){
		return ftMapper.selectTiyu1();
	}
	
	public List<Novel> selectTiyu2(){
		return ftMapper.selectTiyu2();
	}
	
	public List<Novel> selectTiyu3(){
		return ftMapper.selectTiyu3();
	}
	
	public List<Novel> selectWuxia1(){
		return ftMapper.selectWuxia1();
	}
	
	public List<Novel> selectWuxia2(){
		return ftMapper.selectWuxia2();
	}
	
	public List<Novel> selectWuxia3(){
		return ftMapper.selectWuxia3();
	}
	
	public List<Novel> selectXianshi1(){
		return ftMapper.selectXianshi1();
	}
	
	public List<Novel> selectXianshi2(){
		return ftMapper.selectXianshi2();
	}
	
	public List<Novel> selectXianshi3(){
		return ftMapper.selectXianshi3();
	}
	
	public List<Novel> selectXianxia1(){
		return ftMapper.selectXianxia1();
	}
	
	public List<Novel> selectXianxia2(){
		return ftMapper.selectXianxia2();
	}
	
	public List<Novel> selectXianxia3(){
		return ftMapper.selectXianxia3();
	}	
	
	public List<Novel> selectXuanyi1(){
		return ftMapper.selectXuanyi1();
	}
	
	public List<Novel> selectXuanyi2(){
		return ftMapper.selectXuanyi2();
	}
	
	public List<Novel> selectXuanyi3(){
		return ftMapper.selectXuanyi3();
	}
	
	public List<Novel> selectYouxi1(){
		return ftMapper.selectYouxi1();
	}
	
	public List<Novel> selectYouxi2(){
		return ftMapper.selectYouxi2();
	}
	
	public List<Novel> selectYouxi3(){
		return ftMapper.selectYouxi3();
	}
}
