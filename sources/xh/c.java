package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f58670a;
    public final e f58671b;

    public c(e eVar, int i7) {
        this.f58670a = i7;
        this.f58671b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f58670a) {
            case 0:
                e eVar = this.f58671b;
                if (eVar.f58691j.isEmpty()) {
                    eVar.f58690i = true;
                    e.f58683n = null;
                    d dVar = eVar.f58688f;
                    if (dVar != null) {
                        dVar.f58672a = false;
                        eVar.f58688f = null;
                    }
                    eVar.d.removeView(eVar.f58687e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f58671b.f58691j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
