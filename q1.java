import java.util.HashMap;

public class q1 {
    //97

    //计算总时间
    private static int  getSumTimeHour(int days,String begin,String end){
        int beginTime=0;
        int endTime =0;
        int beginMin=0;
        int endMin=0;
        int hours=0;
        String temp="";
        String tempMin="";
        for (int i = 0; i <2; i++) {
            if(begin.charAt(i)==':') break;
            temp+=begin.charAt(i);
            tempMin=begin.charAt(begin.length()-i-1)+tempMin;
        }
        beginTime= Integer.parseInt(temp);
        beginMin = Integer.parseInt(tempMin);
        
        temp="";
        tempMin="";
        for (int i = 0; i <2; i++) {
            if(end.charAt(i)==':') break;
            temp+=end.charAt(i);
            tempMin=begin.charAt(begin.length()-i-1)+tempMin;
        }
        endTime=Integer.parseInt(temp);
        endMin=Integer.parseInt(tempMin);
        if(beginTime>endTime) {
            days=days-1;
            endTime+=24;
        }
        
        hours+=days*24+endTime-beginTime;
        hours+=beginMin<endMin?1:0;
        return hours;
        
        
        
        
        
        

    }
    //计费
    private static  int  getSumCount(int hours){
        return hours<3?5:2+hours;


    }

    public static void main(String[] args) {
        int days =4;
        String begin ="8:40";
        String end = "7:10";
        System.out.println(q1.getSumTimeHour(days, begin, end));
        System.out.println(q1.getSumCount(95));
    }
}
