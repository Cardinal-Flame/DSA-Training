import java.util.Arrays;
public class zero {
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++) {
            if(nums[i] == 0) {
                zeroCount++;
                arrays[i] = nums[i];
            }
            System.out.print(args[i] + " ");
        }

        System.out.println("Number of zeros in the array: " + zeroCount);
    }
    
}
