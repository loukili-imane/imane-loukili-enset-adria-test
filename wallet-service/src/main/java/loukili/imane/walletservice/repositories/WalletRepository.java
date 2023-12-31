package loukili.imane.walletservice.repositories;

import loukili.imane.walletservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource
public interface WalletRepository extends JpaRepository<Wallet, UUID>{
    Wallet findWalletById(UUID id);


}
