package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49742a;
    public final f f49743b;

    public d(f fVar, int i10) {
        this.f49742a = i10;
        this.f49743b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49742a) {
            case 0:
                f fVar = this.f49743b;
                if (fVar.f49763j.isEmpty()) {
                    fVar.f49762i = true;
                    f.f49755n = null;
                    e eVar = fVar.f49760f;
                    if (eVar != null) {
                        eVar.f49744a = false;
                        fVar.f49760f = null;
                    }
                    fVar.d.removeView(fVar.f49759e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList = this.f49743b.f49763j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
