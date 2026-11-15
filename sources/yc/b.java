package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f60569e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f60570f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f60571a;
    public final String f60572b;
    public final String f60573c;

    public b(String str) {
        String str2;
        this.f60571a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f60572b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f60569e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f60573c = str2;
        } else {
            this.f60572b = "";
            this.f60573c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f60572b)) {
            Matcher matcher3 = f60570f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
