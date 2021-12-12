package com.spring.di;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DI_Ex03 {

	// servlet-context.xml 파일 및 컴포넌트 스캔 방식사용시 특정 선언문을 작성하지 않는다.
	@Autowired
	DiSampleClass1 diSampleClass1_1;
	
	@Inject
	DiSampleClass1 diSampleClass1_2;
	
	@Resource(name="resourceTester")
	DiSampleClass1 diSampleClass1_3;
	
	
	@Autowired
	DiSampleClass2 diSampleClass2_1;
	
	@Autowired
	DiSampleClass2 diSampleClass2_2;
	
	@Autowired
	DiSampleClass2 diSampleClass2_3;
	
	@Autowired
	DiSampleClass3 diSampleClass3;
	
	
	@RequestMapping(value="/diEx03")
	public String diEx03() {
		
		diSampleClass1_1.printInfo();
		diSampleClass1_2.printInfo();
		diSampleClass1_3.printInfo();
		
		System.out.println();
		
		diSampleClass2_1.print();
		diSampleClass2_2.print();
		diSampleClass2_3.print();
		
		System.out.println();
		
		List<String> t3List = diSampleClass3.getTestList();
		for (String data : t3List) {
			System.out.println(data);
		}
		System.out.println();
		
		Map<String , String> t3Map = diSampleClass3.getTestMap();
		for(String key : t3Map.keySet()) {
			System.out.println(key + " : " +   t3Map.get(key));
		}
		System.out.println();
		
		Map<String , DiSampleClass1> t3MapObj = diSampleClass3.getTestMapObj();

		for (String key : t3MapObj.keySet()) {
			t3MapObj.get(key).printInfo();
		}
		
		
		
		
		return "home";
	}

	
	
	
	
	
}
