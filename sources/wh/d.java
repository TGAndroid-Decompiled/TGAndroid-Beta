package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49024a;
    public final f f49025b;

    public d(f fVar, int i10) {
        this.f49024a = i10;
        this.f49025b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49024a) {
            case 0:
                f fVar = this.f49025b;
                if (fVar.f49043j.isEmpty()) {
                    fVar.f49042i = true;
                    f.f49036n = null;
                    e eVar = fVar.f49040f;
                    if (eVar != null) {
                        eVar.f49026a = false;
                        fVar.f49040f = null;
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
                ArrayList arrayList = this.f49025b.f49043j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
