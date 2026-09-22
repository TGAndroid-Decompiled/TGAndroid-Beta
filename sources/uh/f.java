package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.qr;
public abstract class f {
    public static final DecelerateInterpolator f43763a = new DecelerateInterpolator();
    public static final LinearInterpolator f43764b;
    public static final e f43765c;
    public static final e d;
    public static final e e;
    public static final e f43766f;
    public static final e f43767g;
    public static final e h;
    public static final e f43768i;
    public static final e f43769j;
    public static final e f43770k;
    public static final e f43771l;
    public static final e f43772m;
    public static final e f43773n;
    public static final e f43774o;
    public static final e f43775p;
    public static final e f43776q;
    public static final e f43777r;
    public static final e f43778s;
    public static final e f43779t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f43764b = linearInterpolator;
        f43765c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f43766f = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f43767g = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f43768i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        qr qrVar = qr.h;
        f43769j = h.i(qrVar, 0, 320, 560, false);
        f43770k = h.i(qrVar, 40, 320, 560, false);
        f43771l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f43772m = h.i(qrVar, 0, 460, 560, false);
        f43773n = h.i(qrVar, 0, 325, 560, false);
        f43774o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f43775p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f43776q = h.i(qrVar, 60, 320, 560, false);
        f43777r = h.i(qrVar, 90, 380, 560, false);
        f43778s = h.i(qrVar, 110, 440, 560, false);
        f43779t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
