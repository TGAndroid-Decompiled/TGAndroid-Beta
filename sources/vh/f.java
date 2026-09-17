package vh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.pr;
public abstract class f {
    public static final DecelerateInterpolator f47858a = new DecelerateInterpolator();
    public static final LinearInterpolator f47859b;
    public static final e f47860c;
    public static final e d;
    public static final e f47861e;
    public static final e f47862f;
    public static final e f47863g;
    public static final e h;
    public static final e f47864i;
    public static final e f47865j;
    public static final e f47866k;
    public static final e f47867l;
    public static final e f47868m;
    public static final e f47869n;
    public static final e f47870o;
    public static final e f47871p;
    public static final e f47872q;
    public static final e f47873r;
    public static final e f47874s;
    public static final e f47875t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f47859b = linearInterpolator;
        f47860c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f47861e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f47862f = h.i(new pr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f47863g = h.i(new pr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f47864i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        pr prVar = pr.h;
        f47865j = h.i(prVar, 0, 320, 560, false);
        f47866k = h.i(prVar, 40, 320, 560, false);
        f47867l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f47868m = h.i(prVar, 0, 460, 560, false);
        f47869n = h.i(prVar, 0, 325, 560, false);
        f47870o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f47871p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f47872q = h.i(prVar, 60, 320, 560, false);
        f47873r = h.i(prVar, 90, 380, 560, false);
        f47874s = h.i(prVar, 110, 440, 560, false);
        f47875t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
