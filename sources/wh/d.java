package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49045a;
    public final f f49046b;

    public d(f fVar, int i10) {
        this.f49045a = i10;
        this.f49046b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49045a) {
            case 0:
                f fVar = this.f49046b;
                if (fVar.f49064j.isEmpty()) {
                    fVar.f49063i = true;
                    f.f49057n = null;
                    e eVar = fVar.f49061f;
                    if (eVar != null) {
                        eVar.f49047a = false;
                        fVar.f49061f = null;
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
                ArrayList arrayList = this.f49046b.f49064j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
