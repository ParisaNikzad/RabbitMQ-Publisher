package com.pn.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqApplication implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		rabbitTemplate.convertAndSend("first message from code, This is from default exchange! None of the ques will receive this");
		rabbitTemplate.convertAndSend("TestExchange", "testRouting", "Message from code to TestExchange which will get to the queues that are binded to TestExchange by testRouting as routing key!");

		Employee employee = new Employee();
		employee.setName("Parisa");
		employee.setTitle("SoftwareEngineer");
		rabbitTemplate.convertAndSend("TestExchange","testRouting", employee);
	}
}
