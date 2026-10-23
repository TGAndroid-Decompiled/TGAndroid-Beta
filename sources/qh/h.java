package qh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.b0;
import r0.i0;
public final class h implements Runnable {
    public final int f44738a;
    public final i f44739b;

    public h(i iVar, int i10) {
        this.f44738a = i10;
        this.f44739b = iVar;
    }

    @Override
    public final void run() {
        int i10 = this.f44738a;
        i iVar = this.f44739b;
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
                    WeakHashMap weakHashMap = i0.f44830a;
                    iVar.l(e.e1(b0.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
