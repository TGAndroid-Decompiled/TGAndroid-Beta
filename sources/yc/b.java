package yc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f61176e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f61177f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f61178a;
    public final String f61179b;
    public final String f61180c;

    public b(String str) {
        String str2;
        this.f61178a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f61179b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f61176e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f61180c = str2;
        } else {
            this.f61179b = "";
            this.f61180c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f61179b)) {
            Matcher matcher3 = f61177f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
