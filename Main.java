import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        if (args.length < 3)
        {
            System.out.println("There is no enough arguments.");
            return;
        }

        if (Integer.parseInt(args[0]) < 0 || Integer.parseInt(args[1]) < 0)
        {
            System.out.println("invalid arguments given");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        int arrSize = args.length - 2;
        int[] letters = new int[args.length - 2];

        for (int index = 2; index < args.length; index++)
        {
            int argLen = args[index].toCharArray().length;
            if (argLen > 1)
            {
                System.out.println("invalid arguments given");
                return;
            }

            letters[index - 2] = args[index].toCharArray()[0];

            if (letters[index - 2] < 65 || letters[index - 2] > 90)
            {
                System.out.println("invalid arguments given");
                return;
            }
        }

        ArrayList[] neighbourList = new ArrayList[arrSize];

        // initializing
        for (int i = 0; i < arrSize; i++) {
            neighbourList[i] = new ArrayList();
        }

        int [] [] matrix = new int [n] [n];

        List<String> wordsArray = new Vector<String>();
        for (int i = 0 ; i < n ; i++)
        {
            StringBuilder str = new StringBuilder();
            for (int j = 0 ; j < k ; j++)
            {
                int letter = (int) (Math.random() * arrSize);
                str.append((char)letters[letter]);

                for (Object neighbour : neighbourList[letter])
                {
                    System.out.println(neighbour + " -> " + i );

                    matrix[(int) neighbour][i]++;
                    matrix[i][(int) neighbour]++;
                }

                neighbourList[letter].add(i);
            }
            wordsArray.add(str.toString());
        }

        for (int i = 0 ; i < n ; i++)
        {
            for (int j = 0 ; j < n ; j++)
            {
              System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (String str : wordsArray)
        {
            System.out.println(str);
        }
    }
}
