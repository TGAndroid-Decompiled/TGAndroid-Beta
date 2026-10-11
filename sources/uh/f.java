package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.is;
public abstract class f {
    public static final DecelerateInterpolator f49062a = new DecelerateInterpolator();
    public static final LinearInterpolator f49063b;
    public static final e f49064c;
    public static final e d;
    public static final e f49065e;
    public static final e f49066f;
    public static final e f49067g;
    public static final e h;
    public static final e f49068i;
    public static final e f49069j;
    public static final e f49070k;
    public static final e f49071l;
    public static final e f49072m;
    public static final e f49073n;
    public static final e f49074o;
    public static final e f49075p;
    public static final e f49076q;
    public static final e f49077r;
    public static final e f49078s;
    public static final e f49079t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f49063b = linearInterpolator;
        f49064c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f49065e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f49066f = h.i(new is(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f49067g = h.i(new is(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f49068i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        is isVar = is.h;
        f49069j = h.i(isVar, 0, 320, 560, false);
        f49070k = h.i(isVar, 40, 320, 560, false);
        f49071l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f49072m = h.i(isVar, 0, 460, 560, false);
        f49073n = h.i(isVar, 0, 325, 560, false);
        f49074o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f49075p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f49076q = h.i(isVar, 60, 320, 560, false);
        f49077r = h.i(isVar, 90, 380, 560, false);
        f49078s = h.i(isVar, 110, 440, 560, false);
        f49079t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
