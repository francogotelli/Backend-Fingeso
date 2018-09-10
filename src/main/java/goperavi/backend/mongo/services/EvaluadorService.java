package goperavi.backend.mongo.services;

import goperavi.backend.mongo.models.Evaluador;
import goperavi.backend.mongo.repositories.EvaluadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/evaluadores")
public class EvaluadorService {
    @Autowired
    private EvaluadorRepository evaluadorRepository;



    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Evaluador> getAll() {
        return evaluadorRepository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public void delete() {
        evaluadorRepository.deleteAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    @ResponseBody
    public void save() {
        evaluadorRepository.save(new Evaluador("nombre usuario","correo usuario", "id ideas de usuario"));
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Evaluador create(@RequestBody Evaluador resource) {
        return evaluadorRepository.save(resource);
    }

}