package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.bs;
public abstract class f {
    public static final DecelerateInterpolator f48427a = new DecelerateInterpolator();
    public static final LinearInterpolator f48428b;
    public static final e f48429c;
    public static final e d;
    public static final e e;
    public static final e f48430f;
    public static final e f48431g;
    public static final e h;
    public static final e f48432i;
    public static final e f48433j;
    public static final e f48434k;
    public static final e f48435l;
    public static final e f48436m;
    public static final e f48437n;
    public static final e f48438o;
    public static final e f48439p;
    public static final e f48440q;
    public static final e f48441r;
    public static final e f48442s;
    public static final e f48443t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f48428b = linearInterpolator;
        f48429c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f48430f = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f48431g = h.i(new bs(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f48432i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        bs bsVar = bs.h;
        f48433j = h.i(bsVar, 0, 320, 560, false);
        f48434k = h.i(bsVar, 40, 320, 560, false);
        f48435l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f48436m = h.i(bsVar, 0, 460, 560, false);
        f48437n = h.i(bsVar, 0, 325, 560, false);
        f48438o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f48439p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f48440q = h.i(bsVar, 60, 320, 560, false);
        f48441r = h.i(bsVar, 90, 380, 560, false);
        f48442s = h.i(bsVar, 110, 440, 560, false);
        f48443t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
