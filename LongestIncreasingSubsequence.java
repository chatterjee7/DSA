import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int  noOfElements = scan.nextInt();
        int[] numberSequence = new int[noOfElements];
        int[] bufferSequence = new int[noOfElements];
        int max = 0;
        for(int i=0;i<noOfElements;i++){
            int inputs = scan.nextInt();
            numberSequence[i] = inputs;
        }
        for(int i=0;i<noOfElements;i++) bufferSequence[i] = 1;
        for(int i=0;i<noOfElements;i++){
            for(int j=0;j<i;j++){
                if(numberSequence[j]<numberSequence[i]){
                    if(bufferSequence[j]+1>bufferSequence[i]){
                        bufferSequence[i] = bufferSequence[j] + 1;
                    }
                }
            }
        }
        for (int value : bufferSequence) {
            if (max < value) {
                max = value;
            }
        }
        System.out.println(max);


    }
}
