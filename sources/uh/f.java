package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.hs;
public abstract class f {
    public static final DecelerateInterpolator f48975a = new DecelerateInterpolator();
    public static final LinearInterpolator f48976b;
    public static final e f48977c;
    public static final e d;
    public static final e f48978e;
    public static final e f48979f;
    public static final e f48980g;
    public static final e h;
    public static final e f48981i;
    public static final e f48982j;
    public static final e f48983k;
    public static final e f48984l;
    public static final e f48985m;
    public static final e f48986n;
    public static final e f48987o;
    public static final e f48988p;
    public static final e f48989q;
    public static final e f48990r;
    public static final e f48991s;
    public static final e f48992t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f48976b = linearInterpolator;
        f48977c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f48978e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f48979f = h.i(new hs(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f48980g = h.i(new hs(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f48981i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        hs hsVar = hs.h;
        f48982j = h.i(hsVar, 0, 320, 560, false);
        f48983k = h.i(hsVar, 40, 320, 560, false);
        f48984l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f48985m = h.i(hsVar, 0, 460, 560, false);
        f48986n = h.i(hsVar, 0, 325, 560, false);
        f48987o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f48988p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f48989q = h.i(hsVar, 60, 320, 560, false);
        f48990r = h.i(hsVar, 90, 380, 560, false);
        f48991s = h.i(hsVar, 110, 440, 560, false);
        f48992t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
