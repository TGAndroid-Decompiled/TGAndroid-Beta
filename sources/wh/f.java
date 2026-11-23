package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.nr;
public abstract class f {
    public static final DecelerateInterpolator f59935a = new DecelerateInterpolator();
    public static final LinearInterpolator f59936b;
    public static final e f59937c;
    public static final e d;
    public static final e f59938e;
    public static final e f59939f;
    public static final e f59940g;
    public static final e h;
    public static final e f59941i;
    public static final e f59942j;
    public static final e f59943k;
    public static final e f59944l;
    public static final e f59945m;
    public static final e f59946n;
    public static final e f59947o;
    public static final e f59948p;
    public static final e f59949q;
    public static final e f59950r;
    public static final e f59951s;
    public static final e f59952t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f59936b = linearInterpolator;
        f59937c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f59938e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f59939f = h.i(new nr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f59940g = h.i(new nr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f59941i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        nr nrVar = nr.h;
        f59942j = h.i(nrVar, 0, 320, 560, false);
        f59943k = h.i(nrVar, 40, 320, 560, false);
        f59944l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f59945m = h.i(nrVar, 0, 460, 560, false);
        f59946n = h.i(nrVar, 0, 325, 560, false);
        f59947o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f59948p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f59949q = h.i(nrVar, 60, 320, 560, false);
        f59950r = h.i(nrVar, 90, 380, 560, false);
        f59951s = h.i(nrVar, 110, 440, 560, false);
        f59952t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
