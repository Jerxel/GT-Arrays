public class Main {
    public static void main(String[] args){

        String[] names = {"Jen", "Jacques" , "Jeff" , "Joan", "Joseph",
                          "Jacob", "Joannah", "Jay", "Jayson", "Joyce"};
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println();

        int sum = 0;
        int[] nums ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println(sum);

        int [][]arr = {
                {1,2,3,},
                {4,5,6,},
                {7,8,9},
                {10,11,12}
        };

        System.out.println();

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int[] row : arr){
            for(int elem : row){
                System.out.print(elem + " ");
            }   s
            System.out.println();
        }
    }
}
