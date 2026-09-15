package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.qr;
public abstract class f {
    public static final DecelerateInterpolator f43767a = new DecelerateInterpolator();
    public static final LinearInterpolator f43768b;
    public static final e f43769c;
    public static final e d;
    public static final e e;
    public static final e f43770f;
    public static final e f43771g;
    public static final e h;
    public static final e f43772i;
    public static final e f43773j;
    public static final e f43774k;
    public static final e f43775l;
    public static final e f43776m;
    public static final e f43777n;
    public static final e f43778o;
    public static final e f43779p;
    public static final e f43780q;
    public static final e f43781r;
    public static final e f43782s;
    public static final e f43783t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f43768b = linearInterpolator;
        f43769c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f43770f = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f43771g = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f43772i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        qr qrVar = qr.h;
        f43773j = h.i(qrVar, 0, 320, 560, false);
        f43774k = h.i(qrVar, 40, 320, 560, false);
        f43775l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f43776m = h.i(qrVar, 0, 460, 560, false);
        f43777n = h.i(qrVar, 0, 325, 560, false);
        f43778o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f43779p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f43780q = h.i(qrVar, 60, 320, 560, false);
        f43781r = h.i(qrVar, 90, 380, 560, false);
        f43782s = h.i(qrVar, 110, 440, 560, false);
        f43783t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
