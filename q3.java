import java.util.HashMap;
import java.util.HashSet;

public class q3 {
    //48
    HashSet<String> hashSet = new HashSet<>();
    int sum =0;
    private    void solution(int num){
        int[] nums = {0,1,4,9};
        String tempNum = "";
        helper(nums,tempNum,num);
        System.out.println(hashSet);
        System.out.println(sum);

    }
    private   void   helper(int[] nums,String tempNum,int num){
        if(tempNum.length()==num){

            if(!tempNum.startsWith("0")&&hashSet.add(tempNum)) sum++;

        }
        else {
            for (int i = 0; i < nums.length; i++) {
                tempNum+=nums[i];
                helper(nums,tempNum,num);
                tempNum=tempNum.substring(0,tempNum.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        q3 q3 = new q3();
        q3.solution(3);
    }
}
