package ar.desdelaraiz.demoDLR01.entity;
 
import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/**
 * @author  pbarzaghi
 */
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity

public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NonNull
    private String nombre;
    @NonNull
    private Boolean estado;
}
