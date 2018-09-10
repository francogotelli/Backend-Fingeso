package goperavi.backend.mongo.repositories;

import goperavi.backend.mongo.models.Evaluador;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EvaluadorRepository extends MongoRepository<Evaluador, String>{

}