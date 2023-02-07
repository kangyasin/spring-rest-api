package design.boilerplate.springboot.security.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created on February, 2023
 *
 * @author Kangyasin
 */
@Getter
@Setter
@AllArgsConstructor
public class LoginResponse {

	private String token;

}
