import java.util.Scanner;


public class StringConversion {
    private String value;
    private Scanner input;

    public StringConversion()
    {
            input=new Scanner(System.in);
            value=input.next();
    }

    public StringConversion(String value)
    {
        this.value=value;
    }
    public void setValue(String value)
    {
        this.value=value;
    }

    public String getValue()
    {
        return value;
    }

    public void convertToInteger()
    {
        try {
            int convertedValue=Integer.parseInt(value);
            System.out.println(convertedValue);

        }
        catch (NumberFormatException e)
        {
            System.out.println("Bad String");
        }
    }
}
