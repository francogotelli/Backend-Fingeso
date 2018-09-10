package goperavi.backend.mongo.services;

import goperavi.backend.mongo.models.Usuario;
import goperavi.backend.mongo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;



    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public void delete() {
        usuarioRepository.deleteAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    @ResponseBody
    public void save() {
        usuarioRepository.save(new Usuario("nombre usuario","correo usuario", "id ideas de usuario"));
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Usuario create(@RequestBody Usuario resource) {
        return usuarioRepository.save(resource);
    }

}