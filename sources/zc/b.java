package zc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f54366e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f54367f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f54368a;
    public final String f54369b;
    public final String f54370c;

    public b(String str) {
        String str2;
        this.f54368a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f54369b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f54366e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f54370c = str2;
        } else {
            this.f54369b = "";
            this.f54370c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f54369b)) {
            Matcher matcher3 = f54367f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
