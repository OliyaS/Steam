package framework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonFunction {

    private static String template = "-?(\\d+[.,]?\\d+)%?";
    private static String value;
    public CommonFunction() {
    }

    public static String regexGetMatch(String text) {
        Pattern pattern = Pattern.compile(template);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            value = matcher.group(1);
        }
        return value;
    }
}
