package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49475a;
    public final f f49476b;

    public d(f fVar, int i10) {
        this.f49475a = i10;
        this.f49476b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49475a) {
            case 0:
                f fVar = this.f49476b;
                if (fVar.f49494j.isEmpty()) {
                    fVar.f49493i = true;
                    f.f49487n = null;
                    e eVar = fVar.f49491f;
                    if (eVar != null) {
                        eVar.f49477a = false;
                        fVar.f49491f = null;
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
                ArrayList arrayList = this.f49476b.f49494j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
