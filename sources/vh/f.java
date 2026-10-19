package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.bs;
public abstract class f {
    public static final DecelerateInterpolator f48407a = new DecelerateInterpolator();
    public static final LinearInterpolator f48408b;
    public static final e f48409c;
    public static final e d;
    public static final e e;
    public static final e f48410f;
    public static final e f48411g;
    public static final e h;
    public static final e f48412i;
    public static final e f48413j;
    public static final e f48414k;
    public static final e f48415l;
    public static final e f48416m;
    public static final e f48417n;
    public static final e f48418o;
    public static final e f48419p;
    public static final e f48420q;
    public static final e f48421r;
    public static final e f48422s;
    public static final e f48423t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f48408b = linearInterpolator;
        f48409c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f48410f = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f48411g = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f48412i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        bs bsVar = bs.h;
        f48413j = h.i(bsVar, 0, 320, 560, false);
        f48414k = h.i(bsVar, 40, 320, 560, false);
        f48415l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f48416m = h.i(bsVar, 0, 460, 560, false);
        f48417n = h.i(bsVar, 0, 325, 560, false);
        f48418o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f48419p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f48420q = h.i(bsVar, 60, 320, 560, false);
        f48421r = h.i(bsVar, 90, 380, 560, false);
        f48422s = h.i(bsVar, 110, 440, 560, false);
        f48423t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
