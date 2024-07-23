import java.util.HashMap;

class DuplicateCharaWithCount{

public static void main(String args[]){
    
    HashMap<Character,Integer> duplicateMap =new HashMap<>();
    String str ="abcdaabbccddee";

    char[] strArry =str.toCharArray();


    for(char keys: strArry){

        // if a in hasmap update its count else add a to hashmap nd its count=0 
        if(duplicateMap.containsKey(keys)){
            //updating the count
            duplicateMap.put(keys,duplicateMap.get(keys)+1);
        }else{
            //adding to the hashmap
            duplicateMap.put(keys,1);
        }
    }
    System.out.println(duplicateMap);

}




}
/**
 * Q:Java Program to Find the Duplicate Characters from a String and Count its Occurrence 
 {a=3, b=3, c=3, d=3, e=2}
 */