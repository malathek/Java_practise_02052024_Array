public class pro3MaxOfArray {
    public static void main(String[] args) {

        int[] arr = {30,50,60,90,10,100,999};

        int max_arr = 0;

        for (int j = 0; j < arr.length; j++) {
            if(max_arr < arr[j])
            {
                max_arr = arr[j];
            }

        }
        System.out.println(max_arr);
    }
}
