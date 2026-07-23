public class CountOccurrence {
    public static void main(String[] args) {

        int[] arr={1,2,2,3,2,4};

        int key=2;

        int count=0;

        for(int num:arr){
            if(num==key)
                count++;
        }

        System.out.println("Occurrences = "+count);
    }
}
