package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f48373a;
    public final f f48374b;

    public d(f fVar, int i10) {
        this.f48373a = i10;
        this.f48374b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f48373a) {
            case 0:
                f fVar = this.f48374b;
                if (fVar.f48394j.isEmpty()) {
                    fVar.f48393i = true;
                    f.f48386n = null;
                    e eVar = fVar.f48391f;
                    if (eVar != null) {
                        eVar.f48375a = false;
                        fVar.f48391f = null;
                    }
                    fVar.d.removeView(fVar.f48390e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f48374b.f48394j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
