package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class c implements Runnable {
    public final int f58764a;
    public final e f58765b;

    public c(e eVar, int i7) {
        this.f58764a = i7;
        this.f58765b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f58764a) {
            case 0:
                e eVar = this.f58765b;
                if (eVar.f58785j.isEmpty()) {
                    eVar.f58784i = true;
                    e.f58777n = null;
                    d dVar = eVar.f58782f;
                    if (dVar != null) {
                        dVar.f58766a = false;
                        eVar.f58782f = null;
                    }
                    eVar.d.removeView(eVar.f58781e);
                    if (eVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) eVar.d.getParent()).removeView(eVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f58765b.f58785j;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                return;
        }
    }
}
