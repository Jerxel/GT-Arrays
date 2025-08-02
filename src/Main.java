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
    }
}
