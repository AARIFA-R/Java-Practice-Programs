public class PositiveNegativeZero {
    public static void main(String[] args) {
        int[] arr = {1,-2,0,4,-5,0};

        int pos=0, neg=0, zero=0;

        for(int num:arr){
            if(num>0)
                pos++;
            else if(num<0)
                neg++;
            else
                zero++;
        }

        System.out.println("Positive = "+pos);
        System.out.println("Negative = "+neg);
        System.out.println("Zero = "+zero);
    }
}
