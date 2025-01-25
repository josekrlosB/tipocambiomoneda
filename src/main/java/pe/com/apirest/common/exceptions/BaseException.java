package pe.com.apirest.common.exceptions;


public class BaseException extends Exception {
	private static final long serialVersionUID = 1L;
	private String codError;
	private String msjError;
	private Exception exception;
	private String nombreSP;
	private String actError;

	public BaseException(String codError, String msjError) {
		super(msjError);
		this.codError = codError;
		this.msjError = msjError;
	}

	public BaseException(String codError, String msjError, String actError) {
		super(msjError);
		this.codError = codError;
		this.msjError = msjError;
		this.actError = actError;
	}

	public BaseException(String codError, String msjError, Exception exception) {
		super(msjError);
		this.exception = exception;
		this.codError = codError;
		this.msjError = msjError;
	}

	public BaseException(String codError, String msjError, String nombreSP, Exception exception) {
		super(msjError);
		this.codError = codError;
		this.msjError = msjError;
		this.nombreSP = nombreSP;
		this.exception = exception;
	}

	public BaseException(String msjError) {
		super(msjError);
		this.msjError = msjError;
	}

	public String getCodError() {
		return codError;
	}

	public void setCodError(String codError) {
		this.codError = codError;
	}

	public String getMsjError() {
		return msjError;
	}

	public void setMsjError(String msjError) {
		this.msjError = msjError;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	public String getNombreSP() {
		return nombreSP;
	}

	public void setNombreSP(String nombreSP) {
		this.nombreSP = nombreSP;
	}

	public String getActError() {
		return actError;
	}

	public void setActError(String actError) {
		this.actError = actError;
	}
	
	
}
