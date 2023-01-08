package com.ssg.ssg_be.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "테스트 API")
@RestController
@RequestMapping("/test")
public class testRestController {

	@ApiOperation("테스트 문구 출력")
	@GetMapping("")
	public ResponseEntity<String> getTestText(@RequestParam(name = "text") String text) {
		return ResponseEntity.ok(text);
	}

}
