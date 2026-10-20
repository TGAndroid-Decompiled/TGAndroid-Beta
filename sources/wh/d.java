package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49029a;
    public final f f49030b;

    public d(f fVar, int i10) {
        this.f49029a = i10;
        this.f49030b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49029a) {
            case 0:
                f fVar = this.f49030b;
                if (fVar.f49048j.isEmpty()) {
                    fVar.f49047i = true;
                    f.f49041n = null;
                    e eVar = fVar.f49045f;
                    if (eVar != null) {
                        eVar.f49031a = false;
                        fVar.f49045f = null;
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
                ArrayList arrayList = this.f49030b.f49048j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
