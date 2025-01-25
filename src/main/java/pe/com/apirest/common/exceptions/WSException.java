package pe.com.apirest.common.exceptions;

public class WSException extends BaseException {
	private static final long serialVersionUID = 1L;

	public WSException(String code, String message) {
		super(code, message);
	}
	
	public WSException(String code, String message, Exception e) {
		super(code, message, e);
	}
}
