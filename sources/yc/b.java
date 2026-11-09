package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f59364e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f59365f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f59366a;
    public final String f59367b;
    public final String f59368c;

    public b(String str) {
        String str2;
        this.f59366a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f59367b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f59364e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f59368c = str2;
        } else {
            this.f59367b = "";
            this.f59368c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f59367b)) {
            Matcher matcher3 = f59365f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
