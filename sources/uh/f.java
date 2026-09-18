package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.qr;
public abstract class f {
    public static final DecelerateInterpolator f44025a = new DecelerateInterpolator();
    public static final LinearInterpolator f44026b;
    public static final e f44027c;
    public static final e d;
    public static final e e;
    public static final e f44028f;
    public static final e f44029g;
    public static final e h;
    public static final e f44030i;
    public static final e f44031j;
    public static final e f44032k;
    public static final e f44033l;
    public static final e f44034m;
    public static final e f44035n;
    public static final e f44036o;
    public static final e f44037p;
    public static final e f44038q;
    public static final e f44039r;
    public static final e f44040s;
    public static final e f44041t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f44026b = linearInterpolator;
        f44027c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f44028f = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f44029g = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f44030i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        qr qrVar = qr.h;
        f44031j = h.i(qrVar, 0, 320, 560, false);
        f44032k = h.i(qrVar, 40, 320, 560, false);
        f44033l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f44034m = h.i(qrVar, 0, 460, 560, false);
        f44035n = h.i(qrVar, 0, 325, 560, false);
        f44036o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f44037p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f44038q = h.i(qrVar, 60, 320, 560, false);
        f44039r = h.i(qrVar, 90, 380, 560, false);
        f44040s = h.i(qrVar, 110, 440, 560, false);
        f44041t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
