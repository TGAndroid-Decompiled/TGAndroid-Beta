package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f47637a;
    public final f f47638b;

    public d(f fVar, int i10) {
        this.f47637a = i10;
        this.f47638b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f47637a) {
            case 0:
                f fVar = this.f47638b;
                if (fVar.f47656j.isEmpty()) {
                    fVar.f47655i = true;
                    f.f47649n = null;
                    e eVar = fVar.f47653f;
                    if (eVar != null) {
                        eVar.f47639a = false;
                        fVar.f47653f = null;
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
                ArrayList arrayList = this.f47638b.f47656j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
