package au.com.test.inf.user.log.monitoring.repo;

import au.com.test.inf.user.log.monitoring.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
