package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44677a;
    public final g f44678b;

    public d(g gVar, int i10) {
        this.f44677a = i10;
        this.f44678b = gVar;
    }

    @Override
    public final void run() {
        switch (this.f44677a) {
            case 0:
                g gVar = this.f44678b;
                if (gVar.f44697j.isEmpty()) {
                    gVar.f44696i = true;
                    g.f44690n = null;
                    f fVar = gVar.f44694f;
                    if (fVar != null) {
                        fVar.f44680a = false;
                        gVar.f44694f = null;
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
                ArrayList arrayList = this.f44678b.f44697j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
