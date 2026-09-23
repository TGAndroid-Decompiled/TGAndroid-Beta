package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44330a;
    public final g f44331b;

    public d(g gVar, int i10) {
        this.f44330a = i10;
        this.f44331b = gVar;
    }

    @Override
    public final void run() {
        switch (this.f44330a) {
            case 0:
                g gVar = this.f44331b;
                if (gVar.f44350j.isEmpty()) {
                    gVar.f44349i = true;
                    g.f44343n = null;
                    f fVar = gVar.f44347f;
                    if (fVar != null) {
                        fVar.f44333a = false;
                        gVar.f44347f = null;
                    }
                    gVar.d.removeView(gVar.e);
                    if (gVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) gVar.d.getParent()).removeView(gVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f44331b.f44350j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
