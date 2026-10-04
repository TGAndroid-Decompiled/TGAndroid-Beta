package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f48358a;
    public final f f48359b;

    public d(f fVar, int i10) {
        this.f48358a = i10;
        this.f48359b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f48358a) {
            case 0:
                f fVar = this.f48359b;
                if (fVar.f48379j.isEmpty()) {
                    fVar.f48378i = true;
                    f.f48371n = null;
                    e eVar = fVar.f48376f;
                    if (eVar != null) {
                        eVar.f48360a = false;
                        fVar.f48376f = null;
                    }
                    fVar.d.removeView(fVar.f48375e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f48359b.f48379j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
