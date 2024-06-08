package elmoukhantar.yass.livraisoninfosrv.RestOtherApi;

import elmoukhantar.yass.livraisoninfosrv.model.Commande;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "COMMANDE-SRV")
public interface CommandRest {

 /*   @PostMapping("/api1/saveCommande")
    Commande saveCommande(Commande commande);*/

    @GetMapping("/getCommandbyname/{commandName}")
    Commande getcommandeByname(@PathVariable String commandName);
}
