package elmoukhantar.yass.commandesrv.service;

import elmoukhantar.yass.commandesrv.dto.CommandeRepository;
import elmoukhantar.yass.commandesrv.entity.Commande;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CommandeService {
    private CommandeRepository commandeRepository;

    public Commande setCommande(Commande commande){
        commande.setCommandId(UUID.randomUUID().toString());
        return commandeRepository.save(commande);
    }


    public List<Commande> getall(){
        return commandeRepository.findAll();
    }

    public Commande getOne(String name){
        return commandeRepository.findByCommandName(name);
    }
}
