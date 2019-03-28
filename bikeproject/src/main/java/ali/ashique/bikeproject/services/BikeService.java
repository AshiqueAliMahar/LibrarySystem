package ali.ashique.bikeproject.services;

import ali.ashique.bikeproject.model.Bike;
import ali.ashique.bikeproject.model.Color;
import ali.ashique.bikeproject.model.Company;
import ali.ashique.bikeproject.repositories.BikeRepository;
import ali.ashique.bikeproject.repositories.ColorRepo;
import ali.ashique.bikeproject.repositories.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Size;
import java.util.LinkedList;
import java.util.List;

@Service
public class BikeService implements ApplicationListener<ContextRefreshedEvent> {

    private BikeRepository bikeRepository;
    private ColorRepo colorRepo;
    private CompanyRepo companyRepo;

    public BikeService(BikeRepository bikeRepository, ColorRepo colorRepo, CompanyRepo companyRepo) {
        this.bikeRepository = bikeRepository;
        this.colorRepo = colorRepo;
        this.companyRepo = companyRepo;
    }

    public void addBike(){
        Company save = companyRepo.save(new Company(0, "Haier", 45.7, "Hyd"));
        Company honda = new Company(0, "HONDA", 45.7, "Hyd");

        Color red = new Color("red");

        Color redSave = colorRepo.save(red);
        Bike bike=new Bike("Honda CD-70",30,"Ch-100",save,redSave);
        Bike crown=new Bike("Crown CD-70",30,"Ch-150",save,redSave);
        List<Bike> bikes=new LinkedList<>();
        bikes.add(bike);
        bikes.add(crown);
        honda.setBikeList(bikes);
        companyRepo.save(honda);

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        addBike();
    }
}
