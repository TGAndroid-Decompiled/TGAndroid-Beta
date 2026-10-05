package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.tr;
public abstract class f {
    public static final DecelerateInterpolator f47717a = new DecelerateInterpolator();
    public static final LinearInterpolator f47718b;
    public static final e f47719c;
    public static final e d;
    public static final e f47720e;
    public static final e f47721f;
    public static final e f47722g;
    public static final e h;
    public static final e f47723i;
    public static final e f47724j;
    public static final e f47725k;
    public static final e f47726l;
    public static final e f47727m;
    public static final e f47728n;
    public static final e f47729o;
    public static final e f47730p;
    public static final e f47731q;
    public static final e f47732r;
    public static final e f47733s;
    public static final e f47734t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f47718b = linearInterpolator;
        f47719c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f47720e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f47721f = h.i(new tr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f47722g = h.i(new tr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f47723i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        tr trVar = tr.h;
        f47724j = h.i(trVar, 0, 320, 560, false);
        f47725k = h.i(trVar, 40, 320, 560, false);
        f47726l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f47727m = h.i(trVar, 0, 460, 560, false);
        f47728n = h.i(trVar, 0, 325, 560, false);
        f47729o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f47730p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f47731q = h.i(trVar, 60, 320, 560, false);
        f47732r = h.i(trVar, 90, 380, 560, false);
        f47733s = h.i(trVar, 110, 440, 560, false);
        f47734t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
