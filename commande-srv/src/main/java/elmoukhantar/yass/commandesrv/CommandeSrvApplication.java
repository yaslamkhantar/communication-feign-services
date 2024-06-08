package elmoukhantar.yass.commandesrv;

import elmoukhantar.yass.commandesrv.entity.Commande;
import elmoukhantar.yass.commandesrv.service.CommandeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class CommandeSrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandeSrvApplication.class, args);
    }
@Bean
CommandLineRunner start(CommandeService commandeService){
        return args -> {
            Commande cmd1 = new Commande(null,"pc","xx",366);
            Commande cmd2 = new Commande(null,"machine","gg",89);
            Commande cmd3 = new Commande(null,"voiture","ss",768);
            commandeService.setCommande(cmd1);
            commandeService.setCommande(cmd2);
            commandeService.setCommande(cmd3);
        };
}

}
