package net.ssln;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
//@ComponentScan(basePackages={"dao","service"})
//@MapperScan(value = "dao")
public class RunController {
	
	public static void main(String[] args) {
		SpringApplication.run(RunController.class, args);

	}

}
