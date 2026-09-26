package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.rr;
public abstract class f {
    public static final DecelerateInterpolator f44053a = new DecelerateInterpolator();
    public static final LinearInterpolator f44054b;
    public static final e f44055c;
    public static final e d;
    public static final e e;
    public static final e f44056f;
    public static final e f44057g;
    public static final e h;
    public static final e f44058i;
    public static final e f44059j;
    public static final e f44060k;
    public static final e f44061l;
    public static final e f44062m;
    public static final e f44063n;
    public static final e f44064o;
    public static final e f44065p;
    public static final e f44066q;
    public static final e f44067r;
    public static final e f44068s;
    public static final e f44069t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f44054b = linearInterpolator;
        f44055c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f44056f = h.i(new rr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f44057g = h.i(new rr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f44058i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        rr rrVar = rr.h;
        f44059j = h.i(rrVar, 0, 320, 560, false);
        f44060k = h.i(rrVar, 40, 320, 560, false);
        f44061l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f44062m = h.i(rrVar, 0, 460, 560, false);
        f44063n = h.i(rrVar, 0, 325, 560, false);
        f44064o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f44065p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f44066q = h.i(rrVar, 60, 320, 560, false);
        f44067r = h.i(rrVar, 90, 380, 560, false);
        f44068s = h.i(rrVar, 110, 440, 560, false);
        f44069t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
