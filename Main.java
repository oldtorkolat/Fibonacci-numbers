/**
 * 
 */
public class Main {
    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        int sum = 0;
        int var = 0;

        while(first+second <= 4_000_000)
        {
            var = first + second;
            System.out.print(var + " , ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(var % 2 == 0)
                sum+=var;
            first = second;
            second = var;

        }
        System.out.println("\nThe sum of even-valued terms is :"+sum);


    }
}







