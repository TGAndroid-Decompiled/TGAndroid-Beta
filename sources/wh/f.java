package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.kr;
public abstract class f {
    public static final DecelerateInterpolator f60018a = new DecelerateInterpolator();
    public static final LinearInterpolator f60019b;
    public static final e f60020c;
    public static final e d;
    public static final e f60021e;
    public static final e f60022f;
    public static final e f60023g;
    public static final e h;
    public static final e f60024i;
    public static final e f60025j;
    public static final e f60026k;
    public static final e f60027l;
    public static final e f60028m;
    public static final e f60029n;
    public static final e f60030o;
    public static final e f60031p;
    public static final e f60032q;
    public static final e f60033r;
    public static final e f60034s;
    public static final e f60035t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f60019b = linearInterpolator;
        f60020c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f60021e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f60022f = h.i(new kr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f60023g = h.i(new kr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f60024i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        kr krVar = kr.h;
        f60025j = h.i(krVar, 0, 320, 560, false);
        f60026k = h.i(krVar, 40, 320, 560, false);
        f60027l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f60028m = h.i(krVar, 0, 460, 560, false);
        f60029n = h.i(krVar, 0, 325, 560, false);
        f60030o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f60031p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f60032q = h.i(krVar, 60, 320, 560, false);
        f60033r = h.i(krVar, 90, 380, 560, false);
        f60034s = h.i(krVar, 110, 440, 560, false);
        f60035t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
