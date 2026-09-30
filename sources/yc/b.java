package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f47054f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f47055a;
    public final String f47056b;
    public final String f47057c;

    public b(String str) {
        String str2;
        this.f47055a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f47056b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f47057c = str2;
        } else {
            this.f47056b = "";
            this.f47057c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f47056b)) {
            Matcher matcher3 = f47054f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
