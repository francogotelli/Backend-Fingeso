package goperavi.backend.mongo.services;

import goperavi.backend.mongo.models.Idea;
import goperavi.backend.mongo.repositories.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/ideas")
public class IdeaService {
    @Autowired
    private IdeaRepository ideaRepository;



    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Idea> getAll() {
        return ideaRepository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public void delete() {
        ideaRepository.deleteAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    @ResponseBody
    public void save() {
        ideaRepository.save(new Idea("nombre idea",1,2,"descripcion idea"));
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Idea create(@RequestBody Idea resource) {
        return ideaRepository.save(resource);
    }

}