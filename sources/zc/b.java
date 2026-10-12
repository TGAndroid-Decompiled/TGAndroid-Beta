package zc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f54554e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f54555f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f54556a;
    public final String f54557b;
    public final String f54558c;

    public b(String str) {
        String str2;
        this.f54556a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f54557b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f54554e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f54558c = str2;
        } else {
            this.f54557b = "";
            this.f54558c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f54557b)) {
            Matcher matcher3 = f54555f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
