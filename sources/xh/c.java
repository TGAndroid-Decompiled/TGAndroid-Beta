package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f60521a;
    public final e f60522b;

    public c(e eVar, int i7) {
        this.f60521a = i7;
        this.f60522b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f60521a) {
            case 0:
                e eVar = this.f60522b;
                if (eVar.f60542j.isEmpty()) {
                    eVar.f60541i = true;
                    e.f60534n = null;
                    d dVar = eVar.f60539f;
                    if (dVar != null) {
                        dVar.f60523a = false;
                        eVar.f60539f = null;
                    }
                    eVar.d.removeView(eVar.f60538e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f60522b.f60542j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
