package vttp2023.batch3.ssf.frontcontroller.model;

import java.io.Serializable;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Person implements Serializable {
    
    @NotNull(message="Enter a name")
	@Min(value=2, message="Minimum name not less than 2 characters")
	@NotBlank(message="Enter a name")
	private String username;

	@NotNull(message="Enter password")
	@Min(value=2, message="Password length not less than 2 characters")
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


}
