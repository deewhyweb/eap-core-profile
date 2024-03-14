package dukes.greeting;

import jakarta.enterprise.context.RequestScoped;
import java.time.LocalDate;
// The GreetingService should be a request scoped CDI bean
@RequestScoped
public class GreetingService {

    public GreetingRecord getGreeting() {
        return new GreetingRecord("hello", LocalDate.now());
    }
}
