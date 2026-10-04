package tf;

import ai.n4;
import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import li.h;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f46940a;
    public final View f46941b;

    public a(int i10, View view) {
        this.f46940a = i10;
        this.f46941b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f46940a) {
            case 0:
                n4 n4Var = (n4) this.f46941b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((pe.b) n4Var.f1400b).iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    n4Var.forceLayout();
                }
            default:
                ((x) this.f46941b).f51021e.incrementAndGet();
                return;
        }
    }
}
