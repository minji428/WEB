package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tiles")
public class TilesController {

	@RequestMapping(value="/content1")
	public String content1() {
		// return 대상은 jsp파일이 아닌
		// tiles설정 xml파일의 definition 태그의 name속성의 value로 매칭
		return "tiles/content1";
	}
	
	@RequestMapping(value="/content2")
	public String content2() {
		return "tiles/content2";
	}
	
	@RequestMapping(value="/content3")
	public String content3() {
		return "tiles/content3";
	}
	
	
}




