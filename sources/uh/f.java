package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.rr;
public abstract class f {
    public static final DecelerateInterpolator f43716a = new DecelerateInterpolator();
    public static final LinearInterpolator f43717b;
    public static final e f43718c;
    public static final e d;
    public static final e e;
    public static final e f43719f;
    public static final e f43720g;
    public static final e h;
    public static final e f43721i;
    public static final e f43722j;
    public static final e f43723k;
    public static final e f43724l;
    public static final e f43725m;
    public static final e f43726n;
    public static final e f43727o;
    public static final e f43728p;
    public static final e f43729q;
    public static final e f43730r;
    public static final e f43731s;
    public static final e f43732t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f43717b = linearInterpolator;
        f43718c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f43719f = h.i(new rr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f43720g = h.i(new rr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f43721i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        rr rrVar = rr.h;
        f43722j = h.i(rrVar, 0, 320, 560, false);
        f43723k = h.i(rrVar, 40, 320, 560, false);
        f43724l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f43725m = h.i(rrVar, 0, 460, 560, false);
        f43726n = h.i(rrVar, 0, 325, 560, false);
        f43727o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f43728p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f43729q = h.i(rrVar, 60, 320, 560, false);
        f43730r = h.i(rrVar, 90, 380, 560, false);
        f43731s = h.i(rrVar, 110, 440, 560, false);
        f43732t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
