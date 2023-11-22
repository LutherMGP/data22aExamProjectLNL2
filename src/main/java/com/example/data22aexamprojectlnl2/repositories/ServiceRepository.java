import org.springframework.data.jpa.repository.JpaRepository;
import com.data22aexamprojectlnl2.model.Service;

public interface ServiceRepository extends JpaRepository<Service, Int> {
    // Du kan tilføje egne metoder her, hvis nødvendigt.
}

