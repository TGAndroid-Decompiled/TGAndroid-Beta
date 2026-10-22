package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.bs;
public abstract class f {
    public static final DecelerateInterpolator f48415a = new DecelerateInterpolator();
    public static final LinearInterpolator f48416b;
    public static final e f48417c;
    public static final e d;
    public static final e e;
    public static final e f48418f;
    public static final e f48419g;
    public static final e h;
    public static final e f48420i;
    public static final e f48421j;
    public static final e f48422k;
    public static final e f48423l;
    public static final e f48424m;
    public static final e f48425n;
    public static final e f48426o;
    public static final e f48427p;
    public static final e f48428q;
    public static final e f48429r;
    public static final e f48430s;
    public static final e f48431t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f48416b = linearInterpolator;
        f48417c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f48418f = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f48419g = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f48420i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        bs bsVar = bs.h;
        f48421j = h.i(bsVar, 0, 320, 560, false);
        f48422k = h.i(bsVar, 40, 320, 560, false);
        f48423l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f48424m = h.i(bsVar, 0, 460, 560, false);
        f48425n = h.i(bsVar, 0, 325, 560, false);
        f48426o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f48427p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f48428q = h.i(bsVar, 60, 320, 560, false);
        f48429r = h.i(bsVar, 90, 380, 560, false);
        f48430s = h.i(bsVar, 110, 440, 560, false);
        f48431t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
