package w4;

import android.graphics.PointF;
import d5.f0;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class c {
    public static final Pattern f48749a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern f48750b;
    public static final Pattern f48751c;
    public static final Pattern d;

    static {
        int i9 = f0.f4349a;
        Locale locale = Locale.US;
        f48750b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f48751c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) {
        String group;
        String group2;
        Matcher matcher = f48750b.matcher(str);
        Matcher matcher2 = f48751c.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                d5.a.v("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else if (find2) {
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        } else {
            return null;
        }
        group.getClass();
        float parseFloat = Float.parseFloat(group.trim());
        group2.getClass();
        return new PointF(parseFloat, Float.parseFloat(group2.trim()));
    }
}
