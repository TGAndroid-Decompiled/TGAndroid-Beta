package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f58669a;
    public final e f58670b;

    public c(e eVar, int i7) {
        this.f58669a = i7;
        this.f58670b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f58669a) {
            case 0:
                e eVar = this.f58670b;
                if (eVar.f58690j.isEmpty()) {
                    eVar.f58689i = true;
                    e.f58682n = null;
                    d dVar = eVar.f58687f;
                    if (dVar != null) {
                        dVar.f58671a = false;
                        eVar.f58687f = null;
                    }
                    eVar.d.removeView(eVar.f58686e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f58670b.f58690j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
