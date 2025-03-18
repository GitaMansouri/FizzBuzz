
public class Main {
    public static void main(String[] args) {
        int fizz = 3;
        int buzz = 5;
        var start = 1;
        var end = 100;

        for (int i = start; i <= end; i++) {
            var output = "";
            if (i % fizz == 0) {
                output += "Fizz";
                if (i % buzz == 0) {
                    output = "";
                    output += "FizzBuzz";
                }
            }
            else if (i % buzz == 0) {
                output += "Buzz";
            }

            if (output == "") {
                output = Integer.toString(i);
            }
            System.out.println(output);
        }

    }
}
