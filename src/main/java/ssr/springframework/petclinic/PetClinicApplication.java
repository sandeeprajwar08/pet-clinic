package ssr.springframework.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetClinicApplication {

	public static void main(String[] args) {

		System.out.println("PetClinicApplication starts...");
		SpringApplication.run(PetClinicApplication.class, args);
	}

}
