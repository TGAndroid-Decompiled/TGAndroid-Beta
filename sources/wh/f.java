package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.nr;
public abstract class f {
    public static final DecelerateInterpolator f59931a = new DecelerateInterpolator();
    public static final LinearInterpolator f59932b;
    public static final e f59933c;
    public static final e d;
    public static final e f59934e;
    public static final e f59935f;
    public static final e f59936g;
    public static final e h;
    public static final e f59937i;
    public static final e f59938j;
    public static final e f59939k;
    public static final e f59940l;
    public static final e f59941m;
    public static final e f59942n;
    public static final e f59943o;
    public static final e f59944p;
    public static final e f59945q;
    public static final e f59946r;
    public static final e f59947s;
    public static final e f59948t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f59932b = linearInterpolator;
        f59933c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f59934e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f59935f = h.i(new nr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f59936g = h.i(new nr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f59937i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        nr nrVar = nr.h;
        f59938j = h.i(nrVar, 0, 320, 560, false);
        f59939k = h.i(nrVar, 40, 320, 560, false);
        f59940l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f59941m = h.i(nrVar, 0, 460, 560, false);
        f59942n = h.i(nrVar, 0, 325, 560, false);
        f59943o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f59944p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f59945q = h.i(nrVar, 60, 320, 560, false);
        f59946r = h.i(nrVar, 90, 380, 560, false);
        f59947s = h.i(nrVar, 110, 440, 560, false);
        f59948t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
