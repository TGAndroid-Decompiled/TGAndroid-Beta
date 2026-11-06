package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.xq;
public abstract class f {
    public static final DecelerateInterpolator f57756a = new DecelerateInterpolator();
    public static final LinearInterpolator f57757b;
    public static final e f57758c;
    public static final e d;
    public static final e f57759e;
    public static final e f57760f;
    public static final e f57761g;
    public static final e h;
    public static final e f57762i;
    public static final e f57763j;
    public static final e f57764k;
    public static final e f57765l;
    public static final e f57766m;
    public static final e f57767n;
    public static final e f57768o;
    public static final e f57769p;
    public static final e f57770q;
    public static final e f57771r;
    public static final e f57772s;
    public static final e f57773t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f57757b = linearInterpolator;
        f57758c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f57759e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f57760f = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f57761g = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f57762i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        xq xqVar = xq.h;
        f57763j = h.i(xqVar, 0, 320, 560, false);
        f57764k = h.i(xqVar, 40, 320, 560, false);
        f57765l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f57766m = h.i(xqVar, 0, 460, 560, false);
        f57767n = h.i(xqVar, 0, 325, 560, false);
        f57768o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f57769p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f57770q = h.i(xqVar, 60, 320, 560, false);
        f57771r = h.i(xqVar, 90, 380, 560, false);
        f57772s = h.i(xqVar, 110, 440, 560, false);
        f57773t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
