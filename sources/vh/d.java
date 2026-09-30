package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44663a;
    public final f f44664b;

    public d(f fVar, int i10) {
        this.f44663a = i10;
        this.f44664b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f44663a) {
            case 0:
                f fVar = this.f44664b;
                if (fVar.f44682j.isEmpty()) {
                    fVar.f44681i = true;
                    f.f44675n = null;
                    e eVar = fVar.f44679f;
                    if (eVar != null) {
                        eVar.f44665a = false;
                        fVar.f44679f = null;
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
                ArrayList arrayList = this.f44664b.f44682j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
