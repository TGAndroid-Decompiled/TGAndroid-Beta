package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.lr;
public abstract class f {
    public static final DecelerateInterpolator f59889a = new DecelerateInterpolator();
    public static final LinearInterpolator f59890b;
    public static final e f59891c;
    public static final e d;
    public static final e f59892e;
    public static final e f59893f;
    public static final e f59894g;
    public static final e h;
    public static final e f59895i;
    public static final e f59896j;
    public static final e f59897k;
    public static final e f59898l;
    public static final e f59899m;
    public static final e f59900n;
    public static final e f59901o;
    public static final e f59902p;
    public static final e f59903q;
    public static final e f59904r;
    public static final e f59905s;
    public static final e f59906t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f59890b = linearInterpolator;
        f59891c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f59892e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f59893f = h.i(new lr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f59894g = h.i(new lr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f59895i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        lr lrVar = lr.h;
        f59896j = h.i(lrVar, 0, 320, 560, false);
        f59897k = h.i(lrVar, 40, 320, 560, false);
        f59898l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f59899m = h.i(lrVar, 0, 460, 560, false);
        f59900n = h.i(lrVar, 0, 325, 560, false);
        f59901o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f59902p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f59903q = h.i(lrVar, 60, 320, 560, false);
        f59904r = h.i(lrVar, 90, 380, 560, false);
        f59905s = h.i(lrVar, 110, 440, 560, false);
        f59906t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
