package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f46817f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f46818a;
    public final String f46819b;
    public final String f46820c;

    public b(String str) {
        String str2;
        this.f46818a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f46819b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f46820c = str2;
        } else {
            this.f46819b = "";
            this.f46820c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f46819b)) {
            Matcher matcher3 = f46817f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
