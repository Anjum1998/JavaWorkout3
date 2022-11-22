import java.util.Scanner;

public class subString {

    static void subString(char str[],int len)
    {
        for(int n=1;n<=len;n++)
        {
            for(int i=0;i<=len-n;i++)
            {
                int j=i+ n-1;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(str[k]);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        char[] str =scanner.next().toCharArray();

        subString(str, str.length);

    }
}
