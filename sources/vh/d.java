package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44408a;
    public final g f44409b;

    public d(g gVar, int i10) {
        this.f44408a = i10;
        this.f44409b = gVar;
    }

    @Override
    public final void run() {
        switch (this.f44408a) {
            case 0:
                g gVar = this.f44409b;
                if (gVar.f44428j.isEmpty()) {
                    gVar.f44427i = true;
                    g.f44421n = null;
                    f fVar = gVar.f44425f;
                    if (fVar != null) {
                        fVar.f44411a = false;
                        gVar.f44425f = null;
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
                ArrayList arrayList = this.f44409b.f44428j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
