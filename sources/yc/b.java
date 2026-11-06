package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f59259e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f59260f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f59261a;
    public final String f59262b;
    public final String f59263c;

    public b(String str) {
        String str2;
        this.f59261a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f59262b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f59259e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f59263c = str2;
        } else {
            this.f59262b = "";
            this.f59263c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f59262b)) {
            Matcher matcher3 = f59260f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
