package sc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f48156f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f48157a;
    public final String f48158b;
    public final String f48159c;

    public b(String str) {
        String str2;
        this.f48157a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f48158b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f48159c = str2;
        } else {
            this.f48158b = "";
            this.f48159c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f48158b)) {
            Matcher matcher3 = f48156f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
