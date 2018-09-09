import cl.usach.traffictweet.mongo.models.Occurrence;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface IdeaRepository extends MongoRepository<Occurrence, String>{

}