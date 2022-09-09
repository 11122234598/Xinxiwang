public class q06 {
    //9901
    public static void main(String[] args) {
        int temp = 0;
        int num=0;
        for (int i = 1; i <=199 ; i++) {
            temp=200-i;
            if(temp<i) temp=i+1;
            for (; temp<=199 ; temp++) {
                System.out.println(i+":"+temp);
                num++;
            }
        }
        System.out.println(num);
    }
}
