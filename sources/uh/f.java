package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.sr;
public abstract class f {
    public static final DecelerateInterpolator f44099a = new DecelerateInterpolator();
    public static final LinearInterpolator f44100b;
    public static final e f44101c;
    public static final e d;
    public static final e e;
    public static final e f44102f;
    public static final e f44103g;
    public static final e h;
    public static final e f44104i;
    public static final e f44105j;
    public static final e f44106k;
    public static final e f44107l;
    public static final e f44108m;
    public static final e f44109n;
    public static final e f44110o;
    public static final e f44111p;
    public static final e f44112q;
    public static final e f44113r;
    public static final e f44114s;
    public static final e f44115t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f44100b = linearInterpolator;
        f44101c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f44102f = h.i(new sr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f44103g = h.i(new sr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f44104i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        sr srVar = sr.h;
        f44105j = h.i(srVar, 0, 320, 560, false);
        f44106k = h.i(srVar, 40, 320, 560, false);
        f44107l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f44108m = h.i(srVar, 0, 460, 560, false);
        f44109n = h.i(srVar, 0, 325, 560, false);
        f44110o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f44111p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f44112q = h.i(srVar, 60, 320, 560, false);
        f44113r = h.i(srVar, 90, 380, 560, false);
        f44114s = h.i(srVar, 110, 440, 560, false);
        f44115t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
