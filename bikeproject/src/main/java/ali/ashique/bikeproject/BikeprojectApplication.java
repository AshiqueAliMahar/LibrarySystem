package ali.ashique.bikeproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
@Scope("ali")
public class BikeprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BikeprojectApplication.class, args);
    }

}
