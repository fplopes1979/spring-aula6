package next.school.cesar.springaula6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import next.school.cesar.springaula6.entities.TimeDeFutebol;

@RepositoryRestResource(collectionResourceRel = "timedefutebol", path = "timedefutebol")
public interface TimeDeFutebolRepository extends JpaRepository<TimeDeFutebol, Long>{
    
}
