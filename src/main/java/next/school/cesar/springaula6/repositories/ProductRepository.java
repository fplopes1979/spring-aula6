package next.school.cesar.springaula6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import next.school.cesar.springaula6.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
