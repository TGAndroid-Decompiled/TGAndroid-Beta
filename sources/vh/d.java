package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44699a;
    public final f f44700b;

    public d(f fVar, int i10) {
        this.f44699a = i10;
        this.f44700b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f44699a) {
            case 0:
                f fVar = this.f44700b;
                if (fVar.f44718j.isEmpty()) {
                    fVar.f44717i = true;
                    f.f44711n = null;
                    e eVar = fVar.f44715f;
                    if (eVar != null) {
                        eVar.f44701a = false;
                        fVar.f44715f = null;
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
                ArrayList arrayList = this.f44700b.f44718j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
