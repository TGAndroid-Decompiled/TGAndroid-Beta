package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.js;
public abstract class f {
    public static final DecelerateInterpolator f49211a = new DecelerateInterpolator();
    public static final LinearInterpolator f49212b;
    public static final e f49213c;
    public static final e d;
    public static final e f49214e;
    public static final e f49215f;
    public static final e f49216g;
    public static final e h;
    public static final e f49217i;
    public static final e f49218j;
    public static final e f49219k;
    public static final e f49220l;
    public static final e f49221m;
    public static final e f49222n;
    public static final e f49223o;
    public static final e f49224p;
    public static final e f49225q;
    public static final e f49226r;
    public static final e f49227s;
    public static final e f49228t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f49212b = linearInterpolator;
        f49213c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f49214e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f49215f = h.i(new js(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f49216g = h.i(new js(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f49217i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        js jsVar = js.h;
        f49218j = h.i(jsVar, 0, 320, 560, false);
        f49219k = h.i(jsVar, 40, 320, 560, false);
        f49220l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f49221m = h.i(jsVar, 0, 460, 560, false);
        f49222n = h.i(jsVar, 0, 325, 560, false);
        f49223o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f49224p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f49225q = h.i(jsVar, 60, 320, 560, false);
        f49226r = h.i(jsVar, 90, 380, 560, false);
        f49227s = h.i(jsVar, 110, 440, 560, false);
        f49228t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
