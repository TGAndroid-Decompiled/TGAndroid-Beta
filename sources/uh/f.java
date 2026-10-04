package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.tr;
public abstract class f {
    public static final DecelerateInterpolator f47710a = new DecelerateInterpolator();
    public static final LinearInterpolator f47711b;
    public static final e f47712c;
    public static final e d;
    public static final e f47713e;
    public static final e f47714f;
    public static final e f47715g;
    public static final e h;
    public static final e f47716i;
    public static final e f47717j;
    public static final e f47718k;
    public static final e f47719l;
    public static final e f47720m;
    public static final e f47721n;
    public static final e f47722o;
    public static final e f47723p;
    public static final e f47724q;
    public static final e f47725r;
    public static final e f47726s;
    public static final e f47727t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f47711b = linearInterpolator;
        f47712c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f47713e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f47714f = h.i(new tr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f47715g = h.i(new tr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f47716i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        tr trVar = tr.h;
        f47717j = h.i(trVar, 0, 320, 560, false);
        f47718k = h.i(trVar, 40, 320, 560, false);
        f47719l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f47720m = h.i(trVar, 0, 460, 560, false);
        f47721n = h.i(trVar, 0, 325, 560, false);
        f47722o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f47723p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f47724q = h.i(trVar, 60, 320, 560, false);
        f47725r = h.i(trVar, 90, 380, 560, false);
        f47726s = h.i(trVar, 110, 440, 560, false);
        f47727t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
