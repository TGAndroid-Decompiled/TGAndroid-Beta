package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f60532a;
    public final e f60533b;

    public c(e eVar, int i7) {
        this.f60532a = i7;
        this.f60533b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f60532a) {
            case 0:
                e eVar = this.f60533b;
                if (eVar.f60553j.isEmpty()) {
                    eVar.f60552i = true;
                    e.f60545n = null;
                    d dVar = eVar.f60550f;
                    if (dVar != null) {
                        dVar.f60534a = false;
                        eVar.f60550f = null;
                    }
                    eVar.d.removeView(eVar.f60549e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f60533b.f60553j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
