package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44633a;
    public final g f44634b;

    public d(g gVar, int i10) {
        this.f44633a = i10;
        this.f44634b = gVar;
    }

    @Override
    public final void run() {
        switch (this.f44633a) {
            case 0:
                g gVar = this.f44634b;
                if (gVar.f44653j.isEmpty()) {
                    gVar.f44652i = true;
                    g.f44646n = null;
                    f fVar = gVar.f44650f;
                    if (fVar != null) {
                        fVar.f44636a = false;
                        gVar.f44650f = null;
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
                ArrayList arrayList = this.f44634b.f44653j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
