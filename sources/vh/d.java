package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44403a;
    public final g f44404b;

    public d(g gVar, int i10) {
        this.f44403a = i10;
        this.f44404b = gVar;
    }

    @Override
    public final void run() {
        switch (this.f44403a) {
            case 0:
                g gVar = this.f44404b;
                if (gVar.f44423j.isEmpty()) {
                    gVar.f44422i = true;
                    g.f44416n = null;
                    f fVar = gVar.f44420f;
                    if (fVar != null) {
                        fVar.f44406a = false;
                        gVar.f44420f = null;
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
                ArrayList arrayList = this.f44404b.f44423j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
