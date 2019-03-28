package ali.ashique.bikeproject.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public  class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String color;

    @OneToMany(mappedBy = "color",cascade = CascadeType.ALL)
    private List<Bike> bikeList=new LinkedList<>();

    public Color() {
    }

    public Color(String color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Bike> getBikeList() {
        return bikeList;
    }

    public void setBikeList(List<Bike> bikeList) {
        this.bikeList = bikeList;
    }
}
