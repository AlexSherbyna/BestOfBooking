package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "homeowner")
public class Homeowner {

    @Column(name ="id")
    @Id
    private int id;

    @Column(name="propertiesID")
    private int propertiesID;

    @ManyToOne
    @JoinColumn(name = "userID")
    private int userID;
}
