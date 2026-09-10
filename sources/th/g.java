package th;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.wr;
public abstract class g {
    public static final DecelerateInterpolator f42204a = new DecelerateInterpolator();
    public static final LinearInterpolator f42205b;
    public static final f f42206c;
    public static final f d;
    public static final f e;
    public static final f f42207f;
    public static final f f42208g;
    public static final f h;
    public static final f f42209i;
    public static final f f42210j;
    public static final f f42211k;
    public static final f f42212l;
    public static final f f42213m;
    public static final f f42214n;
    public static final f f42215o;
    public static final f f42216p;
    public static final f f42217q;
    public static final f f42218r;
    public static final f f42219s;
    public static final f f42220t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        f42205b = linearInterpolator;
        f42206c = i.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = i.i(linearInterpolator, 0, 240, 240, false);
        e = i.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f42207f = i.i(new wr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        f42208g = i.i(new wr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = i.i(new DecelerateInterpolator(), 0, 150, 560, false);
        f42209i = i.i(new DecelerateInterpolator(), 210, 425, 560, false);
        wr wrVar = wr.h;
        f42210j = i.i(wrVar, 0, 320, 560, false);
        f42211k = i.i(wrVar, 40, 320, 560, false);
        f42212l = i.i(new DecelerateInterpolator(), 0, 250, 560, false);
        f42213m = i.i(wrVar, 0, 460, 560, false);
        f42214n = i.i(wrVar, 0, 325, 560, false);
        f42215o = i.i(new DecelerateInterpolator(), 150, 250, 560, false);
        f42216p = i.i(new DecelerateInterpolator(), 200, 480, 560, false);
        f42217q = i.i(wrVar, 60, 320, 560, false);
        f42218r = i.i(wrVar, 90, 380, 560, false);
        f42219s = i.i(wrVar, 110, 440, 560, false);
        f42220t = i.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
