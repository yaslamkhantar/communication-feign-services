package elmoukhantar.yass.livraisoninfosrv.repository;

import elmoukhantar.yass.livraisoninfosrv.entities.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LivraisonDTO extends JpaRepository<Livraison,String> {

    Livraison findByLivraisonName(String livraisonName);
}
