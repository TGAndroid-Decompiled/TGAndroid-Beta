package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49474a;
    public final f f49475b;

    public d(f fVar, int i10) {
        this.f49474a = i10;
        this.f49475b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49474a) {
            case 0:
                f fVar = this.f49475b;
                if (fVar.f49493j.isEmpty()) {
                    fVar.f49492i = true;
                    f.f49486n = null;
                    e eVar = fVar.f49490f;
                    if (eVar != null) {
                        eVar.f49476a = false;
                        fVar.f49490f = null;
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
                ArrayList arrayList = this.f49475b.f49493j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
