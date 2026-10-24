package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.zr;
public abstract class f {
    public static final DecelerateInterpolator f48853a = new DecelerateInterpolator();
    public static final LinearInterpolator f48854b;
    public static final e f48855c;
    public static final e d;
    public static final e e;
    public static final e f48856f;
    public static final e f48857g;
    public static final e h;
    public static final e f48858i;
    public static final e f48859j;
    public static final e f48860k;
    public static final e f48861l;
    public static final e f48862m;
    public static final e f48863n;
    public static final e f48864o;
    public static final e f48865p;
    public static final e f48866q;
    public static final e f48867r;
    public static final e f48868s;
    public static final e f48869t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f48854b = linearInterpolator;
        f48855c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f48856f = h.i(new zr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f48857g = h.i(new zr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f48858i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        zr zrVar = zr.h;
        f48859j = h.i(zrVar, 0, 320, 560, false);
        f48860k = h.i(zrVar, 40, 320, 560, false);
        f48861l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f48862m = h.i(zrVar, 0, 460, 560, false);
        f48863n = h.i(zrVar, 0, 325, 560, false);
        f48864o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f48865p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f48866q = h.i(zrVar, 60, 320, 560, false);
        f48867r = h.i(zrVar, 90, 380, 560, false);
        f48868s = h.i(zrVar, 110, 440, 560, false);
        f48869t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
