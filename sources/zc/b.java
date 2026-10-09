package zc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f54320e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f54321f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f54322a;
    public final String f54323b;
    public final String f54324c;

    public b(String str) {
        String str2;
        this.f54322a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f54323b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f54320e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f54324c = str2;
        } else {
            this.f54323b = "";
            this.f54324c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f54323b)) {
            Matcher matcher3 = f54321f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
