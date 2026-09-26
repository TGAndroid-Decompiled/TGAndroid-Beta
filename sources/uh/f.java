package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.sr;
public abstract class f {
    public static final DecelerateInterpolator f44052a = new DecelerateInterpolator();
    public static final LinearInterpolator f44053b;
    public static final e f44054c;
    public static final e d;
    public static final e e;
    public static final e f44055f;
    public static final e f44056g;
    public static final e h;
    public static final e f44057i;
    public static final e f44058j;
    public static final e f44059k;
    public static final e f44060l;
    public static final e f44061m;
    public static final e f44062n;
    public static final e f44063o;
    public static final e f44064p;
    public static final e f44065q;
    public static final e f44066r;
    public static final e f44067s;
    public static final e f44068t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f44053b = linearInterpolator;
        f44054c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f44055f = h.i(new sr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f44056g = h.i(new sr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f44057i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        sr srVar = sr.h;
        f44058j = h.i(srVar, 0, 320, 560, false);
        f44059k = h.i(srVar, 40, 320, 560, false);
        f44060l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f44061m = h.i(srVar, 0, 460, 560, false);
        f44062n = h.i(srVar, 0, 325, 560, false);
        f44063o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f44064p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f44065q = h.i(srVar, 60, 320, 560, false);
        f44066r = h.i(srVar, 90, 380, 560, false);
        f44067s = h.i(srVar, 110, 440, 560, false);
        f44068t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
