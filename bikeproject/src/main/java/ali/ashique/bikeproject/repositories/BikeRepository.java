package ali.ashique.bikeproject.repositories;

import ali.ashique.bikeproject.model.Bike;
import org.springframework.data.repository.CrudRepository;

public interface BikeRepository extends CrudRepository<Bike,Long> {
}
