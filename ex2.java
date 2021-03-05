//Rotate a given String by 2
public class ex2{
  public static void main(String[] args){
    //Exit if there are insufficient arguments
    if(args.length == 0){
      System.out.println("Invalid Input");
      return;
    }
    //Store original String
    String input = args[0];
    String output = "";
    int len = input.length();
    //Print original String  if its one or less chars long
    if(len <= 1){
      System.out.println(input);
    }
    else{
      //Start new String with the last 2 chars of the original String
      output += input.charAt(len-2);
      output += input.charAt(len-1);
      //Add each char from the original String to the new String except the last 2
      for(int i = 0; i < len-2; i++){
        output += input.charAt(i);
      }
      //Print newly created String
      System.out.println(output);
    }
  }
}