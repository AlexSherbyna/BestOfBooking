package Entity;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @ManyToOne
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name ="second name")
    private String secondName;

    @Column(name = "birthday")
    private String birthday;

    @Column(name ="country")
    private String country;

    @Column(name = "email")
    private String email;

    @Column(name ="phone")
    private int phone;

    @Column(name = "password")
    private String password;
}
