package day2;

public class InsufficientFundException extends Exception {
	private int errorCode;
	private String errorMessage;
	
	public InsufficientFundException(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
}
