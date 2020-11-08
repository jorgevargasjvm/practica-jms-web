package com.vargas.PracticaJMSWeb;

import javax.annotation.PostConstruct;
import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.vargas.PracticaJMSWeb.models.Message;
import com.vargas.PracticaJMSWeb.services.MessageService;

@SpringBootApplication
public class PracticaJmsWebApplication {
	
	@Autowired
	private MessageService ms;

	public static void main(String[] args) {
		SpringApplication.run(PracticaJmsWebApplication.class, args);
	}
	
	@PostConstruct
    public void initBrokerConsumer() throws JMSException {
//		//broker
//		try {
//            BrokerService broker = new BrokerService();
//            broker.addConnector("tcp://0.0.0.0:5656");
//            broker.start();
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//		//Consumer
//		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("root", "1234", "failover:tcp://0.0.0.0:5656");
//		Connection connection = factory.createConnection();
//		connection.start();
//		
//		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//		
//		Topic topic = session.createTopic("sensors_reports");
//		MessageConsumer consumer = session.createConsumer(topic);
//		consumer.setMessageListener(message -> {
//            try {
//            	ObjectMapper om = new ObjectMapper();
//            	om.registerModule(new JavaTimeModule());
//                
//                TextMessage msg = (TextMessage) message;
//                Message msg1 = om.readValue(msg.getText(), Message.class);
//                ms.saveMessage(msg1);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
    }

}
