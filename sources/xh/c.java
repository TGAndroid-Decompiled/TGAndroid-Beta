package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f60650a;
    public final e f60651b;

    public c(e eVar, int i7) {
        this.f60650a = i7;
        this.f60651b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f60650a) {
            case 0:
                e eVar = this.f60651b;
                if (eVar.f60671j.isEmpty()) {
                    eVar.f60670i = true;
                    e.f60663n = null;
                    d dVar = eVar.f60668f;
                    if (dVar != null) {
                        dVar.f60652a = false;
                        eVar.f60668f = null;
                    }
                    eVar.d.removeView(eVar.f60667e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f60651b.f60671j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
