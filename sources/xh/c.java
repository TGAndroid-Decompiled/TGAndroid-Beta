package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f58774a;
    public final e f58775b;

    public c(e eVar, int i7) {
        this.f58774a = i7;
        this.f58775b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f58774a) {
            case 0:
                e eVar = this.f58775b;
                if (eVar.f58795j.isEmpty()) {
                    eVar.f58794i = true;
                    e.f58787n = null;
                    d dVar = eVar.f58792f;
                    if (dVar != null) {
                        dVar.f58776a = false;
                        eVar.f58792f = null;
                    }
                    eVar.d.removeView(eVar.f58791e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f58775b.f58795j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
