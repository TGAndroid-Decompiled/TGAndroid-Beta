package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.qr;
public abstract class f {
    public static final DecelerateInterpolator f44090a = new DecelerateInterpolator();
    public static final LinearInterpolator f44091b;
    public static final e f44092c;
    public static final e d;
    public static final e e;
    public static final e f44093f;
    public static final e f44094g;
    public static final e h;
    public static final e f44095i;
    public static final e f44096j;
    public static final e f44097k;
    public static final e f44098l;
    public static final e f44099m;
    public static final e f44100n;
    public static final e f44101o;
    public static final e f44102p;
    public static final e f44103q;
    public static final e f44104r;
    public static final e f44105s;
    public static final e f44106t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f44091b = linearInterpolator;
        f44092c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f44093f = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f44094g = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f44095i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        qr qrVar = qr.h;
        f44096j = h.i(qrVar, 0, 320, 560, false);
        f44097k = h.i(qrVar, 40, 320, 560, false);
        f44098l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f44099m = h.i(qrVar, 0, 460, 560, false);
        f44100n = h.i(qrVar, 0, 325, 560, false);
        f44101o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f44102p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f44103q = h.i(qrVar, 60, 320, 560, false);
        f44104r = h.i(qrVar, 90, 380, 560, false);
        f44105s = h.i(qrVar, 110, 440, 560, false);
        f44106t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
