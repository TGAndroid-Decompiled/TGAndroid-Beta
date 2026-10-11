package zc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f54443e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f54444f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f54445a;
    public final String f54446b;
    public final String f54447c;

    public b(String str) {
        String str2;
        this.f54445a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f54446b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f54443e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f54447c = str2;
        } else {
            this.f54446b = "";
            this.f54447c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f54446b)) {
            Matcher matcher3 = f54444f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
