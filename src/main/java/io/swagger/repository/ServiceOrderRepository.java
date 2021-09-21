package io.swagger.repository;

import io.swagger.model.ServiceOrder;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceOrderRepository extends Neo4jRepository<ServiceOrder, String> {
}
