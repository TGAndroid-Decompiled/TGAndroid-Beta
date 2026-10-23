package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.bs;
public abstract class f {
    public static final DecelerateInterpolator f48416a = new DecelerateInterpolator();
    public static final LinearInterpolator f48417b;
    public static final e f48418c;
    public static final e d;
    public static final e e;
    public static final e f48419f;
    public static final e f48420g;
    public static final e h;
    public static final e f48421i;
    public static final e f48422j;
    public static final e f48423k;
    public static final e f48424l;
    public static final e f48425m;
    public static final e f48426n;
    public static final e f48427o;
    public static final e f48428p;
    public static final e f48429q;
    public static final e f48430r;
    public static final e f48431s;
    public static final e f48432t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f48417b = linearInterpolator;
        f48418c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f48419f = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f48420g = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f48421i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        bs bsVar = bs.h;
        f48422j = h.i(bsVar, 0, 320, 560, false);
        f48423k = h.i(bsVar, 40, 320, 560, false);
        f48424l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f48425m = h.i(bsVar, 0, 460, 560, false);
        f48426n = h.i(bsVar, 0, 325, 560, false);
        f48427o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f48428p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f48429q = h.i(bsVar, 60, 320, 560, false);
        f48430r = h.i(bsVar, 90, 380, 560, false);
        f48431s = h.i(bsVar, 110, 440, 560, false);
        f48432t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
