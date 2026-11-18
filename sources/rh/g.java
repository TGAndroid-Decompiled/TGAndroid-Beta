package rh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.b0;
import r0.i0;
public final class g implements Runnable {
    public final int f56601a;
    public final h f56602b;

    public g(h hVar, int i7) {
        this.f56601a = i7;
        this.f56602b = hVar;
    }

    @Override
    public final void run() {
        int i7 = this.f56601a;
        h hVar = this.f56602b;
        switch (i7) {
            case 0:
                if (hVar.f56611w != 0) {
                    hVar.i(false);
                    return;
                }
                return;
            default:
                int i10 = hVar.H - 1;
                hVar.H = i10;
                if (i10 == 0) {
                    View view = hVar.F;
                    RectF rectF = d.f56597e;
                    WeakHashMap weakHashMap = i0.f56244a;
                    hVar.k(d.e1(b0.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
