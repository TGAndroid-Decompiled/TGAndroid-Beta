package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49023a;
    public final f f49024b;

    public d(f fVar, int i10) {
        this.f49023a = i10;
        this.f49024b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49023a) {
            case 0:
                f fVar = this.f49024b;
                if (fVar.f49042j.isEmpty()) {
                    fVar.f49041i = true;
                    f.f49035n = null;
                    e eVar = fVar.f49039f;
                    if (eVar != null) {
                        eVar.f49025a = false;
                        fVar.f49039f = null;
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
                ArrayList arrayList = this.f49024b.f49042j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
