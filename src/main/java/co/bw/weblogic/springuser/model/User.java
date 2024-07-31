package co.bw.weblogic.springuser.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    public String username;

    @Column(nullable = false)
    public String password;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

}


