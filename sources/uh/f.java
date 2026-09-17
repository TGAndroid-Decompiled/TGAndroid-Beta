package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.qr;
public abstract class f {
    public static final DecelerateInterpolator f43790a = new DecelerateInterpolator();
    public static final LinearInterpolator f43791b;
    public static final e f43792c;
    public static final e d;
    public static final e e;
    public static final e f43793f;
    public static final e f43794g;
    public static final e h;
    public static final e f43795i;
    public static final e f43796j;
    public static final e f43797k;
    public static final e f43798l;
    public static final e f43799m;
    public static final e f43800n;
    public static final e f43801o;
    public static final e f43802p;
    public static final e f43803q;
    public static final e f43804r;
    public static final e f43805s;
    public static final e f43806t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f43791b = linearInterpolator;
        f43792c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f43793f = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f43794g = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f43795i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        qr qrVar = qr.h;
        f43796j = h.i(qrVar, 0, 320, 560, false);
        f43797k = h.i(qrVar, 40, 320, 560, false);
        f43798l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f43799m = h.i(qrVar, 0, 460, 560, false);
        f43800n = h.i(qrVar, 0, 325, 560, false);
        f43801o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f43802p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f43803q = h.i(qrVar, 60, 320, 560, false);
        f43804r = h.i(qrVar, 90, 380, 560, false);
        f43805s = h.i(qrVar, 110, 440, 560, false);
        f43806t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
