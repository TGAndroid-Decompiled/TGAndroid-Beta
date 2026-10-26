package xh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f51837a;
    public final f f51838b;

    public d(f fVar, int i10) {
        this.f51837a = i10;
        this.f51838b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f51837a) {
            case 0:
                f fVar = this.f51838b;
                if (fVar.f51856j.isEmpty()) {
                    fVar.f51855i = true;
                    f.f51849n = null;
                    e eVar = fVar.f51853f;
                    if (eVar != null) {
                        eVar.f51839a = false;
                        fVar.f51853f = null;
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
                ArrayList arrayList = this.f51838b.f51856j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
