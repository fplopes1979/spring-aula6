package next.school.cesar.springaula6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import next.school.cesar.springaula6.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
