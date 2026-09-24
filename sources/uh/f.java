package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.rr;
public abstract class f {
    public static final DecelerateInterpolator f44039a = new DecelerateInterpolator();
    public static final LinearInterpolator f44040b;
    public static final e f44041c;
    public static final e d;
    public static final e e;
    public static final e f44042f;
    public static final e f44043g;
    public static final e h;
    public static final e f44044i;
    public static final e f44045j;
    public static final e f44046k;
    public static final e f44047l;
    public static final e f44048m;
    public static final e f44049n;
    public static final e f44050o;
    public static final e f44051p;
    public static final e f44052q;
    public static final e f44053r;
    public static final e f44054s;
    public static final e f44055t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f44040b = linearInterpolator;
        f44041c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f44042f = h.i(new rr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f44043g = h.i(new rr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f44044i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        rr rrVar = rr.h;
        f44045j = h.i(rrVar, 0, 320, 560, false);
        f44046k = h.i(rrVar, 40, 320, 560, false);
        f44047l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f44048m = h.i(rrVar, 0, 460, 560, false);
        f44049n = h.i(rrVar, 0, 325, 560, false);
        f44050o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f44051p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f44052q = h.i(rrVar, 60, 320, 560, false);
        f44053r = h.i(rrVar, 90, 380, 560, false);
        f44054s = h.i(rrVar, 110, 440, 560, false);
        f44055t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
