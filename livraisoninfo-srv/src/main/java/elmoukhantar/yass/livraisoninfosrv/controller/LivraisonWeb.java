package elmoukhantar.yass.livraisoninfosrv.controller;

import elmoukhantar.yass.livraisoninfosrv.RestOtherApi.CommandRest;
import elmoukhantar.yass.livraisoninfosrv.entities.Livraison;
import elmoukhantar.yass.livraisoninfosrv.model.Commande;
import elmoukhantar.yass.livraisoninfosrv.repository.LivraisonDTO;
import elmoukhantar.yass.livraisoninfosrv.service.LivraisonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api2")
@AllArgsConstructor
public class LivraisonWeb {

    private LivraisonService livraisonService;

    private LivraisonDTO livraisonDTO;
    private CommandRest commandRest;

    @PostMapping("/livraison")
    public Livraison savelivraisonInfo(@RequestBody Livraison livraisonInfo) {
       return  livraisonService.setLivraison(livraisonInfo);
    }
    @GetMapping("/alllivraison")
        public List<Livraison> getAllLivraisonInfo() {

            return livraisonDTO.findAll();
        }


    @GetMapping("/getdetaiLivraison/{id}")
    public Livraison findlivraison(@PathVariable String id ) {
        Livraison lvr=livraisonDTO.findById(id).get();
        Commande cmd=commandRest.getcommandeByname(lvr.getCommandName());
        lvr.setCommande(cmd);
        return lvr;

    }
}
