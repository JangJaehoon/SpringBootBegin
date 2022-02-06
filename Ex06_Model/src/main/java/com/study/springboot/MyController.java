package com.study.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "Model & View";		
	}
	
	@RequestMapping("/test1")	
	public String test1(Model model) {
	// Model객체를 이용해, view로 Data 전달. 데이터만 설정이 가능			
		model.addAttribute("name", "HongGilDong");		
		return "test1";
	}
	
	@RequestMapping("/mv") // mv로 url호출이 들어오면 test2 method실행
	public ModelAndView test2() {
		// 데이터와 뷰를 동시에 설정 가능.
		// ModelAndView라는 객체 변수를 만들어 데이터 정보를 추가하고
		// view정보까지 담아 객체 자체를 리턴한다.
		ModelAndView mv = new ModelAndView();
		
		List<String> list = new ArrayList<>();
		
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		mv.addObject("lists", list); // jstl로 호출
		mv.addObject("ObjectTest", "It is test"); // jstl로 호출
		mv.addObject("name", "HongGilDong"); // jstl로 호출
		mv.setViewName("view/myView");
		
		return mv;
	}
	
}
