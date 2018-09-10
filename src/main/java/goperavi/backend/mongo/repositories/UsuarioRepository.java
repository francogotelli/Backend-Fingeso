package goperavi.backend.mongo.repositories;

import goperavi.backend.mongo.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{

}