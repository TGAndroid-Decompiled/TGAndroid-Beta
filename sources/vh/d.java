package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44376a;
    public final g f44377b;

    public d(g gVar, int i10) {
        this.f44376a = i10;
        this.f44377b = gVar;
    }

    @Override
    public final void run() {
        switch (this.f44376a) {
            case 0:
                g gVar = this.f44377b;
                if (gVar.f44396j.isEmpty()) {
                    gVar.f44395i = true;
                    g.f44389n = null;
                    f fVar = gVar.f44393f;
                    if (fVar != null) {
                        fVar.f44379a = false;
                        gVar.f44393f = null;
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
                ArrayList arrayList = this.f44377b.f44396j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
