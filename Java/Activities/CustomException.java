package activities;

public class CustomException extends Exception {
	
private String message=null;

public CustomException(String message)

{
this.message=message;	
}
public String getMessage()
{
	return message;
}
public  static void  exceptionTest(String str) throws CustomException {
	if(str == null) {
        throw new CustomException("String value is null");
    } else {
        System.out.println(str);
    }
	// TODO Auto-generated method stub
	
}
}
