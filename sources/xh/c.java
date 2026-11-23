package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f60567a;
    public final e f60568b;

    public c(e eVar, int i7) {
        this.f60567a = i7;
        this.f60568b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f60567a) {
            case 0:
                e eVar = this.f60568b;
                if (eVar.f60588j.isEmpty()) {
                    eVar.f60587i = true;
                    e.f60580n = null;
                    d dVar = eVar.f60585f;
                    if (dVar != null) {
                        dVar.f60569a = false;
                        eVar.f60585f = null;
                    }
                    eVar.d.removeView(eVar.f60584e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f60568b.f60588j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
