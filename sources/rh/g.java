package rh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.b0;
import r0.i0;
public final class g implements Runnable {
    public final int f54556a;
    public final h f54557b;

    public g(h hVar, int i7) {
        this.f54556a = i7;
        this.f54557b = hVar;
    }

    @Override
    public final void run() {
        int i7 = this.f54556a;
        h hVar = this.f54557b;
        switch (i7) {
            case 0:
                if (hVar.f54566w != 0) {
                    hVar.i(false);
                    return;
                }
                return;
            default:
                int i10 = hVar.G - 1;
                hVar.G = i10;
                if (i10 == 0) {
                    View view = hVar.E;
                    RectF rectF = d.f54552e;
                    WeakHashMap weakHashMap = i0.f54203a;
                    hVar.k(d.e1(b0.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
