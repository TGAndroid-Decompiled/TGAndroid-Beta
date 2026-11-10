package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f59362e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f59363f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f59364a;
    public final String f59365b;
    public final String f59366c;

    public b(String str) {
        String str2;
        this.f59364a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f59365b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f59362e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f59366c = str2;
        } else {
            this.f59365b = "";
            this.f59366c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f59365b)) {
            Matcher matcher3 = f59363f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
