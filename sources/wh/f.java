package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.lr;
public abstract class f {
    public static final DecelerateInterpolator f59890a = new DecelerateInterpolator();
    public static final LinearInterpolator f59891b;
    public static final e f59892c;
    public static final e d;
    public static final e f59893e;
    public static final e f59894f;
    public static final e f59895g;
    public static final e h;
    public static final e f59896i;
    public static final e f59897j;
    public static final e f59898k;
    public static final e f59899l;
    public static final e f59900m;
    public static final e f59901n;
    public static final e f59902o;
    public static final e f59903p;
    public static final e f59904q;
    public static final e f59905r;
    public static final e f59906s;
    public static final e f59907t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f59891b = linearInterpolator;
        f59892c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f59893e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f59894f = h.i(new lr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f59895g = h.i(new lr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f59896i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        lr lrVar = lr.h;
        f59897j = h.i(lrVar, 0, 320, 560, false);
        f59898k = h.i(lrVar, 40, 320, 560, false);
        f59899l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f59900m = h.i(lrVar, 0, 460, 560, false);
        f59901n = h.i(lrVar, 0, 325, 560, false);
        f59902o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f59903p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f59904q = h.i(lrVar, 60, 320, 560, false);
        f59905r = h.i(lrVar, 90, 380, 560, false);
        f59906s = h.i(lrVar, 110, 440, 560, false);
        f59907t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
