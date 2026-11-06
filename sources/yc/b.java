package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f59260e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f59261f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f59262a;
    public final String f59263b;
    public final String f59264c;

    public b(String str) {
        String str2;
        this.f59262a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f59263b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f59260e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f59264c = str2;
        } else {
            this.f59263b = "";
            this.f59264c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f59263b)) {
            Matcher matcher3 = f59261f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
