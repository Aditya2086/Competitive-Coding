import java.util.*;
import java.io.*;

class APRIL222 {
    public static void main (String[] args) throws IOException 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int numOfTest = Integer.parseInt(in.readLine());
        while (numOfTest-- > 0) 
        {
            String[] inputs = in.readLine().split(" ");
            System.out.println(solution(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1])));
        }
    }
    private static final String solution(int inpA, int inpB) 
    {
        int evalFromA = 10 * inpA;
        int evalFromB = 5 * inpB;
        if (evalFromA == evalFromB) return "ANY";
        if (evalFromA > evalFromB) return "FIRST";
        else return "SECOND";
    }
}
