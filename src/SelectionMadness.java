public class SelectionMadness
{
    // No instance variables //

    // no-parameter constructor with "empty" body since no instance variables
    public SelectionMadness() { }

    /* Simulates randomly flipping a fair coin and returning true for heads and
       false for tails; hint: this method should use the Math.random() method to
       generate a random number.  This method returns true (heads) 50% of the
       time and false (tails) 50% of the time, on average.
     */
    public boolean flipCoin() {
        int ranNum = (int)(Math.random() * 2 ) + 1;
        if (ranNum == 1){
            return true;
        } else {
            return false;
        }
    }


    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
        if ((num1 > num2) && (num1 > num3)){
            return num1;
        } else if (num2 > num3){
            return num2;
        } else {
            return num3;
        }
    }


    /* Returns true if the three provided lengths create a right triangle, in
       other words, a2 + b2 = c2, where c is the longest side; returns false
       Otherwise (hint: use the largest() method that you wrote above!).
       Be careful -- this is a bit more challenging than it seems!  Consider if
       side1 = 3, side2 = 4, and side3 = 5 vs. if side1 = 5, side2 = 4, and
       side3 = 3 -- will your code work regardless of which side is the longest
       of the three?
     */
    public boolean rightTriangle(int side1, int side2, int side3) {
        int largestSide = largest(side1, side2, side3);
        if (largestSide == side1){
            return ((Math.pow(side2, 2) + Math.pow(side3, 2)) == Math.pow(side1, 2));
        }
        if (largestSide == side2){
            return ((Math.pow(side1, 2) + Math.pow(side3, 2)) == Math.pow(side2, 2));
        }
        if (largestSide == side3){
            return ((Math.pow(side1, 2) + Math.pow(side2, 2)) == Math.pow(side3, 2));
        }
        return true;
    }

}
