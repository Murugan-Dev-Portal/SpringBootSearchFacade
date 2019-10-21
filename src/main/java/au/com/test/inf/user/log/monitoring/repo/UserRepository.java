package au.com.test.inf.user.log.monitoring.repo;

import au.com.test.inf.user.log.monitoring.repo.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, String> {
    @Query(value = "SELECT u FROM USER u where u.user_id = :userId", nativeQuery = true)
    Optional<UserDTO> findUserById(@Param("userId") String userId);
}
