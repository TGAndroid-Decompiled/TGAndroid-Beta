package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.pr;
public abstract class f {
    public static final DecelerateInterpolator f47857a = new DecelerateInterpolator();
    public static final LinearInterpolator f47858b;
    public static final e f47859c;
    public static final e d;
    public static final e f47860e;
    public static final e f47861f;
    public static final e f47862g;
    public static final e h;
    public static final e f47863i;
    public static final e f47864j;
    public static final e f47865k;
    public static final e f47866l;
    public static final e f47867m;
    public static final e f47868n;
    public static final e f47869o;
    public static final e f47870p;
    public static final e f47871q;
    public static final e f47872r;
    public static final e f47873s;
    public static final e f47874t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f47858b = linearInterpolator;
        f47859c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f47860e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f47861f = h.i(new pr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f47862g = h.i(new pr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f47863i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        pr prVar = pr.h;
        f47864j = h.i(prVar, 0, 320, 560, false);
        f47865k = h.i(prVar, 40, 320, 560, false);
        f47866l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f47867m = h.i(prVar, 0, 460, 560, false);
        f47868n = h.i(prVar, 0, 325, 560, false);
        f47869o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f47870p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f47871q = h.i(prVar, 60, 320, 560, false);
        f47872r = h.i(prVar, 90, 380, 560, false);
        f47873s = h.i(prVar, 110, 440, 560, false);
        f47874t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
