package core;

public class EmailLogger implements BaseLogger{

	@Override
	public void log(String logMessage) {
		System.out.println("Sent to mail");
		
	}

}
