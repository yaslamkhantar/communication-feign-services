package elmoukhantar.yass.commandesrv.controller;

import elmoukhantar.yass.commandesrv.dto.CommandeRepository;
import elmoukhantar.yass.commandesrv.entity.Commande;
import elmoukhantar.yass.commandesrv.service.CommandeService;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CommandeWeb {
    private CommandeRepository commandeRepository;

    private CommandeService commandeService;

    @PostMapping("/saveCommande")
    public Commande saveCommande(@RequestBody Commande commande) {
        return commandeService.setCommande(commande);
    }
    @GetMapping("/getAllCommande")
    public List<Commande> getall(){
        return commandeService.getall() ;
    }
    @GetMapping("/getCommandbyname/{commandName}")
    public Commande getcommandeByname(@PathVariable String commandName) {
        return commandeService.getOne(commandName) ;
    }



}
