package org.launchcode.stlparks.models.data;

import org.launchcode.stlparks.models.Park;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional

public interface ParkDao extends CrudRepository<Park, Integer> {

    public List <Park> findAllByOrderByNameAsc();
}
