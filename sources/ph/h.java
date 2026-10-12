package ph;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.b0;
import r0.i0;
public final class h implements Runnable {
    public final int f45751a;
    public final i f45752b;

    public h(i iVar, int i10) {
        this.f45751a = i10;
        this.f45752b = iVar;
    }

    @Override
    public final void run() {
        int i10 = this.f45751a;
        i iVar = this.f45752b;
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
                    RectF rectF = e.f45747e;
                    WeakHashMap weakHashMap = i0.f46981a;
                    iVar.l(e.b1(b0.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
