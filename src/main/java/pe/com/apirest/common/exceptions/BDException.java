package pe.com.apirest.common.exceptions;

public class BDException extends BaseException {

	private static final long serialVersionUID = -1L;

	public BDException(String code, String message) {
		super(code, message);
	}
	
	public BDException(String code, String message, String messageDeveloper, Exception exception) {
		super(code, message, messageDeveloper, exception);
	}

}
