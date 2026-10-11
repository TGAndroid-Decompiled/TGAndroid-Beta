package zc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f54409e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f54410f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f54411a;
    public final String f54412b;
    public final String f54413c;

    public b(String str) {
        String str2;
        this.f54411a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f54412b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f54409e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f54413c = str2;
        } else {
            this.f54412b = "";
            this.f54413c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f54412b)) {
            Matcher matcher3 = f54410f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
