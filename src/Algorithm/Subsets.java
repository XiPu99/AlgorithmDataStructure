package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        int size = 1<<nums.length;
        for(int i = 0; i < size; i++){
            list.add(convertBinaryToList(i, nums));
        }

        return list;
    }

    public List<Integer> convertBinaryToList(int binary, int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            System.out.println("Binary: " + binary);
            if(((binary)&1)==1){
                list.add(nums[i]);
            }
            binary>>=1;
        }
        return list;
    }
}
