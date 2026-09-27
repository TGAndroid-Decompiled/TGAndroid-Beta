package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44707a;
    public final f f44708b;

    public d(f fVar, int i10) {
        this.f44707a = i10;
        this.f44708b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f44707a) {
            case 0:
                f fVar = this.f44708b;
                if (fVar.f44726j.isEmpty()) {
                    fVar.f44725i = true;
                    f.f44719n = null;
                    e eVar = fVar.f44723f;
                    if (eVar != null) {
                        eVar.f44709a = false;
                        fVar.f44723f = null;
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
                ArrayList arrayList = this.f44708b.f44726j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
