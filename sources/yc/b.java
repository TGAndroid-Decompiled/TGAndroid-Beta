package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f59265e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f59266f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f59267a;
    public final String f59268b;
    public final String f59269c;

    public b(String str) {
        String str2;
        this.f59267a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f59268b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f59265e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f59269c = str2;
        } else {
            this.f59268b = "";
            this.f59269c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f59268b)) {
            Matcher matcher3 = f59266f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
