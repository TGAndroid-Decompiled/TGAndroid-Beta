package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.qr;
public abstract class f {
    public static final DecelerateInterpolator f43795a = new DecelerateInterpolator();
    public static final LinearInterpolator f43796b;
    public static final e f43797c;
    public static final e d;
    public static final e e;
    public static final e f43798f;
    public static final e f43799g;
    public static final e h;
    public static final e f43800i;
    public static final e f43801j;
    public static final e f43802k;
    public static final e f43803l;
    public static final e f43804m;
    public static final e f43805n;
    public static final e f43806o;
    public static final e f43807p;
    public static final e f43808q;
    public static final e f43809r;
    public static final e f43810s;
    public static final e f43811t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f43796b = linearInterpolator;
        f43797c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f43798f = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f43799g = h.i(new qr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f43800i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        qr qrVar = qr.h;
        f43801j = h.i(qrVar, 0, 320, 560, false);
        f43802k = h.i(qrVar, 40, 320, 560, false);
        f43803l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f43804m = h.i(qrVar, 0, 460, 560, false);
        f43805n = h.i(qrVar, 0, 325, 560, false);
        f43806o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f43807p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f43808q = h.i(qrVar, 60, 320, 560, false);
        f43809r = h.i(qrVar, 90, 380, 560, false);
        f43810s = h.i(qrVar, 110, 440, 560, false);
        f43811t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
