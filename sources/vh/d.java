package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49891a;
    public final f f49892b;

    public d(f fVar, int i10) {
        this.f49891a = i10;
        this.f49892b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49891a) {
            case 0:
                f fVar = this.f49892b;
                if (fVar.f49912j.isEmpty()) {
                    fVar.f49911i = true;
                    f.f49904n = null;
                    e eVar = fVar.f49909f;
                    if (eVar != null) {
                        eVar.f49893a = false;
                        fVar.f49909f = null;
                    }
                    fVar.d.removeView(fVar.f49908e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f49892b.f49912j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
