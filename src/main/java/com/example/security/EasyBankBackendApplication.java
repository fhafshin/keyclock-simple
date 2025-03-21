package com.example.security;

import com.example.security.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
//@EntityScan("com.example.security")
//@EnableJpaRepositories("com.example.security")
//@EnableWebSecurity(debug = true)
@EnableMethodSecurity(jsr250Enabled = true,securedEnabled = true)
public class EasyBankBackendApplication implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public EasyBankBackendApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(EasyBankBackendApplication.class, args);
    }

    /**
     * @param args incoming main method arguments
     * @throws Exception
     */
    @Transactional
    @Override
    public void run(String... args) throws Exception {
//        Customer admin = new Customer();
//        admin.setEmail("admin@email.com");
//        admin.setPwd(new CustomEncodePassword().encode("123"));
//        admin.setRole("admin");
//        Customer user = new Customer();
//        user.setEmail("user@email.com");
//        user.setPwd(new CustomEncodePassword().encode("123"));
//        user.setRole("read");
//
//        customerRepository.save(admin);
//        customerRepository.save(user);



    }
}
