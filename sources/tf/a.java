package tf;

import ai.n4;
import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import li.h;
import yf.x;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f46947a;
    public final View f46948b;

    public a(int i10, View view) {
        this.f46947a = i10;
        this.f46948b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f46947a) {
            case 0:
                n4 n4Var = (n4) this.f46948b;
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
                ((x) this.f46948b).f51027e.incrementAndGet();
                return;
        }
    }
}
