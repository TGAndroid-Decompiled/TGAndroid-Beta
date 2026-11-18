package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f61134e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f61135f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f61136a;
    public final String f61137b;
    public final String f61138c;

    public b(String str) {
        String str2;
        this.f61136a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f61137b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f61134e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f61138c = str2;
        } else {
            this.f61137b = "";
            this.f61138c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f61137b)) {
            Matcher matcher3 = f61135f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
