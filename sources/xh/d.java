package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f51834a;
    public final f f51835b;

    public d(f fVar, int i10) {
        this.f51834a = i10;
        this.f51835b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f51834a) {
            case 0:
                f fVar = this.f51835b;
                if (fVar.f51853j.isEmpty()) {
                    fVar.f51852i = true;
                    f.f51846n = null;
                    e eVar = fVar.f51850f;
                    if (eVar != null) {
                        eVar.f51836a = false;
                        fVar.f51850f = null;
                    }
                    fVar.d.removeView(fVar.e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f51835b.f51853j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
