package elmoukhantar.yass.livraisoninfosrv.service;

import elmoukhantar.yass.livraisoninfosrv.entities.Livraison;
import elmoukhantar.yass.livraisoninfosrv.repository.LivraisonDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LivraisonService {
    private LivraisonDTO livraisonDTO;

    public Livraison setLivraison(Livraison livraisonInfo) {

        return livraisonDTO.save(livraisonInfo);
    }


}
