/**
 *This program out prints the first digit of a number using a method
 * @author Zachary Balean
 */
public class Main {

  //method for first digit
  public static int firstDigit(int number){
    //if statemetn if the number is negative, makes it positive
    if(number < 0){
      number = number * (-1);
    }
    //for loop for dividing by ten until the first digit
    for(int i = number; number > 9; i++){
      //divides number by 10
      number = number / 10;
    }

    //integer for first digit
    int firstNumber = number  % 10;

    //returns the integer
    return firstNumber;
  }
  
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // calls the method
    int answer = firstDigit(3572);
    //prints the first digit
    System.out.println(answer);
  
  }
}
