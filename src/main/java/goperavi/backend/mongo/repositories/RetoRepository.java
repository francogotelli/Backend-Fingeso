package goperavi.backend.mongo.repositories;

import goperavi.backend.mongo.models.Reto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RetoRepository extends MongoRepository<Reto, String>{

}
