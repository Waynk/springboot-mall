package own.mall.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
public class UserRegisterRequest {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;
}
