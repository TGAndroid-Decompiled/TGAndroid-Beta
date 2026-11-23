package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f61264e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f61265f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f61266a;
    public final String f61267b;
    public final String f61268c;

    public b(String str) {
        String str2;
        this.f61266a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f61267b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f61264e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f61268c = str2;
        } else {
            this.f61267b = "";
            this.f61268c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f61267b)) {
            Matcher matcher3 = f61265f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
