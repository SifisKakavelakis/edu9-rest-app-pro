package gr.aueb.cf.eduapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.NonNull;

public record UserInsertDTO(

        @NonNull
        @Size(min = 3, max = 20)
        String Username,

        @NonNull
        @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=])^.{8,}$")
        String password,

        @NotBlank
        Long roleId
) {
}
