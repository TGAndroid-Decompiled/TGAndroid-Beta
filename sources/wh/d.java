package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f48617a;
    public final g f48618b;

    public d(g gVar, int i10) {
        this.f48617a = i10;
        this.f48618b = gVar;
    }

    @Override
    public final void run() {
        switch (this.f48617a) {
            case 0:
                g gVar = this.f48618b;
                if (gVar.f48639j.isEmpty()) {
                    gVar.f48638i = true;
                    g.f48631n = null;
                    f fVar = gVar.f48636f;
                    if (fVar != null) {
                        fVar.f48620a = false;
                        gVar.f48636f = null;
                    }
                    gVar.d.removeView(gVar.f48635e);
                    if (gVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) gVar.d.getParent()).removeView(gVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f48618b.f48639j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
