package dev.learningspringboot.runnerz;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcomeMessage() {return "Welcome to Spring Application";};

}
