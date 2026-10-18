package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.bs;
public abstract class f {
    public static final DecelerateInterpolator f48452a = new DecelerateInterpolator();
    public static final LinearInterpolator f48453b;
    public static final e f48454c;
    public static final e d;
    public static final e e;
    public static final e f48455f;
    public static final e f48456g;
    public static final e h;
    public static final e f48457i;
    public static final e f48458j;
    public static final e f48459k;
    public static final e f48460l;
    public static final e f48461m;
    public static final e f48462n;
    public static final e f48463o;
    public static final e f48464p;
    public static final e f48465q;
    public static final e f48466r;
    public static final e f48467s;
    public static final e f48468t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f48453b = linearInterpolator;
        f48454c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f48455f = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f48456g = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f48457i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        bs bsVar = bs.h;
        f48458j = h.i(bsVar, 0, 320, 560, false);
        f48459k = h.i(bsVar, 40, 320, 560, false);
        f48460l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f48461m = h.i(bsVar, 0, 460, 560, false);
        f48462n = h.i(bsVar, 0, 325, 560, false);
        f48463o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f48464p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f48465q = h.i(bsVar, 60, 320, 560, false);
        f48466r = h.i(bsVar, 90, 380, 560, false);
        f48467s = h.i(bsVar, 110, 440, 560, false);
        f48468t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
