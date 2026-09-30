package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.sr;
public abstract class f {
    public static final DecelerateInterpolator f44055a = new DecelerateInterpolator();
    public static final LinearInterpolator f44056b;
    public static final e f44057c;
    public static final e d;
    public static final e e;
    public static final e f44058f;
    public static final e f44059g;
    public static final e h;
    public static final e f44060i;
    public static final e f44061j;
    public static final e f44062k;
    public static final e f44063l;
    public static final e f44064m;
    public static final e f44065n;
    public static final e f44066o;
    public static final e f44067p;
    public static final e f44068q;
    public static final e f44069r;
    public static final e f44070s;
    public static final e f44071t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f44056b = linearInterpolator;
        f44057c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f44058f = h.i(new sr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f44059g = h.i(new sr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f44060i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        sr srVar = sr.h;
        f44061j = h.i(srVar, 0, 320, 560, false);
        f44062k = h.i(srVar, 40, 320, 560, false);
        f44063l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f44064m = h.i(srVar, 0, 460, 560, false);
        f44065n = h.i(srVar, 0, 325, 560, false);
        f44066o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f44067p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f44068q = h.i(srVar, 60, 320, 560, false);
        f44069r = h.i(srVar, 90, 380, 560, false);
        f44070s = h.i(srVar, 110, 440, 560, false);
        f44071t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
