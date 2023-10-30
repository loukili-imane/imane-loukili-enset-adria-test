package loukili.imane.walletservice;

import loukili.imane.walletservice.entities.Client;
import loukili.imane.walletservice.entities.Wallet;
import loukili.imane.walletservice.repositories.ClientRepository;
import loukili.imane.walletservice.repositories.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(WalletRepository walletRepository,
							ClientRepository clientRepository,
							RepositoryRestConfiguration repositoryRestConfiguration){
		repositoryRestConfiguration.exposeIdsFor(Wallet.class);
		return args -> {
			Client c1 = clientRepository.save(new Client(null,"imane","imane@gmail.com",null));
			Client c2 = clientRepository.save(new Client(null,"hala","hala@gmail.com",null));

			walletRepository.save(new Wallet(UUID.randomUUID(),5000,new Date(),"DH",c1));
			walletRepository.save(new Wallet(UUID.randomUUID(),6000,new Date(),"DH",c1));
			walletRepository.save(new Wallet(UUID.randomUUID(),8000,new Date(),"EUR",c2));

			walletRepository.findAll().forEach(wallet -> {
				System.out.println(wallet.toString());
			});


		};
	}

}
