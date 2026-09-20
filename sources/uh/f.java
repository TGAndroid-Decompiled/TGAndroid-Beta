package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.qr;
public abstract class f {
    public static final DecelerateInterpolator f44069a = new DecelerateInterpolator();
    public static final LinearInterpolator f44070b;
    public static final e f44071c;
    public static final e d;
    public static final e e;
    public static final e f44072f;
    public static final e f44073g;
    public static final e h;
    public static final e f44074i;
    public static final e f44075j;
    public static final e f44076k;
    public static final e f44077l;
    public static final e f44078m;
    public static final e f44079n;
    public static final e f44080o;
    public static final e f44081p;
    public static final e f44082q;
    public static final e f44083r;
    public static final e f44084s;
    public static final e f44085t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f44070b = linearInterpolator;
        f44071c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f44072f = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f44073g = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f44074i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        qr qrVar = qr.h;
        f44075j = h.i(qrVar, 0, 320, 560, false);
        f44076k = h.i(qrVar, 40, 320, 560, false);
        f44077l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f44078m = h.i(qrVar, 0, 460, 560, false);
        f44079n = h.i(qrVar, 0, 325, 560, false);
        f44080o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f44081p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f44082q = h.i(qrVar, 60, 320, 560, false);
        f44083r = h.i(qrVar, 90, 380, 560, false);
        f44084s = h.i(qrVar, 110, 440, 560, false);
        f44085t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
