package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f60522a;
    public final e f60523b;

    public c(e eVar, int i7) {
        this.f60522a = i7;
        this.f60523b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f60522a) {
            case 0:
                e eVar = this.f60523b;
                if (eVar.f60543j.isEmpty()) {
                    eVar.f60542i = true;
                    e.f60535n = null;
                    d dVar = eVar.f60540f;
                    if (dVar != null) {
                        dVar.f60524a = false;
                        eVar.f60540f = null;
                    }
                    eVar.d.removeView(eVar.f60539e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f60523b.f60543j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
