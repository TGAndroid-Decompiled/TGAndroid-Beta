package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f49927e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f49928f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f49929a;
    public final String f49930b;
    public final String f49931c;

    public b(String str) {
        String str2;
        this.f49929a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f49930b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f49927e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f49931c = str2;
        } else {
            this.f49930b = "";
            this.f49931c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f49930b)) {
            Matcher matcher3 = f49928f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
