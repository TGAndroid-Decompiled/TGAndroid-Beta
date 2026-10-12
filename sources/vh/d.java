package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49883a;
    public final f f49884b;

    public d(f fVar, int i10) {
        this.f49883a = i10;
        this.f49884b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49883a) {
            case 0:
                f fVar = this.f49884b;
                if (fVar.f49904j.isEmpty()) {
                    fVar.f49903i = true;
                    f.f49896n = null;
                    e eVar = fVar.f49901f;
                    if (eVar != null) {
                        eVar.f49885a = false;
                        fVar.f49901f = null;
                    }
                    fVar.d.removeView(fVar.f49900e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f49884b.f49904j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
