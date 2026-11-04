package vc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f56519e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f56520f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f56521a;
    public final String f56522b;
    public final String f56523c;

    public b(String str) {
        String str2;
        this.f56521a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f56522b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f56519e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f56523c = str2;
        } else {
            this.f56522b = "";
            this.f56523c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f56522b)) {
            Matcher matcher3 = f56520f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
