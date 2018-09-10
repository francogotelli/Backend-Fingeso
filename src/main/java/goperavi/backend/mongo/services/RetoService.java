package goperavi.backend.mongo.services;

import goperavi.backend.mongo.models.Reto;
import goperavi.backend.mongo.repositories.RetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/retos")
public class RetoService {
    @Autowired
    private RetoRepository retoRepository;



    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Reto> getAll() {
        return retoRepository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public void delete() {
        retoRepository.deleteAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    @ResponseBody
    public void save() {
        retoRepository.save(new Reto("nombre reto","descripcion reto"));
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Reto create(@RequestBody Reto resource) {
        return retoRepository.save(resource);
    }

}