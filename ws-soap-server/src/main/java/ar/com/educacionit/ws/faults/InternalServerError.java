package ar.com.educacionit.ws.faults;

public class InternalServerError extends Exception {

	private static final long serialVersionUID = -2178644480693014593L;

	public InternalServerError(Exception e) {
		super(e);
	}
}
