package org.launchcode.stlparks.models.data;

        import org.launchcode.stlparks.models.Admin;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

        import javax.transaction.Transactional;

@Repository
@Transactional

public interface AdminDao extends CrudRepository<Admin, Integer>{
}
