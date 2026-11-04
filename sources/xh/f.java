package xh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.xq;
public abstract class f {
    public static final DecelerateInterpolator f58824a = new DecelerateInterpolator();
    public static final LinearInterpolator f58825b;
    public static final e f58826c;
    public static final e d;
    public static final e f58827e;
    public static final e f58828f;
    public static final e f58829g;
    public static final e h;
    public static final e f58830i;
    public static final e f58831j;
    public static final e f58832k;
    public static final e f58833l;
    public static final e f58834m;
    public static final e f58835n;
    public static final e f58836o;
    public static final e f58837p;
    public static final e f58838q;
    public static final e f58839r;
    public static final e f58840s;
    public static final e f58841t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f58825b = linearInterpolator;
        f58826c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f58827e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f58828f = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f58829g = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f58830i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        xq xqVar = xq.h;
        f58831j = h.i(xqVar, 0, 320, 560, false);
        f58832k = h.i(xqVar, 40, 320, 560, false);
        f58833l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f58834m = h.i(xqVar, 0, 460, 560, false);
        f58835n = h.i(xqVar, 0, 325, 560, false);
        f58836o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f58837p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f58838q = h.i(xqVar, 60, 320, 560, false);
        f58839r = h.i(xqVar, 90, 380, 560, false);
        f58840s = h.i(xqVar, 110, 440, 560, false);
        f58841t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
