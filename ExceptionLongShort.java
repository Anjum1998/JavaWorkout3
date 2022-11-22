
import java.util.Scanner;
class ExceptionLineTooLong extends Exception{
    public ExceptionLineTooLong(String str){
        super(str);
    }
}
class ExceptionLineTooShort extends Exception{
    public ExceptionLineTooShort(String str){
        super(str);
    }
}
public class ExceptionLongShort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int len=s.length();
        try {
            if(len>10){
                throw new ExceptionLineTooLong("The input is too long");
            }
            else if (len<5) {
                throw new ExceptionLineTooShort("The input is too short");
            }
            else{
                System.out.println("String input length is correct");
            }
        }
        catch (ExceptionLineTooLong e){
            System.out.println("Exception Caught "+e.getMessage());
        }
        catch (ExceptionLineTooShort ex){
            System.out.println("Exception Caught "+ex.getMessage());
        }
    }
}