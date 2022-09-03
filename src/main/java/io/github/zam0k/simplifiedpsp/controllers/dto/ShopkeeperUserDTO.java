package io.github.zam0k.simplifiedpsp.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter @Setter @ToString
@AllArgsConstructor
public class ShopkeeperUserDTO {
    @NotBlank(message = "Full Name cannot be empty")
    private String fullName;
    @CNPJ(message = "Invalid cnpj format")
    @NotBlank(message = "Cnpj cannot be empty")
    private String cnpj;
    @Email(message = "Invalid email format")
    @NotBlank(message = "Email cannot be empty")
    private String email;
    @NotBlank(message = "Password cannot be empty")
    private String password;
    @NotNull(message = "Balance cannot be null")
    private BigDecimal balance;

}