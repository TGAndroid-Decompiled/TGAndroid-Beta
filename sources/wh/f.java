package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.xq;
public abstract class f {
    public static final DecelerateInterpolator f57781a = new DecelerateInterpolator();
    public static final LinearInterpolator f57782b;
    public static final e f57783c;
    public static final e d;
    public static final e f57784e;
    public static final e f57785f;
    public static final e f57786g;
    public static final e h;
    public static final e f57787i;
    public static final e f57788j;
    public static final e f57789k;
    public static final e f57790l;
    public static final e f57791m;
    public static final e f57792n;
    public static final e f57793o;
    public static final e f57794p;
    public static final e f57795q;
    public static final e f57796r;
    public static final e f57797s;
    public static final e f57798t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f57782b = linearInterpolator;
        f57783c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f57784e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f57785f = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f57786g = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f57787i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        xq xqVar = xq.h;
        f57788j = h.i(xqVar, 0, 320, 560, false);
        f57789k = h.i(xqVar, 40, 320, 560, false);
        f57790l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f57791m = h.i(xqVar, 0, 460, 560, false);
        f57792n = h.i(xqVar, 0, 325, 560, false);
        f57793o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f57794p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f57795q = h.i(xqVar, 60, 320, 560, false);
        f57796r = h.i(xqVar, 90, 380, 560, false);
        f57797s = h.i(xqVar, 110, 440, 560, false);
        f57798t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
