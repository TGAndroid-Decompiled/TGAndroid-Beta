package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44661a;
    public final f f44662b;

    public d(f fVar, int i10) {
        this.f44661a = i10;
        this.f44662b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f44661a) {
            case 0:
                f fVar = this.f44662b;
                if (fVar.f44680j.isEmpty()) {
                    fVar.f44679i = true;
                    f.f44673n = null;
                    e eVar = fVar.f44677f;
                    if (eVar != null) {
                        eVar.f44663a = false;
                        fVar.f44677f = null;
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
                ArrayList arrayList = this.f44662b.f44680j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
