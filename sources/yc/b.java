package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f50817e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f50818f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f50819a;
    public final String f50820b;
    public final String f50821c;

    public b(String str) {
        String str2;
        this.f50819a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f50820b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f50817e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f50821c = str2;
        } else {
            this.f50820b = "";
            this.f50821c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f50820b)) {
            Matcher matcher3 = f50818f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
