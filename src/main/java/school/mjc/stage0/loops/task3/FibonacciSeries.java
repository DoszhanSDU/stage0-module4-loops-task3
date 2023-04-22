package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 1;
        int second = 1;
        if (lastFibonacci == 1) {
            System.out.println(first);
        } else if (lastFibonacci == 2) {
            System.out.println(first);
            System.out.println(second);
        }else if (lastFibonacci > 2) {
            System.out.println(first);
            System.out.println(second);
        for (int i = 3; i <= lastFibonacci; i++) {
            int a = second ;
            second = second + first ;
            first = a ;
            System.out.println(second);
        }
        }
    }
}
