package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	@KafkaListener(topics="sujit_Topic", groupId="sujit_grp")
	public void listenToTopic(String recievedMsg)
	{
	System.out.println("recieved message"+ recievedMsg);
	System.out.println("user3");
	System.out.println("new meesage for kafka");
	}

}
