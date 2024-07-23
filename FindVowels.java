class FindVowels{
    public static void main(String args[]){
        String str ="abdeisguczo";
        
        char [] ch =str.toCharArray();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                count=count+1;
            }
        }
        System.out.println("Total number of vowels in String: "+count);
    }
}

/**Total number of vowels in String: 5 */