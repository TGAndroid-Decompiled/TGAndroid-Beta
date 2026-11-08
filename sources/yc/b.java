package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f59355e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f59356f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f59357a;
    public final String f59358b;
    public final String f59359c;

    public b(String str) {
        String str2;
        this.f59357a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f59358b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f59355e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f59359c = str2;
        } else {
            this.f59358b = "";
            this.f59359c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f59358b)) {
            Matcher matcher3 = f59356f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
