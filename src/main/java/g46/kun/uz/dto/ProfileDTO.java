package g46.kun.uz.dto;

import g46.kun.uz.types.ProfileRole;
import g46.kun.uz.types.ProfileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Getter
@Setter
public class ProfileDTO {
    private Integer id;
    @NotEmpty(message = "Iltimos ismingizni kiriting")
    private String name;
    @NotBlank(message = "Iltimos familyangizni kiriting")
    private String surname;
    @Email(message = "Email manzilingizni kiriting")
    private String email;
    @NotBlank(message = "parolni kiriting")
    @Size(min = 8, message = "minimal belgilar soni 8 ta")
    @Size(max = 15, message = "max belgilar 15 ta ")
    private String password;
    @NotEmpty
    private String contact;
    @NotNull
    private ProfileStatus status;
    @NotNull
    private ProfileRole role;
    private LocalDateTime createdDate;

}
