package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.xq;
public abstract class f {
    public static final DecelerateInterpolator f57780a = new DecelerateInterpolator();
    public static final LinearInterpolator f57781b;
    public static final e f57782c;
    public static final e d;
    public static final e f57783e;
    public static final e f57784f;
    public static final e f57785g;
    public static final e h;
    public static final e f57786i;
    public static final e f57787j;
    public static final e f57788k;
    public static final e f57789l;
    public static final e f57790m;
    public static final e f57791n;
    public static final e f57792o;
    public static final e f57793p;
    public static final e f57794q;
    public static final e f57795r;
    public static final e f57796s;
    public static final e f57797t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f57781b = linearInterpolator;
        f57782c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f57783e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f57784f = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f57785g = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f57786i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        xq xqVar = xq.h;
        f57787j = h.i(xqVar, 0, 320, 560, false);
        f57788k = h.i(xqVar, 40, 320, 560, false);
        f57789l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f57790m = h.i(xqVar, 0, 460, 560, false);
        f57791n = h.i(xqVar, 0, 325, 560, false);
        f57792o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f57793p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f57794q = h.i(xqVar, 60, 320, 560, false);
        f57795r = h.i(xqVar, 90, 380, 560, false);
        f57796s = h.i(xqVar, 110, 440, 560, false);
        f57797t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
