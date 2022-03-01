package com.rama.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.rama.websocket.model.UserResponse;
import com.rama.websocket.model.User;

@Controller
public class WebSocketController {
	
	@MessageMapping("/hello")
    @SendTo("/topic/user")
    public UserResponse getUser(User user) {
        return new UserResponse("Hello "+user.getName());
    }

}
