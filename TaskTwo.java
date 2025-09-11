public class TaskTwo {
        public static void main(String[] args) {
            String original = "Hello World";
            String reversed = "";
            System.out.println("Reversing string using recursion...");

            reversed = reverseStringRecursive(original);

            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
        }


        public static String reverseStringRecursive(String str) {

            if (str == null || str.length() <= 1) {
                return str;
            }

            return reverseStringRecursive(str.substring(1)) + str.charAt(0);
        }
    }

