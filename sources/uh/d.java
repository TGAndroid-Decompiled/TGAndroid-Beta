package uh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f42748a;
    public final g f42749b;

    public d(g gVar, int i10) {
        this.f42748a = i10;
        this.f42749b = gVar;
    }

    @Override
    public final void run() {
        switch (this.f42748a) {
            case 0:
                g gVar = this.f42749b;
                if (gVar.f42768j.isEmpty()) {
                    gVar.f42767i = true;
                    g.f42761n = null;
                    f fVar = gVar.f42765f;
                    if (fVar != null) {
                        fVar.f42751a = false;
                        gVar.f42765f = null;
                    }
                    gVar.d.removeView(gVar.e);
                    if (gVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) gVar.d.getParent()).removeView(gVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f42749b.f42768j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
