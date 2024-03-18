package com.stg.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// Automatically generates getters, setters, toString, and hashCode/equals methods
@NoArgsConstructor // Generates a no-args constructor
@AllArgsConstructor // Generates a constructor with all arguments
public class User {
    public User(String string, String string2, long l) {
		// TODO Auto-generated constructor stub
	}
	private String name;
    private String dept;
    private Long salary;
}