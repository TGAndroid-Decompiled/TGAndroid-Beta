package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.tr;
public abstract class f {
    public static final DecelerateInterpolator f47701a = new DecelerateInterpolator();
    public static final LinearInterpolator f47702b;
    public static final e f47703c;
    public static final e d;
    public static final e f47704e;
    public static final e f47705f;
    public static final e f47706g;
    public static final e h;
    public static final e f47707i;
    public static final e f47708j;
    public static final e f47709k;
    public static final e f47710l;
    public static final e f47711m;
    public static final e f47712n;
    public static final e f47713o;
    public static final e f47714p;
    public static final e f47715q;
    public static final e f47716r;
    public static final e f47717s;
    public static final e f47718t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f47702b = linearInterpolator;
        f47703c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f47704e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f47705f = h.i(new tr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f47706g = h.i(new tr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f47707i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        tr trVar = tr.h;
        f47708j = h.i(trVar, 0, 320, 560, false);
        f47709k = h.i(trVar, 40, 320, 560, false);
        f47710l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f47711m = h.i(trVar, 0, 460, 560, false);
        f47712n = h.i(trVar, 0, 325, 560, false);
        f47713o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f47714p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f47715q = h.i(trVar, 60, 320, 560, false);
        f47716r = h.i(trVar, 90, 380, 560, false);
        f47717s = h.i(trVar, 110, 440, 560, false);
        f47718t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
