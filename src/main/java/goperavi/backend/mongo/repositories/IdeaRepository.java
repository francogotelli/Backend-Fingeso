package goperavi.backend.mongo.repositories;

import goperavi.backend.mongo.models.Idea;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IdeaRepository extends MongoRepository<Idea, String>{

}