package loukili.imane.transferservice.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import loukili.imane.transferservice.enumeration.Status;
import loukili.imane.transferservice.model.Wallet;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Transfer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Long sourceID;
    private Long destinationID;
    @Transient
    private Wallet sourceWallet;
    @Transient
    private Wallet destinationWalet;
    private Status status;
}
