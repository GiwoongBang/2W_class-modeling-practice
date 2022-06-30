import java.util.Arrays;

public class Main {
    public String solution(int n) {
        String answer = "";

        String s = String.valueOf(n);

        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();

        String[] stringArr = sb.toString().split("");
        int[] numArr = new int[sb.length()];

        for (int i = 0; i < sb.length(); i++) {
            numArr[i] += Integer.parseInt(stringArr[i]);
        }

        int total = 0;

        for (int j = 0; j < numArr.length; j++) {
            total += numArr[j];
            answer = Integer.toString(total);
        }

        StringBuilder stringBuilder1 = new StringBuilder();

        for (int y = 0; y <stringArr.length; y++) {
            if (y <= stringArr.length -2 ) {
                stringBuilder1 = stringBuilder1.append(stringArr[y]).append(" + ");
            } else {
                stringBuilder1 = stringBuilder1.append(stringArr[y]).append(" = ");
            }
        }

        return stringBuilder1 + answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(718253));
    }
}