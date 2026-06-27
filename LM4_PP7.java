import java.util.Scanner;

public class Method{

    static double priceCalc(double x)
    {
        return x+(x/2);
    }
    static double priceCalc(double x, double y)
    {
        return x+y;
    }
    static double priceCalc(double x, double y, double z)
    {
        double sum = x+y+z;
        if(sum < 200)
        {
            return sum+=50;
        }
        else if(sum >= 200 && sum <= 400)
            return sum+=0;
        else if(sum>400)
            return sum-=50;

        return sum;
    }


    public static void main(String[] args)
    {

        System.out.println(priceCalc(10.0));
        System.out.println(priceCalc(10,50));
        System.out.println(priceCalc(100,25,400));


    }

}
