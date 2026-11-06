package org.ort.starwars.fleet.application.ports.out;

import org.ort.starwars.fleet.domain.models.entities.Staff;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepositoryPort {
    Iterable<Staff> findAll();
}