package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f59235e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f59236f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f59237a;
    public final String f59238b;
    public final String f59239c;

    public b(String str) {
        String str2;
        this.f59237a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f59238b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f59235e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f59239c = str2;
        } else {
            this.f59238b = "";
            this.f59239c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f59238b)) {
            Matcher matcher3 = f59236f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
