package com.example.exe1;

import com.example.exe1.customer.service.CalcInput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exe1Application {

	public static void main(String[] args) {
		SpringApplication.run(Exe1Application.class, args);
		System.out.println(ca.calc());
		System.out.println(ca1.calc());
	}


	static CalcInput ca = ()-> 8*9;

	static CalcInput ca1= new CalcInput() {
		@Override
		public int calc() {
			return 8*7;
		}
	};
}
