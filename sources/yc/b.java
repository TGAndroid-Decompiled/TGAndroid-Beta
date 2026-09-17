package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f49957e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f49958f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f49959a;
    public final String f49960b;
    public final String f49961c;

    public b(String str) {
        String str2;
        this.f49959a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f49960b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f49957e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f49961c = str2;
        } else {
            this.f49960b = "";
            this.f49961c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f49960b)) {
            Matcher matcher3 = f49958f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
