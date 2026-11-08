package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f58765a;
    public final e f58766b;

    public c(e eVar, int i7) {
        this.f58765a = i7;
        this.f58766b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f58765a) {
            case 0:
                e eVar = this.f58766b;
                if (eVar.f58786j.isEmpty()) {
                    eVar.f58785i = true;
                    e.f58778n = null;
                    d dVar = eVar.f58783f;
                    if (dVar != null) {
                        dVar.f58767a = false;
                        eVar.f58783f = null;
                    }
                    eVar.d.removeView(eVar.f58782e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f58766b.f58786j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
