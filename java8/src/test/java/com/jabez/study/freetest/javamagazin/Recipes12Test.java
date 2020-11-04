package com.jabez.study.freetest.javamagazin;

import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

/**
 * @link https://blogs.oracle.com/javamagazine/12-recipes-for-using-the-optional-class-as-its-meant-to-be-used
 */
public class Recipes12Test {


	/**
	 * Recipe 1. Never assign null to an optional variable
	 */
	@Test
	public void recipe1WrongCase() {
		Employee employee = new Employee();

		Optional<Employee> nullEmployee = employee.getEmployee(0);
		Assert.assertNull("nullEmployee", nullEmployee);
	}

	/**
	 * Recipe 2. Don’t call get() directly
	 */
	@Test(expected = java.util.NoSuchElementException.class)
	public void recipe2WrongCase() {
		HRService hrService = new HRService();

		Optional<Employee> employee = hrService.getEmployee();
		Employee myEmployee = employee.get();
	}

	@Data
	private class Employee {
		private int id;
		private String name;

		public Optional<Employee> getEmployee(int id) {
			Optional<Employee> employee = null;
			return employee;
		}

		public Employee() {
			this.id = 1;
			this.name = "hola";
		}
	}

	private class HRService {
		public Optional<Employee> getEmployee() {
//			return Optional.of(new Employee());
			return Optional.empty();
		}
	}
}
