package BigSum;

public class BigSum {

    public static String add(final String first, final String second) {
        if(!first.matches("\\d+") || !second.matches("\\d+"))
            throw new IllegalArgumentException();
        StringBuilder result = new StringBuilder();
        int i = first.length() - 1;
        int j = second.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if(i >= 0)
                sum += first.charAt(i--) - '0';
            if(j >= 0)
                sum += second.charAt(j--) - '0';
            result.append(sum % 10);
            carry = sum / 10;
        }
        return result.reverse().toString();
    }

    public static String multiply(String first, String second) {
        if (!first.matches("\\d+") || !second.matches("\\d+"))
            throw new IllegalArgumentException();
        if (first.equals("0") || second.equals("0"))
            return "0";
        if(first.length() == 1 && second.length() == 1)
            return multiply(first, Integer.parseInt(second));
        String result = "0";
        for(int i = second.length() - 1; i >= 0; i--) {
            int number = second.charAt(i) - '0';
            String multiplied = multiply(first, number);
            multiplied += "0".repeat(second.length() - 1 - i);
            result = add(result, multiplied);
        }
        return result;
    }

    private static String multiply(String first, int number) {
        if(number == 0)
            return "0";
        StringBuilder stringBuilder = new StringBuilder();
        int carry = 0;
        for(int i = first.length() - 1; i >= 0; i--) {
            int product = (first.charAt(i) - '0') * number + carry;
            stringBuilder.append(product % 10);
            carry = product / 10;
        }
        while(carry > 0) {
            stringBuilder.append(carry);
            carry /= 10;
        }
        return stringBuilder.reverse().toString();
    }
}
