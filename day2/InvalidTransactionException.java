package day2;
//Checked Exception
public class InvalidTransactionException extends Exception {
	private int errorCode;
	private String errorMessage;
	
	public InvalidTransactionException(int errorCode, String errorMessage) {
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
