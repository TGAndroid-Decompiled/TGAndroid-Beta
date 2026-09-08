package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f49956e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f49957f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f49958a;
    public final String f49959b;
    public final String f49960c;

    public b(String str) {
        String str2;
        this.f49958a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f49959b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f49956e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f49960c = str2;
        } else {
            this.f49959b = "";
            this.f49960c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f49959b)) {
            Matcher matcher3 = f49957f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
