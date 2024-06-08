package elmoukhantar.yass.livraisoninfosrv.entities;

import elmoukhantar.yass.livraisoninfosrv.model.Commande;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Livraison {

    @Id

    private String id;
    private String livraisonName;
    @Transient
    private Commande commande;
    private String commandName;
}
