package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f47636a;
    public final f f47637b;

    public d(f fVar, int i10) {
        this.f47636a = i10;
        this.f47637b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f47636a) {
            case 0:
                f fVar = this.f47637b;
                if (fVar.f47655j.isEmpty()) {
                    fVar.f47654i = true;
                    f.f47648n = null;
                    e eVar = fVar.f47652f;
                    if (eVar != null) {
                        eVar.f47638a = false;
                        fVar.f47652f = null;
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
                ArrayList arrayList = this.f47637b.f47655j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
