package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.es;
public abstract class f {
    public static final DecelerateInterpolator f47020a = new DecelerateInterpolator();
    public static final LinearInterpolator f47021b;
    public static final e f47022c;
    public static final e d;
    public static final e e;
    public static final e f47023f;
    public static final e f47024g;
    public static final e h;
    public static final e f47025i;
    public static final e f47026j;
    public static final e f47027k;
    public static final e f47028l;
    public static final e f47029m;
    public static final e f47030n;
    public static final e f47031o;
    public static final e f47032p;
    public static final e f47033q;
    public static final e f47034r;
    public static final e f47035s;
    public static final e f47036t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f47021b = linearInterpolator;
        f47022c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f47023f = h.i(new es(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f47024g = h.i(new es(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f47025i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        es esVar = es.h;
        f47026j = h.i(esVar, 0, 320, 560, false);
        f47027k = h.i(esVar, 40, 320, 560, false);
        f47028l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f47029m = h.i(esVar, 0, 460, 560, false);
        f47030n = h.i(esVar, 0, 325, 560, false);
        f47031o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f47032p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f47033q = h.i(esVar, 60, 320, 560, false);
        f47034r = h.i(esVar, 90, 380, 560, false);
        f47035s = h.i(esVar, 110, 440, 560, false);
        f47036t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
