package rh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.b0;
import r0.i0;
public final class g implements Runnable {
    public final int f54544a;
    public final h f54545b;

    public g(h hVar, int i7) {
        this.f54544a = i7;
        this.f54545b = hVar;
    }

    @Override
    public final void run() {
        int i7 = this.f54544a;
        h hVar = this.f54545b;
        switch (i7) {
            case 0:
                if (hVar.f54554w != 0) {
                    hVar.i(false);
                    return;
                }
                return;
            default:
                int i10 = hVar.G - 1;
                hVar.G = i10;
                if (i10 == 0) {
                    View view = hVar.E;
                    RectF rectF = d.f54540e;
                    WeakHashMap weakHashMap = i0.f54191a;
                    hVar.k(d.e1(b0.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
