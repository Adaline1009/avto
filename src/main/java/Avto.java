import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Adelya on 12.08.2018.
 */

@ComponentScan("avto")
    @SpringBootApplication
    public class Avto {
        public static void main(String[] args) {
            SpringApplication.run(Avto.class, args);
    }
}

