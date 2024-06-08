package elmoukhantar.yass.livraisoninfosrv.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Commande {
    private String commandId;
    private String commandName;
    private String commandType;
    private Integer price;
}
