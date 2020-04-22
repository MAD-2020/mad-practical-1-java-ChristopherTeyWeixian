import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     Scanner in = new Scanner(System.in);
     
     //prompt input
     System.out.print("Enter the number of integers:");
     int numberinput= in.nextInt();
     int[]numberlist= new int[numberinput];
     
     //prompt for the previous inputted numbers of integers
     for(int i=0; i<numberinput ;i++)
     {
       System.out.print("Enter number "+(i+1)+" : ");
       numberlist[i]=Integer.parseInt(in.next());
     }

    int number=0;
    int HighestModeCount=0;
    for(int b=0;b<numberlist.length;b++)
    //the number to count for occurences
    {
      int count=0;//Reset count
      for(int c=0;c<numberlist.length;c++)
      {
        if(numberlist[b]==numberlist[c])//count if same numbers
        {
          count++;
        }
      }
      if (count==HighestModeCount && numberlist[b]>number)
      //Take higher number if there is two number that have the same occurences for this question
      {
        number=numberlist[b];
       
      }
      //Overwrite if occurences of the number is higher than the old number
      else if(count>HighestModeCount)
      {
        number=numberlist[b];
        HighestModeCount=count;
      }
    }
    //display
  System.out.print("Mode is "+number);
  }
}
