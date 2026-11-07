package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f58675a;
    public final e f58676b;

    public c(e eVar, int i7) {
        this.f58675a = i7;
        this.f58676b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f58675a) {
            case 0:
                e eVar = this.f58676b;
                if (eVar.f58696j.isEmpty()) {
                    eVar.f58695i = true;
                    e.f58688n = null;
                    d dVar = eVar.f58693f;
                    if (dVar != null) {
                        dVar.f58677a = false;
                        eVar.f58693f = null;
                    }
                    eVar.d.removeView(eVar.f58692e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f58676b.f58696j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
