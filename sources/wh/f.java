package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.ds;
public abstract class f {
    public static final DecelerateInterpolator f51226a = new DecelerateInterpolator();
    public static final LinearInterpolator f51227b;
    public static final e f51228c;
    public static final e d;
    public static final e e;
    public static final e f51229f;
    public static final e f51230g;
    public static final e h;
    public static final e f51231i;
    public static final e f51232j;
    public static final e f51233k;
    public static final e f51234l;
    public static final e f51235m;
    public static final e f51236n;
    public static final e f51237o;
    public static final e f51238p;
    public static final e f51239q;
    public static final e f51240r;
    public static final e f51241s;
    public static final e f51242t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f51227b = linearInterpolator;
        f51228c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f51229f = h.i(new ds(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f51230g = h.i(new ds(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f51231i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        ds dsVar = ds.h;
        f51232j = h.i(dsVar, 0, 320, 560, false);
        f51233k = h.i(dsVar, 40, 320, 560, false);
        f51234l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f51235m = h.i(dsVar, 0, 460, 560, false);
        f51236n = h.i(dsVar, 0, 325, 560, false);
        f51237o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f51238p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f51239q = h.i(dsVar, 60, 320, 560, false);
        f51240r = h.i(dsVar, 90, 380, 560, false);
        f51241s = h.i(dsVar, 110, 440, 560, false);
        f51242t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
