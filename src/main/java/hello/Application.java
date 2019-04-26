package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner loadData(CustomerRepository repository) {
		return (args) -> {

			long count = repository.count();
			log.info("Found " + count + " customers");

			if(count == 0) {
				log.info("Database is empty. Population it with some examples.");
				// save a couple of customers
				repository.save(new Customer("jack@bauer.com", "Jack", "Bauer"));
				repository.save(new Customer("chloe@obrian.com", "Chloe", "O'Brian"));
				repository.save(new Customer("kim@bauer.com", "Kim", "Bauer"));
				repository.save(new Customer("david@palmer.com", "David", "Palmer"));
				repository.save(new Customer("michelle@dessler.com", "Michelle", "Dessler"));
				repository.save(new Customer("david@langheiter.com", "David", "Langheiter", LocalDate.of(2000, Calendar.APRIL, 30)));
			}
		};
	}

}
