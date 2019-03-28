package ali.ashique.bikeproject.model;

import javax.persistence.*;

@Entity
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int cc;
    private String chasisNumber;

    @ManyToOne
    private Company company;

    @ManyToOne
    private Color color;

    public Bike() {
    }

    public Bike(String name, int cc, String chasisNumber, Company company, Color color) {
        this.name = name;
        this.cc = cc;
        this.chasisNumber = chasisNumber;
        this.company = company;
        this.color = color;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getChasisNumber() {
        return chasisNumber;
    }

    public void setChasisNumber(String chasisNumber) {
        this.chasisNumber = chasisNumber;
    }
}
