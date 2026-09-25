package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44662a;
    public final f f44663b;

    public d(f fVar, int i10) {
        this.f44662a = i10;
        this.f44663b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f44662a) {
            case 0:
                f fVar = this.f44663b;
                if (fVar.f44681j.isEmpty()) {
                    fVar.f44680i = true;
                    f.f44674n = null;
                    e eVar = fVar.f44678f;
                    if (eVar != null) {
                        eVar.f44664a = false;
                        fVar.f44678f = null;
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
                ArrayList arrayList = this.f44663b.f44681j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
