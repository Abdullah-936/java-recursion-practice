public class TaskTen {
        public static void main(String[] args) {
            int numRows = 5;
            System.out.println("Printing a descending star pattern with recursion...");

            printPatternRecursive(numRows, numRows);

        }


        public static void printPatternRecursive(int rows, int cols) {
            // Base case: no more rows left
            if (rows == 0) {
                return;
            }

            if (cols > 0) {
                // Print a star and continue with remaining columns
                System.out.print("* ");
                printPatternRecursive(rows, cols - 1);
            } else {
                // Move to next line, decrease rows, reset cols
                System.out.println();
                printPatternRecursive(rows - 1, rows - 1);
            }
        }
    }
