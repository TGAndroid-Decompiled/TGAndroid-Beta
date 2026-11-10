package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f58772a;
    public final e f58773b;

    public c(e eVar, int i7) {
        this.f58772a = i7;
        this.f58773b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f58772a) {
            case 0:
                e eVar = this.f58773b;
                if (eVar.f58793j.isEmpty()) {
                    eVar.f58792i = true;
                    e.f58785n = null;
                    d dVar = eVar.f58790f;
                    if (dVar != null) {
                        dVar.f58774a = false;
                        eVar.f58790f = null;
                    }
                    eVar.d.removeView(eVar.f58789e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f58773b.f58793j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
