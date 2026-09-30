package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.tr;
public abstract class f {
    public static final DecelerateInterpolator f44161a = new DecelerateInterpolator();
    public static final LinearInterpolator f44162b;
    public static final e f44163c;
    public static final e d;
    public static final e e;
    public static final e f44164f;
    public static final e f44165g;
    public static final e h;
    public static final e f44166i;
    public static final e f44167j;
    public static final e f44168k;
    public static final e f44169l;
    public static final e f44170m;
    public static final e f44171n;
    public static final e f44172o;
    public static final e f44173p;
    public static final e f44174q;
    public static final e f44175r;
    public static final e f44176s;
    public static final e f44177t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f44162b = linearInterpolator;
        f44163c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f44164f = h.i(new tr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f44165g = h.i(new tr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f44166i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        tr trVar = tr.h;
        f44167j = h.i(trVar, 0, 320, 560, false);
        f44168k = h.i(trVar, 40, 320, 560, false);
        f44169l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f44170m = h.i(trVar, 0, 460, 560, false);
        f44171n = h.i(trVar, 0, 325, 560, false);
        f44172o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f44173p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f44174q = h.i(trVar, 60, 320, 560, false);
        f44175r = h.i(trVar, 90, 380, 560, false);
        f44176s = h.i(trVar, 110, 440, 560, false);
        f44177t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
