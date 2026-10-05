package cl.duoc.rabbitmq_tutorial.config;
import java.util.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class RabbitMQConfig {
    public static final String QUEUE_NAME="hello";
    
    @Bean 
    public Queue helloQueue() {
        return new Queue(QUEUE_NAME, true); //false significa que no durara en el tiempo
    }
}
