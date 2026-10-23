package qh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.b0;
import r0.i0;
public final class h implements Runnable {
    public final int f45150a;
    public final i f45151b;

    public h(i iVar, int i10) {
        this.f45150a = i10;
        this.f45151b = iVar;
    }

    @Override
    public final void run() {
        int i10 = this.f45150a;
        i iVar = this.f45151b;
        switch (i10) {
            case 0:
                if (iVar.v != 0) {
                    iVar.i(false);
                    return;
                }
                return;
            default:
                int i11 = iVar.G - 1;
                iVar.G = i11;
                if (i11 == 0) {
                    View view = iVar.E;
                    RectF rectF = e.e;
                    WeakHashMap weakHashMap = i0.f45242a;
                    iVar.l(e.e1(b0.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
