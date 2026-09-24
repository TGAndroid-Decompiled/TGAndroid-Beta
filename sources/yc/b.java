package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f46935f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f46936a;
    public final String f46937b;
    public final String f46938c;

    public b(String str) {
        String str2;
        this.f46936a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f46937b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f46938c = str2;
        } else {
            this.f46937b = "";
            this.f46938c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f46937b)) {
            Matcher matcher3 = f46935f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
