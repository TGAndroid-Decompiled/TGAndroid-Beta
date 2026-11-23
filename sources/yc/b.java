package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f61145e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f61146f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f61147a;
    public final String f61148b;
    public final String f61149c;

    public b(String str) {
        String str2;
        this.f61147a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f61148b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f61145e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f61149c = str2;
        } else {
            this.f61148b = "";
            this.f61149c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f61148b)) {
            Matcher matcher3 = f61146f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
