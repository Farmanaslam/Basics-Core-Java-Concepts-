class Recursion_Practice{
    //permutation problem using recursion...............
    public static void printPermutation(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(0);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newstr,permutation+currchar);
        }}
    public static void main(String args[]) {
        String str="abc";
        printPermutation(str,"");
    }
    
    
    
    
    }