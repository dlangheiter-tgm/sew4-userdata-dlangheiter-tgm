package hello;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Long id;

	private String firstName;

	private String lastName;

	@NotNull
	private String email;

	private LocalDate birthday;

	protected Customer() {
	}

	public Customer(String email) {
		this.setEmail(email);
	}

	public Customer(String email, String firstName, String lastName) {
		this(email);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Customer(String email, String firstName, String lastName, LocalDate birthday) {
		this(email);
		this.firstName = firstName;
		this.lastName = lastName;
		this.setBirthday(birthday);
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", birthday=" + birthday +
				'}';
	}
}
