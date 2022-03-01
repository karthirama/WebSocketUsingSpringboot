package com.rama.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
//@CrossOrigin(origins="*",allowedHeaders = "*")
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{
	
	 @Override
	    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
	        stompEndpointRegistry.addEndpoint("/socket")
	        //.setAllowedOrigins("*")
	                .withSockJS();
	    }

	    @Override
	    public void configureMessageBroker(MessageBrokerRegistry registry) {
	        registry.enableSimpleBroker("/topic");
	        registry.setApplicationDestinationPrefixes("/app");
	    }
	    
}
