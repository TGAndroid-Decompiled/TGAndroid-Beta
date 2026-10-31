package sc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f48145f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f48146a;
    public final String f48147b;
    public final String f48148c;

    public b(String str) {
        String str2;
        this.f48146a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f48147b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f48148c = str2;
        } else {
            this.f48147b = "";
            this.f48148c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f48147b)) {
            Matcher matcher3 = f48145f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
