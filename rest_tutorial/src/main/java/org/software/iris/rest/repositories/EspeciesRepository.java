package org.software.iris.rest.repositories;

import org.bson.types.ObjectId;
import org.software.iris.rest.models.Especies;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EspeciesRepository extends MongoRepository<Especies, String> {
	Especies findBy_id(ObjectId _id);
}
