package goperavi.backend.mongo.repositories;

import goperavi.backend.mongo.models.Idea;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface IdeaRepository extends MongoRepository<Idea, String>{

}