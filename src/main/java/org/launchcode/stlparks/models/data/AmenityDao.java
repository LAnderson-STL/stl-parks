package org.launchcode.stlparks.models.data;

import org.launchcode.stlparks.models.Amenity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional


public interface AmenityDao extends CrudRepository<Amenity, Integer> {
}
