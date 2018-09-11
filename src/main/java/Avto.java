import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Adelya on 12.08.2018.
 */


@SpringBootApplication
@ComponentScan("avto")
public class Avto {
    public static void main(String[] args) {
        SpringApplication.run(Avto.class, args);
    }
}

