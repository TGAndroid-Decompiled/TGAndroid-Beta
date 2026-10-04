package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f50808e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f50809f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f50810a;
    public final String f50811b;
    public final String f50812c;

    public b(String str) {
        String str2;
        this.f50810a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f50811b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f50808e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f50812c = str2;
        } else {
            this.f50811b = "";
            this.f50812c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f50811b)) {
            Matcher matcher3 = f50809f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
