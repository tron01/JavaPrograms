import java.util.HashMap;


class MyhashMap{

public static void main(String args[]){

    // created a hashmap object - phoneBook
    HashMap<String,Integer> phoneBook = new HashMap<String,Integer>();

    //add key (string) and value (int)

    phoneBook.put("xwrwf",141414);
    phoneBook.put("abcd",12333);
    phoneBook.put("rqrqrq",7856888);

    System.out.println(phoneBook);

}

}

/*
{xwrwf=141414, rqrqrq=7856888, abcd=12333}
 */