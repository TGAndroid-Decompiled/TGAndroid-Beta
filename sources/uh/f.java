package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.rr;
public abstract class f {
    public static final DecelerateInterpolator f44054a = new DecelerateInterpolator();
    public static final LinearInterpolator f44055b;
    public static final e f44056c;
    public static final e d;
    public static final e e;
    public static final e f44057f;
    public static final e f44058g;
    public static final e h;
    public static final e f44059i;
    public static final e f44060j;
    public static final e f44061k;
    public static final e f44062l;
    public static final e f44063m;
    public static final e f44064n;
    public static final e f44065o;
    public static final e f44066p;
    public static final e f44067q;
    public static final e f44068r;
    public static final e f44069s;
    public static final e f44070t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f44055b = linearInterpolator;
        f44056c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f44057f = h.i(new rr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f44058g = h.i(new rr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f44059i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        rr rrVar = rr.h;
        f44060j = h.i(rrVar, 0, 320, 560, false);
        f44061k = h.i(rrVar, 40, 320, 560, false);
        f44062l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f44063m = h.i(rrVar, 0, 460, 560, false);
        f44064n = h.i(rrVar, 0, 325, 560, false);
        f44065o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f44066p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f44067q = h.i(rrVar, 60, 320, 560, false);
        f44068r = h.i(rrVar, 90, 380, 560, false);
        f44069s = h.i(rrVar, 110, 440, 560, false);
        f44070t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
