package org.ort.starwars.fleet.application.ports.out;

import org.ort.starwars.fleet.domain.models.entities.Starship;
import org.springframework.stereotype.Repository;

@Repository
public interface StarshipRepositoryPort  {
    Iterable<Starship> findAll();
}