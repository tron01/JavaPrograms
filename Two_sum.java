import java.util.HashMap;
class Two_sum{
        

        public static void main(String args[]){
        
        int dif;
        int[]nums={2,3,11,7};
        int target=9;
        Two_sum obj =new Two_sum();

        obj.twoSum(nums,target);

        System.out.println();
        

        }
        public int[] twoSum(int[] nums,int target){
            HashMap<Integer,Integer> Seen =new HashMap<>();

            for(int i=0; i<nums.length;i++){
                Integer SeenIndex =Seen.get(nums[i]);
                 System.out.println("seenIndex before if ="+SeenIndex+"index of i: "+i);
                //if map is not null return
                if(SeenIndex!=null){
                    System.out.println("seenIndex inside if ="+SeenIndex+"index of i: "+i);
                    return new int[]{SeenIndex,i};
                }
                    //Input: nums = [2,7,11,15], target = 9 
                    // Seen {7:0,7:1,0:2)}
                //number:index 
                Seen.put(target-nums[i],i);
                System.out.println(Seen);

            }
            return nums;
        }
}