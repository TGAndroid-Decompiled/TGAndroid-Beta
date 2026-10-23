package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49033a;
    public final f f49034b;

    public d(f fVar, int i10) {
        this.f49033a = i10;
        this.f49034b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49033a) {
            case 0:
                f fVar = this.f49034b;
                if (fVar.f49052j.isEmpty()) {
                    fVar.f49051i = true;
                    f.f49045n = null;
                    e eVar = fVar.f49049f;
                    if (eVar != null) {
                        eVar.f49035a = false;
                        fVar.f49049f = null;
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
                ArrayList arrayList = this.f49034b.f49052j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
