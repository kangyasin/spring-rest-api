package design.boilerplate.springboot.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created on February 2023
 *
 * @author Kangyasin
 */
@Getter
@RequiredArgsConstructor
public class RegistrationException extends RuntimeException {

	private final String errorMessage;

}
