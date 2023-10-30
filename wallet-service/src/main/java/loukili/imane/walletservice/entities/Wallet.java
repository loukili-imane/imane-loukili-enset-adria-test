package loukili.imane.walletservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.UUID;

@Entity
@Data  @NoArgsConstructor  @AllArgsConstructor  @ToString
public class Wallet {
    @Id @GeneratedValue
    private UUID id;
    private double solde;
    private Date dateCreation;
    private String devise;
    @ManyToOne
    private Client client;
}
