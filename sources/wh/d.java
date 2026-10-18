package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d implements Runnable {
    public final int f49070a;
    public final f f49071b;

    public d(f fVar, int i10) {
        this.f49070a = i10;
        this.f49071b = fVar;
    }

    @Override
    public final void run() {
        switch (this.f49070a) {
            case 0:
                f fVar = this.f49071b;
                if (fVar.f49089j.isEmpty()) {
                    fVar.f49088i = true;
                    f.f49082n = null;
                    e eVar = fVar.f49086f;
                    if (eVar != null) {
                        eVar.f49072a = false;
                        fVar.f49086f = null;
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
                ArrayList arrayList = this.f49071b.f49089j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                return;
        }
    }
}
