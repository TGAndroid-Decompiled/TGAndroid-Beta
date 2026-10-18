package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.bs;
public abstract class f {
    public static final DecelerateInterpolator f48405a = new DecelerateInterpolator();
    public static final LinearInterpolator f48406b;
    public static final e f48407c;
    public static final e d;
    public static final e e;
    public static final e f48408f;
    public static final e f48409g;
    public static final e h;
    public static final e f48410i;
    public static final e f48411j;
    public static final e f48412k;
    public static final e f48413l;
    public static final e f48414m;
    public static final e f48415n;
    public static final e f48416o;
    public static final e f48417p;
    public static final e f48418q;
    public static final e f48419r;
    public static final e f48420s;
    public static final e f48421t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f48406b = linearInterpolator;
        f48407c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f48408f = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f48409g = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f48410i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        bs bsVar = bs.h;
        f48411j = h.i(bsVar, 0, 320, 560, false);
        f48412k = h.i(bsVar, 40, 320, 560, false);
        f48413l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f48414m = h.i(bsVar, 0, 460, 560, false);
        f48415n = h.i(bsVar, 0, 325, 560, false);
        f48416o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f48417p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f48418q = h.i(bsVar, 60, 320, 560, false);
        f48419r = h.i(bsVar, 90, 380, 560, false);
        f48420s = h.i(bsVar, 110, 440, 560, false);
        f48421t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
