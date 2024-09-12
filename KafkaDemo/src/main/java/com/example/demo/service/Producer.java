package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	@Autowired
	KafkaTemplate<String , String> kafkaTemplate;
	public void sendMessageToTopic(String message)
	{
		 kafkaTemplate.send("sujit_Topic", message);
		 System.out.println("user3");
		 System.out.println("sujit");
	}

}
