public class Calculator {

        private int solution;
        private static int x;
        private static int y;
        private char operators;

        public Calculator() {
            solution = 0;
        }

        public int addition(int x, int y) {
            return x + y;
        }

        public int subtraction(int x, int y) {
            return x - y;
        }

        public int multiplication(int x, int y) {
            return x * y;
        }

        public int division(int x, int y) {
            solution = x / y;
            return solution;
        }
        public int square(int x){
            solution = x * x;
            return solution;
        }

        public void calc(int ops, Integer x, Integer y) {

            switch (ops) {
                case (1):
                    System.out.println(addition(x, y));

                    //    operands.next();
                    break;
                case (2):
                    System.out.println(subtraction(x, y));
                    // operands.next();
                    break;
                case (3):
                    System.out.println(multiplication(x, y));
                    //  operands.next();
                    break;
                case (4):
                    System.out.println(division(x, y));
                    //  operands.next();
                    break;
                case(5):
                    System.out.println(square(x));
                    //operands.next();
                    break;
            }
        }
    };




