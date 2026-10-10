package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.is;
public abstract class f {
    public static final DecelerateInterpolator f49019a = new DecelerateInterpolator();
    public static final LinearInterpolator f49020b;
    public static final e f49021c;
    public static final e d;
    public static final e f49022e;
    public static final e f49023f;
    public static final e f49024g;
    public static final e h;
    public static final e f49025i;
    public static final e f49026j;
    public static final e f49027k;
    public static final e f49028l;
    public static final e f49029m;
    public static final e f49030n;
    public static final e f49031o;
    public static final e f49032p;
    public static final e f49033q;
    public static final e f49034r;
    public static final e f49035s;
    public static final e f49036t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f49020b = linearInterpolator;
        f49021c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f49022e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f49023f = h.i(new is(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f49024g = h.i(new is(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f49025i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        is isVar = is.h;
        f49026j = h.i(isVar, 0, 320, 560, false);
        f49027k = h.i(isVar, 40, 320, 560, false);
        f49028l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f49029m = h.i(isVar, 0, 460, 560, false);
        f49030n = h.i(isVar, 0, 325, 560, false);
        f49031o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f49032p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f49033q = h.i(isVar, 60, 320, 560, false);
        f49034r = h.i(isVar, 90, 380, 560, false);
        f49035s = h.i(isVar, 110, 440, 560, false);
        f49036t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
