package uh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.js;
public abstract class f {
    public static final DecelerateInterpolator f49203a = new DecelerateInterpolator();
    public static final LinearInterpolator f49204b;
    public static final e f49205c;
    public static final e d;
    public static final e f49206e;
    public static final e f49207f;
    public static final e f49208g;
    public static final e h;
    public static final e f49209i;
    public static final e f49210j;
    public static final e f49211k;
    public static final e f49212l;
    public static final e f49213m;
    public static final e f49214n;
    public static final e f49215o;
    public static final e f49216p;
    public static final e f49217q;
    public static final e f49218r;
    public static final e f49219s;
    public static final e f49220t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f49204b = linearInterpolator;
        f49205c = h.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = h.i(linearInterpolator, 0, 240, 240, false);
        f49206e = h.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f49207f = h.i(new js(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f49208g = h.i(new js(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = h.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f49209i = h.i(new DecelerateInterpolator(), 210, 425, 560, false);
        js jsVar = js.h;
        f49210j = h.i(jsVar, 0, 320, 560, false);
        f49211k = h.i(jsVar, 40, 320, 560, false);
        f49212l = h.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f49213m = h.i(jsVar, 0, 460, 560, false);
        f49214n = h.i(jsVar, 0, 325, 560, false);
        f49215o = h.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f49216p = h.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f49217q = h.i(jsVar, 60, 320, 560, false);
        f49218r = h.i(jsVar, 90, 380, 560, false);
        f49219s = h.i(jsVar, 110, 440, 560, false);
        f49220t = h.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
