package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.ds;
public abstract class f {
    public static final DecelerateInterpolator f51229a = new DecelerateInterpolator();
    public static final LinearInterpolator f51230b;
    public static final e f51231c;
    public static final e d;
    public static final e e;
    public static final e f51232f;
    public static final e f51233g;
    public static final e h;
    public static final e f51234i;
    public static final e f51235j;
    public static final e f51236k;
    public static final e f51237l;
    public static final e f51238m;
    public static final e f51239n;
    public static final e f51240o;
    public static final e f51241p;
    public static final e f51242q;
    public static final e f51243r;
    public static final e f51244s;
    public static final e f51245t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f51230b = linearInterpolator;
        f51231c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f51232f = h.i(new ds(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f51233g = h.i(new ds(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f51234i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        ds dsVar = ds.h;
        f51235j = h.i(dsVar, 0, 320, 560, false);
        f51236k = h.i(dsVar, 40, 320, 560, false);
        f51237l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f51238m = h.i(dsVar, 0, 460, 560, false);
        f51239n = h.i(dsVar, 0, 325, 560, false);
        f51240o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f51241p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f51242q = h.i(dsVar, 60, 320, 560, false);
        f51243r = h.i(dsVar, 90, 380, 560, false);
        f51244s = h.i(dsVar, 110, 440, 560, false);
        f51245t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
