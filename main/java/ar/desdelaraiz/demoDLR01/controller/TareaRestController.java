package ar.desdelaraiz.demoDLR01.controller;

import ar.desdelaraiz.demoDLR01.entity.Tarea;
import ar.desdelaraiz.demoDLR01.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author  pbarzaghi
 */
@RestController
public class TareaRestController {
    @Autowired
    private TareaRepository tareaRepository;


    @PostMapping ("/tarea")
    public Tarea getPostTarea(@Validated @RequestBody Map<String, Object> body) {

        Tarea tareaCreate= new Tarea();
        String nombre= String.valueOf(body.get("nombre"));
        String estado= String.valueOf(body.get("estado"));


        if(! nombre.isEmpty())
            tareaCreate.setNombre(nombre);
        estado=estado.trim().toLowerCase();
        if("true".equals(estado)||"false".equals(estado))
            tareaCreate.setEstado(Boolean.parseBoolean(estado));

       return tareaRepository.save(tareaCreate);
    }


    @PutMapping("/tarea/{id}")
    public Tarea getUpdateTarea(@Validated @RequestBody Map<String, Object> body,
                                @PathVariable("id") Integer id) {

        Tarea tareaUpdate= tareaRepository.findById(id).get();
        String nombre= String.valueOf(body.get("nombre"));
        String estado= String.valueOf(body.get("estado"));


        if(! nombre.isEmpty())
            tareaUpdate.setNombre(nombre);
        estado=estado.trim().toLowerCase();
        if("true".equals(estado)||"false".equals(estado))
            tareaUpdate.setEstado(Boolean.parseBoolean(estado));

        return tareaRepository.save(tareaUpdate);
    }

    @GetMapping("/tareas")
    public List<Tarea> getAllTareas(){
        return tareaRepository.findAll();
    }

    @DeleteMapping("/tarea/{id}")
    public String getDeleteById(@PathVariable("id") Integer id){
        tareaRepository.deleteById(id);
        return "Tarea eliminada con exito";
    }

}
