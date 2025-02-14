package co.istad.pos.features.inventory;

import co.istad.pos.domain.Inventory;
import co.istad.pos.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {

    Inventory findByUuid (String uuid);

    Inventory findInventoryByProduct_Uuid (String uuid);

    Inventory findInventoryByProduct (Product product);


}
