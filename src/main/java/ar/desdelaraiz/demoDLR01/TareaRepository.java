package ar.desdelaraiz.demoDLR01;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
@Repository
@RepositoryRestResource(path = "tareas" , collectionResourceRel = "tareas")
public interface TareaRepository extends JpaRepository<Tarea,Integer> {

    
}
