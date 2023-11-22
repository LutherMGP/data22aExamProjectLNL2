import org.springframework.data.jpa.repository.JpaRepository;
import com.data22aexamprojectlnl2.model.Service;

public interface PosterRepository extends JpaRepository<Poster, Int> {
    // Du kan tilføje egne metoder her, hvis nødvendigt.
}
