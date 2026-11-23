package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.nr;
public abstract class f {
    public static final DecelerateInterpolator f59900a = new DecelerateInterpolator();
    public static final LinearInterpolator f59901b;
    public static final e f59902c;
    public static final e d;
    public static final e f59903e;
    public static final e f59904f;
    public static final e f59905g;
    public static final e h;
    public static final e f59906i;
    public static final e f59907j;
    public static final e f59908k;
    public static final e f59909l;
    public static final e f59910m;
    public static final e f59911n;
    public static final e f59912o;
    public static final e f59913p;
    public static final e f59914q;
    public static final e f59915r;
    public static final e f59916s;
    public static final e f59917t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f59901b = linearInterpolator;
        f59902c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f59903e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f59904f = h.i(new nr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f59905g = h.i(new nr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f59906i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        nr nrVar = nr.h;
        f59907j = h.i(nrVar, 0, 320, 560, false);
        f59908k = h.i(nrVar, 40, 320, 560, false);
        f59909l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f59910m = h.i(nrVar, 0, 460, 560, false);
        f59911n = h.i(nrVar, 0, 325, 560, false);
        f59912o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f59913p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f59914q = h.i(nrVar, 60, 320, 560, false);
        f59915r = h.i(nrVar, 90, 380, 560, false);
        f59916s = h.i(nrVar, 110, 440, 560, false);
        f59917t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
