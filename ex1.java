public class ex1{
  public static void main(String[] args){
    //Exit if there are insifficent arguments
    if(args.length <= 1){
      System.out.println("Invalid Input");
      return;
    }
    //Store initial integer
    int input = Integer.parseInt(args[args.length-1]);
    //Counters
    int above = 0;
    int below = 0;
    //Parse through array ints
    for(int i = 0; i < args.length; i++){
      int temp = Integer.parseInt(args[i]);
      //Increment above counter if current array int is greater than the given int
      if(temp > input){
        above++;
      }
      //Increment above counter if current array int is less than the given int
      else if(temp < input){
        below++;
      }
    }
    //Print out final values for above and below counters
    System.out.printf("above: %d, below: %d\n",above,below);
  }
}