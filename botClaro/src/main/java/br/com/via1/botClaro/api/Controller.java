package br.com.via1.botClaro.api;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.via1.botClaro.csv.Csv;
import br.com.via1.botClaro.robo.Robo;

@RestController
public class Controller {

	@GetMapping("/teste")
	public String teste() throws InterruptedException {
		Robo robo = new Robo();
		robo.login();
		return "testando";
	}
	
	@GetMapping("/teste2")
	public String teste2() throws IOException {
		Csv csv = new Csv();
		csv.lerarquivo();
		return "testando";
	}
}
