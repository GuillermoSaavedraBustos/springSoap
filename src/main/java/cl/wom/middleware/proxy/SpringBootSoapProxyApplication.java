package cl.wom.middleware.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@ImportResource({"classpath:/spring-camel-context.xml"})
public class SpringBootSoapProxyApplication {
	
	@RequestMapping("/started")
    @ResponseBody
    String salidaHe() {
		return "servicio funcionando";
    }    
    
    @RequestMapping("/health")
    @ResponseBody
    String salidaLi() {
            return "UP";
    }

	public static void main(String[] args) {
		System.out.println("INICIANDO APLICACION");
		SpringApplication.run(SpringBootSoapProxyApplication.class, args);
	}
}