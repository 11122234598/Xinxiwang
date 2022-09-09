import java.util.HashSet;

public class q04 {
    //36
    
    private  void  helper(){
        int temp=0;
        int temp1=0;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <10 ; j++) {
                temp=i*100+j*10;
                temp1=20-i-j;
                if(temp1<10) {
                    temp += temp1;
                    if (hashSet.add(temp)) System.out.println(temp);
                }
            }
        }
        System.out.println(hashSet.size());
    }

    public static void main(String[] args) {
        q04 q04 = new q04();
        q04.helper();
    }
}
