package elmoukhantar.yass.commandesrv.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Commande {
    @Id

    private String commandId;
    private String commandName;
    private String commandType;
    private Integer price;
}
