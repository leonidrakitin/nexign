package nexign.get;

import nexign.get.users.config.WebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GetApplication {

	public static void main(String[] args) {
		WebConfiguration webConfiguration = new WebConfiguration();
		SpringApplication.run(GetApplication.class, args);
	}

}
