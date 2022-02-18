package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	   @GetMapping("/demo/user/{id}")
	   public ResponseEntity<?> getUserInfoById(@PathVariable("id") String id){
		   HashMap<String, String> map = new HashMap<>();
		   map.put("id", id);
		   map.put("name", "jack");

	       return new ResponseEntity<>(map, HttpStatus.OK);
	   }
	   
	   @GetMapping("/demo/user/{id}/phone")
	   public ResponseEntity<?> getUserPhoneInfo(@PathVariable("id") String id){
		   HashMap<String, String> map = new HashMap<>();
		   map.put("id", id);
		   map.put("phone", "010-1234-1234");

	       return new ResponseEntity<>(map, HttpStatus.OK);
	   }
	   
	   @GetMapping("/demo/product/{id}")
	   public ResponseEntity<?> getUserProductInfo(@PathVariable("id") String id){
		   HashMap<String, String> map = new HashMap<>();
		   map.put("id", id);
		   map.put("name", "ABC");
		   map.put("price", "1000");

	       return new ResponseEntity<>(map, HttpStatus.OK);
	   }
	   
	   @GetMapping("/demo/visitor")
	   public ResponseEntity<?> getSitemap(){
		   HashMap<String, String> map = new HashMap<>();
		   map.put("vistor", "100");
		   
	       return new ResponseEntity<>(map, HttpStatus.OK);
	   }
}
