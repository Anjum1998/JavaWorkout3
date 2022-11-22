
    import java.util.Scanner;
    class  InvalidPanException extends Exception{
        public InvalidPanException(String s){
            super(s);
        }
    }
    public class PanCard {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Name:= ");
            String name=sc.nextLine();
            System.out.println("Enter the Pan Card Number:= ");
            String pan=sc.nextLine();
            String n1= String.valueOf(name.charAt(0));
            String p2= String.valueOf(pan.charAt(4));
            try {
                if(n1.equalsIgnoreCase(p2) && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")){
                    System.out.println("Pan Card is Valid");
                }
                else {
                    throw new InvalidPanException("Invalid Pan Card");
                }
            }
            catch (InvalidPanException p){
                System.out.println("Exception Caught "+p.getMessage());
            }
        }
    }



