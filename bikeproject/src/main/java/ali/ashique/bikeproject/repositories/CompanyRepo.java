package ali.ashique.bikeproject.repositories;

import ali.ashique.bikeproject.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepo extends CrudRepository<Company,Long> {
}
