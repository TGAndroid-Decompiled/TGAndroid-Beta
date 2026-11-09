package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.xq;
public abstract class f {
    public static final DecelerateInterpolator f57885a = new DecelerateInterpolator();
    public static final LinearInterpolator f57886b;
    public static final e f57887c;
    public static final e d;
    public static final e f57888e;
    public static final e f57889f;
    public static final e f57890g;
    public static final e h;
    public static final e f57891i;
    public static final e f57892j;
    public static final e f57893k;
    public static final e f57894l;
    public static final e f57895m;
    public static final e f57896n;
    public static final e f57897o;
    public static final e f57898p;
    public static final e f57899q;
    public static final e f57900r;
    public static final e f57901s;
    public static final e f57902t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f57886b = linearInterpolator;
        f57887c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f57888e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f57889f = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f57890g = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f57891i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        xq xqVar = xq.h;
        f57892j = h.i(xqVar, 0, 320, 560, false);
        f57893k = h.i(xqVar, 40, 320, 560, false);
        f57894l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f57895m = h.i(xqVar, 0, 460, 560, false);
        f57896n = h.i(xqVar, 0, 325, 560, false);
        f57897o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f57898p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f57899q = h.i(xqVar, 60, 320, 560, false);
        f57900r = h.i(xqVar, 90, 380, 560, false);
        f57901s = h.i(xqVar, 110, 440, 560, false);
        f57902t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
