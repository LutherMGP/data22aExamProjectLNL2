import org.springframework.data.jpa.repository.JpaRepository;
import com.data22aexamprojectlnl2.model.Service;

public interface ImageRepository extends JpaRepository<Image, Int> {
    // Du kan tilføje egne metoder her, hvis nødvendigt.
}
