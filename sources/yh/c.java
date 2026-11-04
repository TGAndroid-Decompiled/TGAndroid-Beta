package yh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f59482a;
    public final e f59483b;

    public c(e eVar, int i3) {
        this.f59482a = i3;
        this.f59483b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f59482a) {
            case 0:
                e eVar = this.f59483b;
                if (eVar.f59503j.isEmpty()) {
                    eVar.f59502i = true;
                    e.f59495n = null;
                    d dVar = eVar.f59500f;
                    if (dVar != null) {
                        dVar.f59484a = false;
                        eVar.f59500f = null;
                    }
                    eVar.d.removeView(eVar.f59499e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f59483b.f59503j;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((View) arrayList.get(i3)).invalidate();
                }
                return;
        }
    }
}
