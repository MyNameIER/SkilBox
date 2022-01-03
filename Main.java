package IntegerExperiments;

public class Main {
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(666));
        System.out.println(container.count);

    }


    public static Integer sumDigits(Integer number)
   {
    String symbols = Integer.toString(number);
    Integer result = 0;
       for(int i = 0; i < symbols.length(); i++){
           result += Integer.parseInt(String.valueOf(symbols.charAt(i)));
       }
       return result;
    }
}