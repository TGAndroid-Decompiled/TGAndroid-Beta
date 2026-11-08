package wh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.xq;
public abstract class f {
    public static final DecelerateInterpolator f57873a = new DecelerateInterpolator();
    public static final LinearInterpolator f57874b;
    public static final e f57875c;
    public static final e d;
    public static final e f57876e;
    public static final e f57877f;
    public static final e f57878g;
    public static final e h;
    public static final e f57879i;
    public static final e f57880j;
    public static final e f57881k;
    public static final e f57882l;
    public static final e f57883m;
    public static final e f57884n;
    public static final e f57885o;
    public static final e f57886p;
    public static final e f57887q;
    public static final e f57888r;
    public static final e f57889s;
    public static final e f57890t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f57874b = linearInterpolator;
        f57875c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f57876e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f57877f = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f57878g = h.i(new xq(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f57879i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        xq xqVar = xq.h;
        f57880j = h.i(xqVar, 0, 320, 560, false);
        f57881k = h.i(xqVar, 40, 320, 560, false);
        f57882l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f57883m = h.i(xqVar, 0, 460, 560, false);
        f57884n = h.i(xqVar, 0, 325, 560, false);
        f57885o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f57886p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f57887q = h.i(xqVar, 60, 320, 560, false);
        f57888r = h.i(xqVar, 90, 380, 560, false);
        f57889s = h.i(xqVar, 110, 440, 560, false);
        f57890t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
