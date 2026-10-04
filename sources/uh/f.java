package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.tr;
public abstract class f {
    public static final DecelerateInterpolator f47702a = new DecelerateInterpolator();
    public static final LinearInterpolator f47703b;
    public static final e f47704c;
    public static final e d;
    public static final e f47705e;
    public static final e f47706f;
    public static final e f47707g;
    public static final e h;
    public static final e f47708i;
    public static final e f47709j;
    public static final e f47710k;
    public static final e f47711l;
    public static final e f47712m;
    public static final e f47713n;
    public static final e f47714o;
    public static final e f47715p;
    public static final e f47716q;
    public static final e f47717r;
    public static final e f47718s;
    public static final e f47719t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f47703b = linearInterpolator;
        f47704c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f47705e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f47706f = h.i(new tr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f47707g = h.i(new tr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f47708i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        tr trVar = tr.h;
        f47709j = h.i(trVar, 0, 320, 560, false);
        f47710k = h.i(trVar, 40, 320, 560, false);
        f47711l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f47712m = h.i(trVar, 0, 460, 560, false);
        f47713n = h.i(trVar, 0, 325, 560, false);
        f47714o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f47715p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f47716q = h.i(trVar, 60, 320, 560, false);
        f47717r = h.i(trVar, 90, 380, 560, false);
        f47718s = h.i(trVar, 110, 440, 560, false);
        f47719t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
