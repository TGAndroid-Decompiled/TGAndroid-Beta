package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.is;
public abstract class f {
    public static final DecelerateInterpolator f49096a = new DecelerateInterpolator();
    public static final LinearInterpolator f49097b;
    public static final e f49098c;
    public static final e d;
    public static final e f49099e;
    public static final e f49100f;
    public static final e f49101g;
    public static final e h;
    public static final e f49102i;
    public static final e f49103j;
    public static final e f49104k;
    public static final e f49105l;
    public static final e f49106m;
    public static final e f49107n;
    public static final e f49108o;
    public static final e f49109p;
    public static final e f49110q;
    public static final e f49111r;
    public static final e f49112s;
    public static final e f49113t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f49097b = linearInterpolator;
        f49098c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f49099e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f49100f = h.i(new is(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f49101g = h.i(new is(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f49102i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        is isVar = is.h;
        f49103j = h.i(isVar, 0, 320, 560, false);
        f49104k = h.i(isVar, 40, 320, 560, false);
        f49105l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f49106m = h.i(isVar, 0, 460, 560, false);
        f49107n = h.i(isVar, 0, 325, 560, false);
        f49108o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f49109p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f49110q = h.i(isVar, 60, 320, 560, false);
        f49111r = h.i(isVar, 90, 380, 560, false);
        f49112s = h.i(isVar, 110, 440, 560, false);
        f49113t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
