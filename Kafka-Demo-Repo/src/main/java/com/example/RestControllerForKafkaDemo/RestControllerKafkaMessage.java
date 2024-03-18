package com.example.RestControllerForKafkaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.Producer;

@RestController
@RequestMapping("/kafka")
public class RestControllerKafkaMessage {
	
	@Autowired
	Producer producer;
	
	@GetMapping("/producerMessage")
	public void getMessageFromClient(@RequestParam("message")String message) {
		producer.sendMessageToTopic(message);
	}

}
