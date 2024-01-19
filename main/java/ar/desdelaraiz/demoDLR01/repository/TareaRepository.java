package ar.desdelaraiz.demoDLR01.repository;

import ar.desdelaraiz.demoDLR01.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
/**
 * @author  pbarzaghi
 */
@Repository

//@RepositoryRestResource(path = "tareas" , collectionResourceRel = "tareas")
public interface TareaRepository extends JpaRepository<Tarea,Integer> {

    
}
