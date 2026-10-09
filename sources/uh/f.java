package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.hs;
public abstract class f {
    public static final DecelerateInterpolator f48973a = new DecelerateInterpolator();
    public static final LinearInterpolator f48974b;
    public static final e f48975c;
    public static final e d;
    public static final e f48976e;
    public static final e f48977f;
    public static final e f48978g;
    public static final e h;
    public static final e f48979i;
    public static final e f48980j;
    public static final e f48981k;
    public static final e f48982l;
    public static final e f48983m;
    public static final e f48984n;
    public static final e f48985o;
    public static final e f48986p;
    public static final e f48987q;
    public static final e f48988r;
    public static final e f48989s;
    public static final e f48990t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f48974b = linearInterpolator;
        f48975c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f48976e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f48977f = h.i(new hs(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f48978g = h.i(new hs(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f48979i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        hs hsVar = hs.h;
        f48980j = h.i(hsVar, 0, 320, 560, false);
        f48981k = h.i(hsVar, 40, 320, 560, false);
        f48982l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f48983m = h.i(hsVar, 0, 460, 560, false);
        f48984n = h.i(hsVar, 0, 325, 560, false);
        f48985o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f48986p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f48987q = h.i(hsVar, 60, 320, 560, false);
        f48988r = h.i(hsVar, 90, 380, 560, false);
        f48989s = h.i(hsVar, 110, 440, 560, false);
        f48990t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
