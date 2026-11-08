package rh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.b0;
import r0.i0;
public final class g implements Runnable {
    public final int f54543a;
    public final h f54544b;

    public g(h hVar, int i7) {
        this.f54543a = i7;
        this.f54544b = hVar;
    }

    @Override
    public final void run() {
        int i7 = this.f54543a;
        h hVar = this.f54544b;
        switch (i7) {
            case 0:
                if (hVar.f54553w != 0) {
                    hVar.i(false);
                    return;
                }
                return;
            default:
                int i10 = hVar.G - 1;
                hVar.G = i10;
                if (i10 == 0) {
                    View view = hVar.E;
                    RectF rectF = d.f54539e;
                    WeakHashMap weakHashMap = i0.f54190a;
                    hVar.k(d.e1(b0.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
