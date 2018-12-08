package one.dastec.scazuredemo;

import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends DocumentDbRepository<User, String> {
}
