package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.er;
public abstract class f {
    public static final DecelerateInterpolator f59325a = new DecelerateInterpolator();
    public static final LinearInterpolator f59326b;
    public static final e f59327c;
    public static final e d;
    public static final e f59328e;
    public static final e f59329f;
    public static final e f59330g;
    public static final e h;
    public static final e f59331i;
    public static final e f59332j;
    public static final e f59333k;
    public static final e f59334l;
    public static final e f59335m;
    public static final e f59336n;
    public static final e f59337o;
    public static final e f59338p;
    public static final e f59339q;
    public static final e f59340r;
    public static final e f59341s;
    public static final e f59342t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f59326b = linearInterpolator;
        f59327c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f59328e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f59329f = h.i(new er(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f59330g = h.i(new er(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f59331i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        er erVar = er.h;
        f59332j = h.i(erVar, 0, 320, 560, false);
        f59333k = h.i(erVar, 40, 320, 560, false);
        f59334l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f59335m = h.i(erVar, 0, 460, 560, false);
        f59336n = h.i(erVar, 0, 325, 560, false);
        f59337o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f59338p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f59339q = h.i(erVar, 60, 320, 560, false);
        f59340r = h.i(erVar, 90, 380, 560, false);
        f59341s = h.i(erVar, 110, 440, 560, false);
        f59342t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
