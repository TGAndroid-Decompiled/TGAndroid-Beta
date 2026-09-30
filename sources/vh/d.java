package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f44769a;
    public final f f44770b;

    public d(f fVar, int i10) {
        this.f44769a = i10;
        this.f44770b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f44769a) {
            case 0:
                f fVar = this.f44770b;
                if (fVar.f44788j.isEmpty()) {
                    fVar.f44787i = true;
                    f.f44781n = null;
                    e eVar = fVar.f44785f;
                    if (eVar != null) {
                        eVar.f44771a = false;
                        fVar.f44785f = null;
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
                ArrayList arrayList = this.f44770b.f44788j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
