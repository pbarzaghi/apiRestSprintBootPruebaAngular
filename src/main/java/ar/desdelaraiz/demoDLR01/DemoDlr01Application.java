package ar.desdelaraiz.demoDLR01;

import ar.desdelaraiz.demoDLR01.entity.Tarea;
import ar.desdelaraiz.demoDLR01.repository.TareaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

/**
 * @author  pbarzaghi
 */
@SpringBootApplication
public class DemoDlr01Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoDlr01Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(TareaRepository tareaRepository) {
		return args -> {
			List<Tarea> tareasPrueba = Arrays.asList(
					new Tarea("Aprender Java", true),
					new Tarea("Inscribirme al curso FSJD", false ),
					new Tarea("Darle like a la página en Facebook", false ),
					new Tarea("Suscribirme al canal en YouTube", true ),
					new Tarea("Repasar el taller gratuito", false )
			);
			tareaRepository.saveAll(tareasPrueba);
		};
	}

}
