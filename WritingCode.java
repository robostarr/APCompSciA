public class WritingCode
{
    public static void main(String args[])
    {
        System.out.println("\n\n NEW PROGRAM \n\n");
        
        int num1 = 88;
        int num2 = 13;
        double num3 = 7;
        String word = "APCS";
        boolean bool = false;
        
        int sum;
        double div;
      //part 1  
        System.out.print("I like pumpkin pie \n pumpkin \"pi\" \t can be found at \\pumpkinPI \n");
      //part2  
        sum = num1 / num2;
        System.out.println(sum);
        
        div = num1 / num3;
        System.out.println(div);
        //the first one is an int while the second one is a float so it doesnt truncate
      //part 3  
        double div2;
        double num11 = num1;
        double num21 = num2;
        div2 = num11 / num21;
        System.out.println(div2);
        
      //part 4  
        if(bool && num1%2 == 0)
        {
            System.out.println("Hello World");
        }
        else if(!bool || num1%2 == 1 || num2%2 == 1)
        {
            System.out.println("Crank it up!");
        }
        else
        {
            System.out.println("SHHH!!");
        }
        
        if(num3 < 5)
        {
            System.out.println("itsy-bitsy");
        }
        else if(num2 == 14)
        {
            System.out.println("Lucky Seven");
        }
        else
        {
            System.out.println(word);
        }
        
        
      //part 5
        int var = 65536;
        int ctr = 0;
        
        while(var%2 == 0)
        {
            ctr++;
            var /= 2;
            System.out.println(var + "\n \t" + ctr);
        }
        
      //part 6
        for(int i = 0; i<7; i++)
        {
            for(int j = 1; j<=5; j++)
            {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
      
      //part 7
        int [] arr = new int [100];
        for(int x = 0; x<100; x++)
        {
            
        }
        System.out.println("\n\n END PROGRAM");
    }
}