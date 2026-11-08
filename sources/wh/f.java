package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.xq;
public abstract class f {
    public static final DecelerateInterpolator f57872a = new DecelerateInterpolator();
    public static final LinearInterpolator f57873b;
    public static final e f57874c;
    public static final e d;
    public static final e f57875e;
    public static final e f57876f;
    public static final e f57877g;
    public static final e h;
    public static final e f57878i;
    public static final e f57879j;
    public static final e f57880k;
    public static final e f57881l;
    public static final e f57882m;
    public static final e f57883n;
    public static final e f57884o;
    public static final e f57885p;
    public static final e f57886q;
    public static final e f57887r;
    public static final e f57888s;
    public static final e f57889t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f57873b = linearInterpolator;
        f57874c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f57875e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f57876f = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f57877g = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f57878i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        xq xqVar = xq.h;
        f57879j = h.i(xqVar, 0, 320, 560, false);
        f57880k = h.i(xqVar, 40, 320, 560, false);
        f57881l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f57882m = h.i(xqVar, 0, 460, 560, false);
        f57883n = h.i(xqVar, 0, 325, 560, false);
        f57884o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f57885p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f57886q = h.i(xqVar, 60, 320, 560, false);
        f57887r = h.i(xqVar, 90, 380, 560, false);
        f57888s = h.i(xqVar, 110, 440, 560, false);
        f57889t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
