package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f48587a;
    public final g f48588b;

    public d(g gVar, int i10) {
        this.f48587a = i10;
        this.f48588b = gVar;
    }

    @Override
    public final void run() {
        switch (this.f48587a) {
            case 0:
                g gVar = this.f48588b;
                if (gVar.f48609j.isEmpty()) {
                    gVar.f48608i = true;
                    g.f48601n = null;
                    f fVar = gVar.f48606f;
                    if (fVar != null) {
                        fVar.f48590a = false;
                        gVar.f48606f = null;
                    }
                    gVar.d.removeView(gVar.f48605e);
                    if (gVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) gVar.d.getParent()).removeView(gVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f48588b.f48609j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
