package pe.com.apirest.common.exceptions;

public class IDFException extends BaseException {

	private static final long serialVersionUID = 1L;

	public IDFException(String code, String message) {
		super(code, message);
	}

	public IDFException(String code, String message, String activadaError) {
		super(code, message, activadaError);
	}

}
