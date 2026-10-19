package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49022a;
    public final f f49023b;

    public d(f fVar, int i10) {
        this.f49022a = i10;
        this.f49023b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49022a) {
            case 0:
                f fVar = this.f49023b;
                if (fVar.f49041j.isEmpty()) {
                    fVar.f49040i = true;
                    f.f49034n = null;
                    e eVar = fVar.f49038f;
                    if (eVar != null) {
                        eVar.f49024a = false;
                        fVar.f49038f = null;
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
                ArrayList arrayList = this.f49023b.f49041j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
