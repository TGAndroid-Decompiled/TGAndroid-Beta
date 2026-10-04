package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f48366a;
    public final f f48367b;

    public d(f fVar, int i10) {
        this.f48366a = i10;
        this.f48367b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f48366a) {
            case 0:
                f fVar = this.f48367b;
                if (fVar.f48387j.isEmpty()) {
                    fVar.f48386i = true;
                    f.f48379n = null;
                    e eVar = fVar.f48384f;
                    if (eVar != null) {
                        eVar.f48368a = false;
                        fVar.f48384f = null;
                    }
                    fVar.d.removeView(fVar.f48383e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f48367b.f48387j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
