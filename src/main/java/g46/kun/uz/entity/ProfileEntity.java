package g46.kun.uz.entity;

import g46.kun.uz.types.ProfileRole;
import g46.kun.uz.types.ProfileStatus;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "profile")
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "name")
    private String name;
    @Column (name = "surname")
    private String surname;
    @Column (name = "email", nullable = false, unique = true)
    private String email;
    @Column
    private String password;
    @Column (name = "contact")
    private String contact;
    @Column (name = "status")
    private ProfileStatus status;
    @Column (name = "role")
    private ProfileRole role;
    @Column
    private LocalDateTime createdDate;

}
