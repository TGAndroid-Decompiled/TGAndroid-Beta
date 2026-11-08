package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f59354e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f59355f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f59356a;
    public final String f59357b;
    public final String f59358c;

    public b(String str) {
        String str2;
        this.f59356a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f59357b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f59354e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f59358c = str2;
        } else {
            this.f59357b = "";
            this.f59358c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f59357b)) {
            Matcher matcher3 = f59355f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
