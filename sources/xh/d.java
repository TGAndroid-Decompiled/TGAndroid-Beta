package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f51895a;
    public final f f51896b;

    public d(f fVar, int i10) {
        this.f51895a = i10;
        this.f51896b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f51895a) {
            case 0:
                f fVar = this.f51896b;
                if (fVar.f51914j.isEmpty()) {
                    fVar.f51913i = true;
                    f.f51907n = null;
                    e eVar = fVar.f51911f;
                    if (eVar != null) {
                        eVar.f51897a = false;
                        fVar.f51911f = null;
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
                ArrayList arrayList = this.f51896b.f51914j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
