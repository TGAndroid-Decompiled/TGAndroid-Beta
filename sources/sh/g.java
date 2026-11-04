package sh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.b0;
import r0.i0;
public final class g implements Runnable {
    public final int f54727a;
    public final h f54728b;

    public g(h hVar, int i3) {
        this.f54727a = i3;
        this.f54728b = hVar;
    }

    @Override
    public final void run() {
        int i3 = this.f54727a;
        h hVar = this.f54728b;
        switch (i3) {
            case 0:
                if (hVar.f54737w != 0) {
                    hVar.i(false);
                    return;
                }
                return;
            default:
                int i10 = hVar.H - 1;
                hVar.H = i10;
                if (i10 == 0) {
                    View view = hVar.F;
                    RectF rectF = d.f54723e;
                    WeakHashMap weakHashMap = i0.f54015a;
                    hVar.k(d.e1(b0.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
