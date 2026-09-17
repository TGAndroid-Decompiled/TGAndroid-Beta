package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.pr;
public abstract class f {
    public static final DecelerateInterpolator f47886a = new DecelerateInterpolator();
    public static final LinearInterpolator f47887b;
    public static final e f47888c;
    public static final e d;
    public static final e f47889e;
    public static final e f47890f;
    public static final e f47891g;
    public static final e h;
    public static final e f47892i;
    public static final e f47893j;
    public static final e f47894k;
    public static final e f47895l;
    public static final e f47896m;
    public static final e f47897n;
    public static final e f47898o;
    public static final e f47899p;
    public static final e f47900q;
    public static final e f47901r;
    public static final e f47902s;
    public static final e f47903t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f47887b = linearInterpolator;
        f47888c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f47889e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f47890f = h.i(new pr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f47891g = h.i(new pr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f47892i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        pr prVar = pr.h;
        f47893j = h.i(prVar, 0, 320, 560, false);
        f47894k = h.i(prVar, 40, 320, 560, false);
        f47895l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f47896m = h.i(prVar, 0, 460, 560, false);
        f47897n = h.i(prVar, 0, 325, 560, false);
        f47898o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f47899p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f47900q = h.i(prVar, 60, 320, 560, false);
        f47901r = h.i(prVar, 90, 380, 560, false);
        f47902s = h.i(prVar, 110, 440, 560, false);
        f47903t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
