package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f49928e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f49929f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f49930a;
    public final String f49931b;
    public final String f49932c;

    public b(String str) {
        String str2;
        this.f49930a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f49931b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f49928e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f49932c = str2;
        } else {
            this.f49931b = "";
            this.f49932c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f49931b)) {
            Matcher matcher3 = f49929f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
