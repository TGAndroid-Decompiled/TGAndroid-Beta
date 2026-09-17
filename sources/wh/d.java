package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f48588a;
    public final g f48589b;

    public d(g gVar, int i10) {
        this.f48588a = i10;
        this.f48589b = gVar;
    }

    @Override
    public final void run() {
        switch (this.f48588a) {
            case 0:
                g gVar = this.f48589b;
                if (gVar.f48610j.isEmpty()) {
                    gVar.f48609i = true;
                    g.f48602n = null;
                    f fVar = gVar.f48607f;
                    if (fVar != null) {
                        fVar.f48591a = false;
                        gVar.f48607f = null;
                    }
                    gVar.d.removeView(gVar.f48606e);
                    if (gVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) gVar.d.getParent()).removeView(gVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f48589b.f48610j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
