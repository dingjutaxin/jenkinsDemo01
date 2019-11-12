package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class DemoController {
	@RequestMapping("/")
	private void testIndex(HttpServletRequest request,HttpServletResponse response) throws IOException {
		log.info("测试docker+Jenkins自动化部署开始！！");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		String textString = "这个是测试docker+Jenkins自动化部署的！！";
		writer.print(textString);
		writer.close();
		log.info("测试docker+Jenkins自动化部署结束！！！");
	}

}
