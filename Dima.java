public class Dima {
    public static void main(String args[]) {
        System.out.println("Hello World");

        String[] myStringArray = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        System.out.println(myStringArray[3]);

        int n = (int) (Math.random() * 1000000);
        System.out.println("My generated number is: "+n);
        n = 3;
        System.out.println("3 ="+n);
        n += 0b10101;
        System.out.println("0b10101 = "+n);
        n += 0xFF;
        System.out.println("+ 0xFF = " +n);
        n *= 6;
        System.out.println("Final Result =" +n);

        while (n > 10) {
            int result = 0;
            while (n > 0) {
                result += n % 10;
                n /= 10;
            }
            n=result;
        }
        System.out.println("Final Final Result = " +n);

        System.out.println("Willy-nilly, this semester I will learn " + myStringArray[n]);
    }
}