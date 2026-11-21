package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f60563a;
    public final e f60564b;

    public c(e eVar, int i7) {
        this.f60563a = i7;
        this.f60564b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f60563a) {
            case 0:
                e eVar = this.f60564b;
                if (eVar.f60584j.isEmpty()) {
                    eVar.f60583i = true;
                    e.f60576n = null;
                    d dVar = eVar.f60581f;
                    if (dVar != null) {
                        dVar.f60565a = false;
                        eVar.f60581f = null;
                    }
                    eVar.d.removeView(eVar.f60580e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f60564b.f60584j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
