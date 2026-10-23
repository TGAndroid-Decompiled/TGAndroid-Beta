package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.bs;
public abstract class f {
    public static final DecelerateInterpolator f48854a = new DecelerateInterpolator();
    public static final LinearInterpolator f48855b;
    public static final e f48856c;
    public static final e d;
    public static final e e;
    public static final e f48857f;
    public static final e f48858g;
    public static final e h;
    public static final e f48859i;
    public static final e f48860j;
    public static final e f48861k;
    public static final e f48862l;
    public static final e f48863m;
    public static final e f48864n;
    public static final e f48865o;
    public static final e f48866p;
    public static final e f48867q;
    public static final e f48868r;
    public static final e f48869s;
    public static final e f48870t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f48855b = linearInterpolator;
        f48856c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f48857f = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f48858g = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f48859i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        bs bsVar = bs.h;
        f48860j = h.i(bsVar, 0, 320, 560, false);
        f48861k = h.i(bsVar, 40, 320, 560, false);
        f48862l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f48863m = h.i(bsVar, 0, 460, 560, false);
        f48864n = h.i(bsVar, 0, 325, 560, false);
        f48865o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f48866p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f48867q = h.i(bsVar, 60, 320, 560, false);
        f48868r = h.i(bsVar, 90, 380, 560, false);
        f48869s = h.i(bsVar, 110, 440, 560, false);
        f48870t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
