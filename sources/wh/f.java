package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.ds;
public abstract class f {
    public static final DecelerateInterpolator f51287a = new DecelerateInterpolator();
    public static final LinearInterpolator f51288b;
    public static final e f51289c;
    public static final e d;
    public static final e e;
    public static final e f51290f;
    public static final e f51291g;
    public static final e h;
    public static final e f51292i;
    public static final e f51293j;
    public static final e f51294k;
    public static final e f51295l;
    public static final e f51296m;
    public static final e f51297n;
    public static final e f51298o;
    public static final e f51299p;
    public static final e f51300q;
    public static final e f51301r;
    public static final e f51302s;
    public static final e f51303t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f51288b = linearInterpolator;
        f51289c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f51290f = h.i(new ds(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f51291g = h.i(new ds(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f51292i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        ds dsVar = ds.h;
        f51293j = h.i(dsVar, 0, 320, 560, false);
        f51294k = h.i(dsVar, 40, 320, 560, false);
        f51295l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f51296m = h.i(dsVar, 0, 460, 560, false);
        f51297n = h.i(dsVar, 0, 325, 560, false);
        f51298o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f51299p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f51300q = h.i(dsVar, 60, 320, 560, false);
        f51301r = h.i(dsVar, 90, 380, 560, false);
        f51302s = h.i(dsVar, 110, 440, 560, false);
        f51303t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
