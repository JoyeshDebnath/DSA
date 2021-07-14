// Input: n = 2
// Output: 2
// There are two ways: (1, 1) and (2)

// Input: n = 4
// Output: 5
// (1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2) 
package Dynamic_Programming;

public class Staircase_rec {

    public static int Ways(int n) {
        // base case
        if (n <= 1) {
            return n;
        }
        return Ways(n - 1) + Ways(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Ways to reach nth stair case =" + Ways(n + 1));
    }

}
