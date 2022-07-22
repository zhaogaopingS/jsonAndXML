package geektime.demo;

import model.Coffee;
import model.CoffeeOrder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@SpringBootApplication
@Controller
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@RequestMapping("/helloJson")
	public @ResponseBody Coffee helloJson() {
		return new Coffee();
	}

    @RequestMapping("/helloXml")
    public CoffeeOrder helloXml() {
        return new CoffeeOrder();
    }
}

