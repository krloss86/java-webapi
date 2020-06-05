package ar.com.educacionit.dao.exceptions;

public class GenericExeption extends Exception {

	public GenericExeption(String message) {
		super(message);
	}

	public GenericExeption(String message, Exception e) {
		super(message, e);
	}
}
