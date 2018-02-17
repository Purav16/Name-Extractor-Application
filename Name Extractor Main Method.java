 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for ( int i = 0 ; i < words.length ; i++ ){
            System.out.print(words[i] + " ");
            } 
       // System.out.println("Testing the string length: ");
      //  System.out.println("String Length is: " + str_length(words));
       // int len = words.length;   
        
        String output;
        output = "The given name after extraction is: " + a(words);
        System.out.println(output);
    