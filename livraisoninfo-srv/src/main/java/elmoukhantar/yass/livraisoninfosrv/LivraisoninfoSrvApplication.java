package elmoukhantar.yass.livraisoninfosrv;

import elmoukhantar.yass.livraisoninfosrv.entities.Livraison;
import elmoukhantar.yass.livraisoninfosrv.service.LivraisonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients


public class LivraisoninfoSrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivraisoninfoSrvApplication.class, args);
    }
    @Bean
    CommandLineRunner start(LivraisonService
                             livraisonService){
        return args -> {
            Livraison livraisonInfo1=new Livraison(UUID.randomUUID().toString(),"AAAA",null,"pc");
            Livraison livraisonInfo2=new Livraison(UUID.randomUUID().toString(),"YYYY",null,"machine");
            Livraison livraisonInfo3=new Livraison(UUID.randomUUID().toString(),"TTTT",null,"voiture");
            livraisonService.setLivraison(livraisonInfo1);
            livraisonService.setLivraison(livraisonInfo2);
            livraisonService.setLivraison(livraisonInfo3);

        };
    }

}
