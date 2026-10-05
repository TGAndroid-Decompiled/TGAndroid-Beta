package tf;

import ai.n4;
import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import li.h;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f46954a;
    public final View f46955b;

    public a(int i10, View view) {
        this.f46954a = i10;
        this.f46955b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f46954a) {
            case 0:
                n4 n4Var = (n4) this.f46955b;
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
                ((x) this.f46955b).f51034e.incrementAndGet();
                return;
        }
    }
}
