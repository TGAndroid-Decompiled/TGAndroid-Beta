package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f46667f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f46668a;
    public final String f46669b;
    public final String f46670c;

    public b(String str) {
        String str2;
        this.f46668a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f46669b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f46670c = str2;
        } else {
            this.f46669b = "";
            this.f46670c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f46669b)) {
            Matcher matcher3 = f46667f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
