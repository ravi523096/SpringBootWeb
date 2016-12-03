package in.ravikalla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerApplication {

//	http://localhost:8001/SpringCloud-client/default
//	http://localhost:8001/SpringCloud-client/northamerica
//	http://localhost:8001/SpringCloud-client/southamerica
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}
}
