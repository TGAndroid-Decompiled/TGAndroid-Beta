package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44380a;
    public final g f44381b;

    public d(g gVar, int i10) {
        this.f44380a = i10;
        this.f44381b = gVar;
    }

    @Override
    public final void run() {
        switch (this.f44380a) {
            case 0:
                g gVar = this.f44381b;
                if (gVar.f44400j.isEmpty()) {
                    gVar.f44399i = true;
                    g.f44393n = null;
                    f fVar = gVar.f44397f;
                    if (fVar != null) {
                        fVar.f44383a = false;
                        gVar.f44397f = null;
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
                ArrayList arrayList = this.f44381b.f44400j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
