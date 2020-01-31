package com.cos.springlegacy;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.springlegacy.dto.RequestJsonDto;
import com.google.gson.Gson;

@Controller
public class JsonController {
	
	// 스프링은 form의 name값 혹은 쿼리스트링만 오브젝트로 자동 변환!!
	@RequestMapping(value = "/jsonTest", method = RequestMethod.POST)
	public @ResponseBody RequestJsonDto jsonTest(@RequestBody RequestJsonDto requestJsonDto) { // {제이슨}
		
		System.out.println(requestJsonDto.getId());
		
		return requestJsonDto;
	}
	
	// http://localhost:8080/springlegacy/jsonHome/1
	@RequestMapping(value = "/jsonHome/{num}", method = RequestMethod.GET)
	public String jsonHome(@PathVariable int num) {
		
		System.out.println("num : "+num);
		return "jsonHome";
	}
}
