package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.pr;
public abstract class f {
    public static final DecelerateInterpolator f47885a = new DecelerateInterpolator();
    public static final LinearInterpolator f47886b;
    public static final e f47887c;
    public static final e d;
    public static final e f47888e;
    public static final e f47889f;
    public static final e f47890g;
    public static final e h;
    public static final e f47891i;
    public static final e f47892j;
    public static final e f47893k;
    public static final e f47894l;
    public static final e f47895m;
    public static final e f47896n;
    public static final e f47897o;
    public static final e f47898p;
    public static final e f47899q;
    public static final e f47900r;
    public static final e f47901s;
    public static final e f47902t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f47886b = linearInterpolator;
        f47887c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f47888e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f47889f = h.i(new pr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f47890g = h.i(new pr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f47891i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        pr prVar = pr.h;
        f47892j = h.i(prVar, 0, 320, 560, false);
        f47893k = h.i(prVar, 40, 320, 560, false);
        f47894l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f47895m = h.i(prVar, 0, 460, 560, false);
        f47896n = h.i(prVar, 0, 325, 560, false);
        f47897o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f47898p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f47899q = h.i(prVar, 60, 320, 560, false);
        f47900r = h.i(prVar, 90, 380, 560, false);
        f47901s = h.i(prVar, 110, 440, 560, false);
        f47902t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
