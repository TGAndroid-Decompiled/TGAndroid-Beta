package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f50809e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f50810f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f50811a;
    public final String f50812b;
    public final String f50813c;

    public b(String str) {
        String str2;
        this.f50811a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f50812b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f50809e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f50813c = str2;
        } else {
            this.f50812b = "";
            this.f50813c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f50812b)) {
            Matcher matcher3 = f50810f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
