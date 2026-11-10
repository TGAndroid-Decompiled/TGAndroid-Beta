package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.wq;
public abstract class f {
    public static final DecelerateInterpolator f57889a = new DecelerateInterpolator();
    public static final LinearInterpolator f57890b;
    public static final e f57891c;
    public static final e d;
    public static final e f57892e;
    public static final e f57893f;
    public static final e f57894g;
    public static final e h;
    public static final e f57895i;
    public static final e f57896j;
    public static final e f57897k;
    public static final e f57898l;
    public static final e f57899m;
    public static final e f57900n;
    public static final e f57901o;
    public static final e f57902p;
    public static final e f57903q;
    public static final e f57904r;
    public static final e f57905s;
    public static final e f57906t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f57890b = linearInterpolator;
        f57891c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f57892e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f57893f = h.i(new wq(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f57894g = h.i(new wq(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f57895i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        wq wqVar = wq.h;
        f57896j = h.i(wqVar, 0, 320, 560, false);
        f57897k = h.i(wqVar, 40, 320, 560, false);
        f57898l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f57899m = h.i(wqVar, 0, 460, 560, false);
        f57900n = h.i(wqVar, 0, 325, 560, false);
        f57901o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f57902p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f57903q = h.i(wqVar, 60, 320, 560, false);
        f57904r = h.i(wqVar, 90, 380, 560, false);
        f57905s = h.i(wqVar, 110, 440, 560, false);
        f57906t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
