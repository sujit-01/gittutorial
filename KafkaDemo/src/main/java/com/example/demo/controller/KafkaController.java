package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Producer;

@RestController
@RequestMapping("/home")
public class KafkaController {
	@Autowired
	Producer producer;
	@GetMapping("/producerMsg")
	public void sendMsg(@RequestParam("message") String message)
	{
	producer.sendMessageToTopic(message);	
	}

}
