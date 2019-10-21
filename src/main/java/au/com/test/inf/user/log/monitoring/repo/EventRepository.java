package au.com.test.inf.user.log.monitoring.repo;

import au.com.test.inf.user.log.monitoring.repo.dto.EventDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<EventDTO, Long> {
    @Query(value = "SELECT e FROM EVENT e where e.event_id = :eventId", nativeQuery = true)
    Optional<EventDTO> findByEventId(@Param("eventId") String eventId);
}
