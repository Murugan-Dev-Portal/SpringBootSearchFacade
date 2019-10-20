package au.com.test.inf.user.log.monitoring.repo;

import au.com.test.inf.user.log.monitoring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    /*@Query("SELECT u FROM USER u where t.id = :id")
    Optional<User> findUserById(@Param("id") String id);*/

}
