package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f48616a;
    public final g f48617b;

    public d(g gVar, int i10) {
        this.f48616a = i10;
        this.f48617b = gVar;
    }

    @Override
    public final void run() {
        switch (this.f48616a) {
            case 0:
                g gVar = this.f48617b;
                if (gVar.f48638j.isEmpty()) {
                    gVar.f48637i = true;
                    g.f48630n = null;
                    f fVar = gVar.f48635f;
                    if (fVar != null) {
                        fVar.f48619a = false;
                        gVar.f48635f = null;
                    }
                    gVar.d.removeView(gVar.f48634e);
                    if (gVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) gVar.d.getParent()).removeView(gVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f48617b.f48638j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
