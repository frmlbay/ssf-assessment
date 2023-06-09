package vttp2023.batch3.ssf.frontcontroller.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AuthenticationService {

	@NotNull(message="Enter a name")
	@Size(min=2, message="Minimum name not less than 2 characters")
	@NotBlank(message="Enter a name")
	private String username;

	@NotNull(message="Enter password")
	@Size(min=2, message="Password length not less than 2 characters")
	@NotBlank(message="Enter password")
	private String password;


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// TODO: Task 2
	// DO NOT CHANGE THE METHOD'S SIGNATURE
	// Write the authentication method in here
	public void authenticate(String username, String password) throws Exception {

		


		// List<ObjectError> errors = new LinkedList();
		// FieldError error;
		// if (username.length() < 2) {
		// 	error = new FieldError("username", "username","Error username less than 2 character");
		// 	errors.add(error);
		// }

		// if (password.length() < 2) {
		// 	error = new FieldError("password", "password","Error password less than 2 character");
		// 	errors.add(error);
		// }

		// //return errors;

	}

	// TODO: Task 3
	// DO NOT CHANGE THE METHOD'S SIGNATURE
	// Write an implementation to disable a user account for 30 mins
	public void disableUser(String username) {
	}

	// TODO: Task 5
	// DO NOT CHANGE THE METHOD'S SIGNATURE
	// Write an implementation to check if a given user's login has been disabled
	public boolean isLocked(String username) {
		return false;
	}
}
