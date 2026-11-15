package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f59956a;
    public final e f59957b;

    public c(e eVar, int i7) {
        this.f59956a = i7;
        this.f59957b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f59956a) {
            case 0:
                e eVar = this.f59957b;
                if (eVar.f59977j.isEmpty()) {
                    eVar.f59976i = true;
                    e.f59969n = null;
                    d dVar = eVar.f59974f;
                    if (dVar != null) {
                        dVar.f59958a = false;
                        eVar.f59974f = null;
                    }
                    eVar.d.removeView(eVar.f59973e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f59957b.f59977j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
