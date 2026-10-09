package zc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f54322e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f54323f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f54324a;
    public final String f54325b;
    public final String f54326c;

    public b(String str) {
        String str2;
        this.f54324a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f54325b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f54322e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f54326c = str2;
        } else {
            this.f54325b = "";
            this.f54326c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f54325b)) {
            Matcher matcher3 = f54323f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
