package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f58645a;
    public final e f58646b;

    public c(e eVar, int i7) {
        this.f58645a = i7;
        this.f58646b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f58645a) {
            case 0:
                e eVar = this.f58646b;
                if (eVar.f58666j.isEmpty()) {
                    eVar.f58665i = true;
                    e.f58658n = null;
                    d dVar = eVar.f58663f;
                    if (dVar != null) {
                        dVar.f58647a = false;
                        eVar.f58663f = null;
                    }
                    eVar.d.removeView(eVar.f58662e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f58646b.f58666j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
