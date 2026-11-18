package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f61135e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f61136f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f61137a;
    public final String f61138b;
    public final String f61139c;

    public b(String str) {
        String str2;
        this.f61137a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f61138b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f61135e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f61139c = str2;
        } else {
            this.f61138b = "";
            this.f61139c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f61138b)) {
            Matcher matcher3 = f61136f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
