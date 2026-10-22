package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49032a;
    public final f f49033b;

    public d(f fVar, int i10) {
        this.f49032a = i10;
        this.f49033b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49032a) {
            case 0:
                f fVar = this.f49033b;
                if (fVar.f49051j.isEmpty()) {
                    fVar.f49050i = true;
                    f.f49044n = null;
                    e eVar = fVar.f49048f;
                    if (eVar != null) {
                        eVar.f49034a = false;
                        fVar.f49048f = null;
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
                ArrayList arrayList = this.f49033b.f49051j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
