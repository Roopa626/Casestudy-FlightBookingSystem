package account;
import java.util.Scanner;
public class MinimumAccountBalance extends Exception {
	String message;
	public MinimumAccountBalance (String message) {
		this.message=message;
		}
	public String toString()
	{
		return message;
	}

}
