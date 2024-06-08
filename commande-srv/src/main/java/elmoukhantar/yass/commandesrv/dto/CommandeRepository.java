package elmoukhantar.yass.commandesrv.dto;

import elmoukhantar.yass.commandesrv.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RepositoryRestResource
public interface CommandeRepository extends JpaRepository<Commande,String> {


    Commande findByCommandName(String commndaName);
}
