package deewhyweb.greeting;

import jakarta.enterprise.context.RequestScoped;


@RequestScoped
public class GreetingService {

    public String getGreeting() {

        return "Hello, World";
    }
}