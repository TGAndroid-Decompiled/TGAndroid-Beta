package zc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f54546e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f54547f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f54548a;
    public final String f54549b;
    public final String f54550c;

    public b(String str) {
        String str2;
        this.f54548a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f54549b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f54546e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f54550c = str2;
        } else {
            this.f54549b = "";
            this.f54550c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f54549b)) {
            Matcher matcher3 = f54547f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
