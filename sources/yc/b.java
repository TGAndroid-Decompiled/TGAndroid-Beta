package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f50824e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f50825f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f50826a;
    public final String f50827b;
    public final String f50828c;

    public b(String str) {
        String str2;
        this.f50826a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f50827b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f50824e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f50828c = str2;
        } else {
            this.f50827b = "";
            this.f50828c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f50827b)) {
            Matcher matcher3 = f50825f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
