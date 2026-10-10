package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49699a;
    public final f f49700b;

    public d(f fVar, int i10) {
        this.f49699a = i10;
        this.f49700b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49699a) {
            case 0:
                f fVar = this.f49700b;
                if (fVar.f49720j.isEmpty()) {
                    fVar.f49719i = true;
                    f.f49712n = null;
                    e eVar = fVar.f49717f;
                    if (eVar != null) {
                        eVar.f49701a = false;
                        fVar.f49717f = null;
                    }
                    fVar.d.removeView(fVar.f49716e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f49700b.f49720j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
