package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44647a;
    public final f f44648b;

    public d(f fVar, int i10) {
        this.f44647a = i10;
        this.f44648b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f44647a) {
            case 0:
                f fVar = this.f44648b;
                if (fVar.f44666j.isEmpty()) {
                    fVar.f44665i = true;
                    f.f44659n = null;
                    e eVar = fVar.f44663f;
                    if (eVar != null) {
                        eVar.f44649a = false;
                        fVar.f44663f = null;
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
                ArrayList arrayList = this.f44648b.f44666j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
