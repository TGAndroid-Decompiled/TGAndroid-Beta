package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.bs;
public abstract class f {
    public static final DecelerateInterpolator f48412a = new DecelerateInterpolator();
    public static final LinearInterpolator f48413b;
    public static final e f48414c;
    public static final e d;
    public static final e e;
    public static final e f48415f;
    public static final e f48416g;
    public static final e h;
    public static final e f48417i;
    public static final e f48418j;
    public static final e f48419k;
    public static final e f48420l;
    public static final e f48421m;
    public static final e f48422n;
    public static final e f48423o;
    public static final e f48424p;
    public static final e f48425q;
    public static final e f48426r;
    public static final e f48427s;
    public static final e f48428t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f48413b = linearInterpolator;
        f48414c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f48415f = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f48416g = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f48417i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        bs bsVar = bs.h;
        f48418j = h.i(bsVar, 0, 320, 560, false);
        f48419k = h.i(bsVar, 40, 320, 560, false);
        f48420l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f48421m = h.i(bsVar, 0, 460, 560, false);
        f48422n = h.i(bsVar, 0, 325, 560, false);
        f48423o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f48424p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f48425q = h.i(bsVar, 60, 320, 560, false);
        f48426r = h.i(bsVar, 90, 380, 560, false);
        f48427s = h.i(bsVar, 110, 440, 560, false);
        f48428t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
