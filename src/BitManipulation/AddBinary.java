package BitManipulation;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010","1011"));
    }

    static String addBinary(String a, String b) {
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);

        StringBuilder str = new StringBuilder();
        int sum = n1 + n2;
        System.out.println("sum before: " + sum);
        while (sum / 2 != 1) {
            str.append(sum % 2);
            sum /= 2;
        }
        System.out.println("sum after: " + sum);
        str.append(1);
        str.reverse();
        return str.toString();
    }
}
